package com.company;

import java.util.ArrayList;
import java.util.List;

public class Father implements Basic {
    public String name;
    public int age;
    protected String house;
    protected double money;
    protected String car;
    protected int speed_limit;

    private List<Child> childern;

    Father(){
        childern = new ArrayList<Child>();
    }

    public void addChild(Child child){
        //System.out.println(child.age);
        this.childern.add(child);
    }

    public void getAllChildren(){
        for(Child c : childern){
            System.out.println("Name: "+name);
            System.out.println("Age: "+age);
        }
    }

    @Override
    public void drive(){
        if(speed_limit <= 60){
            System.out.println("Perfect Driving.");
        }else{
            System.out.println("একটি দুর্ঘটনা সারা জীবনের কান্না");
        }
    }


    @Override
    public void drive(int speed){

        if(speed < speed_limit){
            System.out.println("This is Bad!");
        }else{
            System.out.println("Have a Relax");
        }

    }

}
