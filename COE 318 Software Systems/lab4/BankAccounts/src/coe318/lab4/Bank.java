/**
 *
 * @author Sameh Ahmed
 */
package coe318.lab4;

public class Bank {
    private String name;
    /**
     * An array of Accounts managed by
     * this bank.
     */
    private Account [] accounts;
    private int numAccounts;//number of active accounts

    public Bank(String name, int maxNumberAccounts) {
        this.name = name;
        accounts = new Account[maxNumberAccounts];
        numAccounts = 0;
    }


    /**
     * @return the name
     */
    public String getName() {
        return this.name;  //Fix this
    }

    /**
     * @return the numAccounts
     */
    public int getNumAccounts() {
        return this.numAccounts; //Fix this
    }


    public Account[] getAccounts() {
        return this.accounts; //Fix this
    }

    /**
     * Return true if the Bank already has an account
     * with this number; otherwise false.
     * @param accountNumber
     * @return
     */
     public boolean hasAccountNumber(int accountNumber) {
        for(int x=0;x<accounts.length;x++ ) {
           if(accounts[x] != null){
               if (accounts[x].getNumber() == accountNumber) {
                   return true;
               }
           }
        }
        return false;      //for(Account account : this.accounts)
    }
    /**
     * Adds the specified account to the Bank if possible. If the account number
     * already exists or the Bank has reached its maximum
     * number of accounts, return false and do not add it; otherwise,
     * add it and return true.
     * @param account
     * @return true if successful
     */
    public boolean add(Account account) {
        int c =account.getNumber();
        if(this.hasAccountNumber(c)==true){
           return false;
        }else {
            for (int x = 0; x < this.accounts.length; x++) {
                if (this.accounts[x] == null) {
                    this.accounts[x] = account;
                    this.numAccounts++;
                    break;
                }
            }
            return true;
        }
    }
    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        String s = getName() + ": " + getNumAccounts() +
                " of " + getAccounts().length +
                " accounts open";
        for(Account account : getAccounts()) {
            if (account == null) break;
            s += "\n  " + account;
        }
        return s;
    }
}