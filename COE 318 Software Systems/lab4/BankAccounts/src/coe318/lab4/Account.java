
package coe318.lab4;

/**
 *
 * @author sameh
 */
public class Account {
    private double balance;
    private String name;
    private int number;
    

    
    public Account(String name1, int number1, double startingBalance){
        name = name1;
        number = number1;
        balance = startingBalance;

    }
    //Account name getter method
     public String getName() {
        return name;
    }

    //number getter method
    public int getNumber() {
        return number;
    }

   //balance getter method
    public double getBalance() {
        return balance;
    }

    // deposit function that returns true or false based on whether the function carried out
 public boolean deposit(double amount){
        if(amount <=0) {
            return false;
        }else {
            balance = balance + amount;
            return true;
        }
    }

    // withdraw function that returns true or false based on whether the function carried out
    public boolean withdraw(double amount){
        if(amount > 0 &&(balance - amount) >= 0 ){
          balance =balance- amount;
            return true;
        }else{
            return false;
        }
    }


    @Override
    public String toString() {//DO NOT MODIFY
        return "(" + getName() + ", " + getNumber() + ", " +
                String.format("$%.2f", getBalance()) + ")";
    }
} 







    
    
    
    
    

