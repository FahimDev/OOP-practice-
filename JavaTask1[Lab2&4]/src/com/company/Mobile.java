package com.company;

public class Mobile {
    private String mobileOwnerName;
    private String mobileNumber; // SIM number
    private String mobileBalance;
    private String mobileOSName;
    private boolean lock; // true means phone is lock false means unlock

    Mobile(){

    }
    Mobile(String mobileOwnerName,String  mobileNumber, String mobileBalance, String mobileOSName, boolean lock){
        this.mobileOwnerName = mobileOwnerName;
        this.mobileNumber = mobileNumber;
        this.mobileBalance = mobileBalance;
        this.mobileOSName = mobileOSName;
        this.lock = lock;
    }
    void showInfo(){

    }
    void recharge(int amount){

    }
    void callSomeone(int timeDuration){

    } // per minute cost=1 taka


}
