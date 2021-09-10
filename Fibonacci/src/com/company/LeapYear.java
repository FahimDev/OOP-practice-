package com.company;

import java.util.Scanner;

public class LeapYear implements MathStructure {
    LeapYear(){
        this.inputCollector();
    }

    @Override
    public void display() {
        System.out.println("Please, provide a year to check if it is Leap year  or not:");
    }

    @Override
    public void inputCollector() {
        display();
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        myMath(year);
    }

    @Override
    public void myMath(int input) {

        if(input%400 == 0){
            System.out.println("This year is a Leap Year!");
        }else{
            if(input%4 == 0 && input%100 !=0){
                System.out.println("This year is a Leap Year!");
            }else{
                System.out.println("This year is not a Leap Year!");
            }
        }

    }
}
