package com.company;

import java.util.Scanner;

public class Fahrenheit implements MathStructure {

    Fahrenheit(){
        this.inputCollector();
    }

    @Override
    public void display() {
        System.out.println("Please, provide a Centigrade value to convert it to Fahrenheit:");

        /*
         * FORMULA:
         * C/5 = (F-32)/9 = (K-273)/5
         * */
    }

    @Override
    public void inputCollector() {
        display();
        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt();
        myMath(temp);
    }

    @Override
    public void myMath(int input) {
        double f;
        f = 1.8*input +32;
        System.out.println(input+" Centigrade is equal  of "+f+" Fahrenheit");
    }
}
