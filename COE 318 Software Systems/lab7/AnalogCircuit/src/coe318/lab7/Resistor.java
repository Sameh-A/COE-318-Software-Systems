/**
 *
 * @author Sameh Ahmed
 */
package coe318.lab7;
public class Resistor extends Circuit {
    public double resistance ;
    public Node node1;
    public Node node2;
    private static int numOfResistor = 1;
    public int resistorId;
    /*
     * Resistor constructor
     */
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
    /*
     * method to get nodes
     */
    public Node[] getNodes(){
        Node[] nodeVal = {node1, node2};
        return nodeVal;
    }
    /*
     * method that creates toString for resistor
     */
    public String toString(){
        return("R" + resistorId + " " + node1 + " " + node2 + " " + resistance);
    }
    
}
