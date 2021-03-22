package coe318.lab7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sameh Ahmed
 */
public class UserMain implements UserInterface{
   //instance variables
   String userReading;
   private ArrayList<Circuit> circuit = new ArrayList<>();
   private static Scanner in = new Scanner(System.in);
   
  /*
   *method to start programs
   */
   public void start(){
       
       inputScreen();
       userInput();
   }
   
  /*
   *method that takes user input and inteprets it
   */   
public void userInput(){
     //infinite loop
       while(true){
           //takes user input
           userReading = in.nextLine();
        //if a voltage source is chosen 
           if(userReading.startsWith("v")||userReading.startsWith("V") )
                    {
                      // makes the spacing
                        String[] space = userReading.split(" ");
                        if(space.length == 4){
                        double voltage;
                        //converts the read voltage into a double 
                        voltage = Double.parseDouble(space[3]);
                        //creates node objects
                        Node n1 = new Node();
                        Node n2 = new Node();
                        //converts the nodes into integers from their string
                        n1.nodeIdnum = Integer.parseInt(space[1]);
                        n2.nodeIdnum = Integer.parseInt(space[2]);
                        //creates voltage source object with corresponding parameters
                        DCVoltageSource v = new DCVoltageSource(voltage, n1, n2);
                        //adds voltage source to list of sources
                        circuit.add(v);
                    }
                    }
                   /*
                   *if resistor is chosen
                   */
                    else if (userReading.startsWith("r")||userReading.startsWith("R"))
                    {
                       //spacing  
                       String[] space = userReading.split(" ");
                      //ensures that the user input corresponds with parameters
                       if(space.length == 4){
                       double resistance;
                       resistance = Double.parseDouble(space[3]);
                    //creates node objects
                       Node n1 = new Node();
                       Node n2 = new Node();
                       //converts nodes into strings
                       n1.nodeIdnum = Integer.parseInt(space[1]);
                       n2.nodeIdnum = Integer.parseInt(space[2]);
                        Resistor r = new Resistor(resistance, n1, n2);
                        circuit.add(r);                              
                    } }
           //terminates program
           if(userReading.equals("end")) 
            {
                end();
                //ends loop
                break;
            }
            else if(userReading.equals("spice"))
            {
                spice();
            }
             
            else 
            {
                //makes sure the user input is valid
               String[] space = userReading.split(" ");
               if((space.length<4||space.length>4)||(!userReading.startsWith("r")&&(!userReading.startsWith("R"))&&(!userReading.startsWith("v")&&(!userReading.startsWith("V"))))){
                    System.out.println("Invalid input. Please put the circuit description in the form  V/R node1 node2 Voltage/Resistance# ");
                }
               
            }
       }
            
        }
    
   /*  
    *method to display the screen of the users input
    */
   public void inputScreen(){
      
     System.out.println("Please enter a circuit with desscription in the form of V/R node1 node2 Voltage/Resistance#");
   }
  
   /*
   /spice method to display circuits created
   */
   public void spice(){
       
       for(Circuit RorV: circuit) {
           System.out.println(RorV);
       }
   }
   
    /*
    *method that terminates the program
    */
   public void end(){
       
       System.out.println("All done.");
   }
   /*
    *main method to carry out operation
    */
    public static void main(String [] args){
        
       UserMain user = new UserMain();
       user.start();
    }
}
    