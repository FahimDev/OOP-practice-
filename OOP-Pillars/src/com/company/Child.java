package com.company;

public class Child extends Father {
    private String child_type;

    public void setChild_type(String child_type){
        this.child_type = child_type;
    }

    public String getChild_type(){
        return child_type;
    }

    public void setSpeed(int speed){
        speed_limit = speed;
    }

    @Override
    public void drive(int speed){

        if(speed < speed_limit){
            System.out.println("Life is a race!");
        }else{
            System.out.println("No FUN !");
        }

    }
}
