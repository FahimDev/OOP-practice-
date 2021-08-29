package com.company;

public class Account {
    private String accName;
    private String acid;
    private int balance;

    Transaction [] listOfTransaction; // M.V
    int totalNumberOfTransaction; // M.V


    Account(){

    }
    Account(String accName, String acid, int balance){
        this.accName = accName;
        this.acid = acid;
        this.balance = balance;
    }
    public void deposit(int amount){

    }

    public void withdraw(int amount){

    }
    public void transfer(int amount, Account receiver){

    }

    void addTransaction(Account sender, Account receiver, int amount){

    }
    void showAllTranscation(){

    }
}
