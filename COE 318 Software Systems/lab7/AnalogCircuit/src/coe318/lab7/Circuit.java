/**
 *
 * @author Sameh Ahmed
 */
package coe318.lab7;
import java.util.ArrayList;
public abstract class Circuit {
 public static Circuit instance =  null;

   
    public ArrayList<Resistor> resistance = new ArrayList<Resistor>();
     public ArrayList<DCVoltageSource> dcvoltagesource = new ArrayList<DCVoltageSource>();
   
    /*
     * Circuit object
     */
    public Circuit(){
        this.resistance = new ArrayList<Resistor>();
        this.dcvoltagesource=new ArrayList<DCVoltageSource>();
    }
    /*
     * method to add resistor
     */
    public void addr(Resistor r){
        this.resistance.add(r);
    }
     /*
     * method to add voltage source
     */
    public void addv(DCVoltageSource v){
        this.dcvoltagesource.add(v);
    }
    /*
     * circuit toString
     */
    public String toString(){ 
        String VolString= new String();
        String circuitString = new String();
        for(int x=0; x<this.resistance.size(); x++){
            circuitString += this.resistance.get(x).toString() + "\n";
        }
         for(int i=0; i<this.dcvoltagesource.size(); i++){
            VolString += this.dcvoltagesource.get(i).toString() + "\n";
        }
        return(circuitString + " " + VolString);
    }
}