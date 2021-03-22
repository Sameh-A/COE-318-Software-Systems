//Sameh Ahmed 500907041
package coe318.lab6;
public class Resistor {
    public double resistance ;
    public Node node1;
    public Node node2;
    private static int numOfResistor = 1;
    public int resistorId;
 
    public Resistor(double resistance, Node node1, Node node2){
         if(node1 == null || node2 == null){
            throw new IllegalArgumentException("invalid");
         }
        if(resistance < 0){
            throw new IllegalArgumentException("invalid");
        }
        this.resistance = resistance;
        this.node1 = node1;
        this.node2 = node2;
        this.resistorId = numOfResistor; 
        numOfResistor+=1;  
    }
    
    public Node[] getNodes(){
        Node[] nodeVal = {node1, node2};
        return nodeVal;
    }
    
    public String toString(){
        return("R" + resistorId + " " + node1 + " " + node2 + " " + (int)resistance);
    }
    
}