package com.company;

import java.util.Scanner;

public class LCM extends GCD implements MathStructure{
    LCM(){
        inputCollector();
    }
    @Override
    public void display() {
        System.out.println("Please, provide 2 numbers to get the LCM");
    }

    @Override
    public void inputCollector() {
        this.display();
        Scanner scanner = new Scanner(System.in);
        int myNumber1 = scanner.nextInt();
        int myNumber2 = scanner.nextInt();

        printOutput(myMath(myNumber1, myNumber2));
    }

    public void printOutput(int lcm){
        System.out.println("The LCM value is: "+lcm);
    }

    @Override
    public void myMath(int input) {

    }

    @Override
    public int myMath(int input1, int input2) {

        int gcd = super.myMath(input1, input2);

        int lcm = input1 * input2 / gcd;
        return lcm;
    }
}
