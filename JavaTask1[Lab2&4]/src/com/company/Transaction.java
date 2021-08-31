package com.company;

public class Transaction {
    Account sender;
    Account receiver;
    int amount;
    String additionalInfo;

    Transaction(){

    }
    Transaction(Account sender, Account receiver, int amount){
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
    }


    public void showInfo(){

    }

    public void transactionHistory(Account acc){

    }

}
