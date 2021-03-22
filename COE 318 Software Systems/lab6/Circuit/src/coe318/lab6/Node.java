//Sameh Ahmed 500907041 
package coe318.lab6;
public class Node {
    private static int nodeCounter = 0; 
    private int nodeIdnum;
    
    public Node(){
       this.nodeIdnum = nodeCounter;
       nodeCounter++;
    }
    
    public String toString(){
        return String.valueOf(nodeIdnum);
    }
    } 