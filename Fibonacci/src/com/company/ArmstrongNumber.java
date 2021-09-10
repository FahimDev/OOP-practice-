package com.company;

import java.util.Scanner;

public class ArmstrongNumber implements MathStructure{

    ArmstrongNumber(){
        inputCollector();
    }

    @Override
    public void display() {
        System.out.println("Please, provide a Number to check if it is Armstrong Number or not:");
    }

    @Override
    public void inputCollector() {
        this.display();
        Scanner scanner = new Scanner(System.in);
        int check = scanner.nextInt();
        myMath(check);
    }

    @Override
    public void myMath(int input) {
        int sum = 0;
        int temp = input;
        int r;
        //int comp= recursion(input,sum,temp);
        //System.out.println("This is result:"+comp);

        while (temp != 0){
            r = temp%10;
            sum = sum + r*r*r;
            temp = temp/10;
        }
        System.out.println(">>>>"+sum);
        if (sum == input){
            System.out.println("This is Armstrong Number!");
        }else {
            System.out.println("This is not Armstrong Number!");
        }
    }

}
