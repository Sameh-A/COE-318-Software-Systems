/**
 *
 * @author Sameh Ahmed
 */
package coe318.lab7;
public class DCVoltageSource extends Circuit {
    public double voltage ;
    public Node node1;
    public Node node2;
    private static int numOfDCVoltageSource = 1;
    public int DCVoltageSourceId;
    /* 
     * voltage source constructor
     */
    public DCVoltageSource(double voltage, Node node1, Node node2){
         if(node1 == null || node2 == null){
            throw new IllegalArgumentException("invalid");
         }

        this.voltage = voltage;
        this.node1 = node1;
        this.node2 = node2;
        this.DCVoltageSourceId = numOfDCVoltageSource; 
        numOfDCVoltageSource+=1;  
    }
    /*
     * get node
     */
    public Node[] getNodes(){
        Node[] nodeVal = {node1, node2};
        return nodeVal;
    }
    /*
     * Voltage to string
     */
    public String toString(){
        if (this.node1.nodeIdnum < this.node2.nodeIdnum)
            return "V" + this.DCVoltageSourceId + " " + this.node1 + " " + this.node2 + " DC  " + "-" + this.voltage +".";
        
        else
            return "V" + this.DCVoltageSourceId + " " + this.node1 + " " + this.node2 + " DC  " + this.voltage +".";
    }
    
}
