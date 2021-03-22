/**
 *
 * @author Sameh Ahmed
 */
package coe318.lab3;
public class Counter {
    //Instance variables here
    
    int modulo;
    Counter leftObject;
    int numberStore;
    int counter;
    public Counter(int modulus, Counter left) {
        modulo = modulus;
        leftObject = left;
    }


    /**
     * @return the modulus
     */
    public int getModulus() {
        return modulo;
    }

    /**
     * Returns the Counter to the left attached to this
     * Counter.  Returns null if there is no Counter
     * to the left.
     * @return the left
     */
    public Counter getLeft() {
        return leftObject;
        
        
    }

    /**
     * @return the digit
     */
    public int getDigit() {
        return numberStore;
    }

    /**
     * @param digit the digit to set
     */
    public void setDigit(int digit) {
       numberStore = digit;
        
        
    }

    /**
     * Increment this counter.  If it rolls over,
     * its left Counter is also incremented if it
     * exists.
     */
    public void increment() {
        numberStore++;
        if (numberStore == modulo){
            numberStore = 0;
            if(leftObject != null ){
                leftObject.numberStore++;
            }
            
        }
         
    }

    /** Return the counter of this Counter combined
     * with any Counter to its left.
     *
     * @return the counter
     */
    public int getCount() {
        if(leftObject == null){
            counter = numberStore;
        }
        else if(leftObject !=null){
           
            counter = numberStore + (modulo*leftObject.numberStore);
        }
        return counter;
    }

    /** Returns a String representation of the Counter's
     * total counter (including its left neighbour).
     * @return the String representation
     */
    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        return "" + getCount();
    }

}