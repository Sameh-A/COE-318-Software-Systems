//Sameh Ahmed 500907041
package coe318.lab6;
import java.util.ArrayList;
public class Circuit {
    private static Circuit instance =  null;
    private ArrayList<Resistor> resistance = new ArrayList<Resistor>();
    
    public static Circuit getInstance(){
        if(instance == null){
        instance = new Circuit();
        }
        return instance;
    }
    
    private Circuit(){//Yes, the constructor is PRIVATE!
        this.resistance = new ArrayList<Resistor>();
    }
    
    public void add(Resistor r){
        this.resistance.add(r);
    }
    
   
    public String toString(){
        String circuitString = new String();
        
        for(int x=0; x<this.resistance.size(); x++){
            circuitString += this.resistance.get(x).toString() + "\n";
        }
        return(circuitString);
    }
}
