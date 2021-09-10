package com.company;

import java.util.Scanner;

public class Fibonacci implements MathStructure {

    Fibonacci(){
        this.inputCollector();
    }

    @Override
    public void display() {
        System.out.println("Please, provide a range for Fibonacci Series:");
    }

    @Override
    public void inputCollector() {
        display();
        Scanner myRange = new Scanner(System.in);
        int range = myRange.nextInt();
        myMath(range);
    }
    @Override
    public void myMath(int input){
        int fibo;
        int first = 0;
        int second = 1;

        for(int i=0; i< input;i++){

            fibo = first + second;

            first = second;
            second = fibo;

            System.out.println(fibo);
        }
    }
}
