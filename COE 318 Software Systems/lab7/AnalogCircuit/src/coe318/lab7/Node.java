/**
 *
 * @author Sameh Ahmed
 */
package coe318.lab7;
public class Node {
    public static int nodeCounter = 0; 
    public int nodeIdnum;
    
    public Node(){
       this.nodeIdnum = nodeCounter;
       nodeCounter++;
    }
    
    public String toString(){
        return String.valueOf(nodeIdnum);
    }
    } 