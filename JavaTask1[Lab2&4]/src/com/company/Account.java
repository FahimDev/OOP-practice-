package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Account {
    private String accName;
    private String acid;
    private int balance;

    List<Transaction> listOfTransaction; // M.V
    int totalNumberOfTransaction; // M.V


    Account(){
        listOfTransaction = new ArrayList<Transaction>();
    }
    Account(String accName, String acid, int balance){
        this.accName = accName;
        this.acid = acid;
        this.balance = balance;
        this.listOfTransaction = new ArrayList<Transaction>();
    }
    public void deposit(int amount){

    }

    public void withdraw(int amount){

    }

    public void transfer(int amount, Account receiver){
        System.out.println(this.accName+"'s Current Balance: "+this.balance);
        this.balance = this.balance-amount;
        receiver.balance = receiver.balance+amount;

        System.out.println(receiver.accName+"'s New Balance: "+receiver.balance);
        System.out.println(this.accName+"'s New Balance: "+this.balance);
    }

    public void showTotalBalance(){
        System.out.println("----------------------------------------------------");
        System.out.println("==> Account Name: "+this.accName);
        System.out.println("==> Total Balance: "+this.balance);
    }

    void addTransaction(Account sender, Account receiver, int amount){
        Transaction tr = new Transaction(sender,receiver,amount);
        listOfTransaction.add(tr);
        this.transfer(amount,receiver);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("-------------->Payment Successful<--------------");
    }

    void showAllTranscation(){
        for (Transaction t: this.listOfTransaction) {
            System.out.println("----------------------------------------------------");
            System.out.println("==> Sender: "+t.sender.accName);
            System.out.println("==> Receiver: "+t.receiver.accName);
            System.out.println("==> Amount: "+t.amount);
        }
    }
}
