package com.company;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class GCD implements MathStructure {
    GCD(){
        this.inputCollector();
    }

    @Override
    public void display() {
        System.out.println("Please, provide 2 numbers to get the GCD");
    }

    @Override
    public void inputCollector() {
        this.display();
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        printOutput(myMath(num1 , num2));
    }

    @Override
    public void myMath(int input) {

    }

    public void printOutput(int gcd){
        System.out.println("The GCD value is: "+gcd);
    }

    public int myMath(int input1 , int input2) {
        int gcd = 0;
        int temp;
        while (true){
            gcd = input1 % input2;

            if(gcd == 0){
                gcd = input2;
                break;
            }

            //temp = input2;
            input1 = input2;
            input2 = gcd;

        }
        return gcd;
    }

}
