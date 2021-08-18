package com.company;

public class MyTemplate {
    String ac_name;
    int ac_value;

    MyTemplate(){
        System.out.println("------------------->Welcome to Central Bank <-------------------");
    }

    MyTemplate(String accountName, int value){

        ac_name = accountName;
        ac_value = value;

    }

    void accountInfo(){
        System.out.println("___ACCOUNT INFO___");
        System.out.println("ACCOUNT NAME: "+ac_name);
        System.out.println("ACCOUNT VALUE: $"+ac_value);
    }
}
