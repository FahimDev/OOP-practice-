package com.company;

import java.util.Scanner;

public class Factorial implements MathStructure{
    Factorial(){
        this.inputCollector();
    }

    @Override
    public void display() {
        System.out.println("Please, provide a number to find the Factorial:");
    }

    @Override
    public void inputCollector() {
        display();
        Scanner scanner = new Scanner(System.in);
        int myInput = scanner.nextInt();
        myMath(myInput);
    }

    @Override
    public void myMath(int input) {
        int fact = 1;

        for (int i =2; i<=input;i++){
            fact = fact*i;
        }
        System.out.println("The Factorial: "+fact);
    }
}
