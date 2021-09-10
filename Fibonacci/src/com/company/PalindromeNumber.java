package com.company;

import java.util.Scanner;

public class PalindromeNumber implements MathStructure{
    PalindromeNumber(){
        inputCollector();
    }

    @Override
    public void display() {
        System.out.println("Please, provide a Number to check if it is Palindrome Number or not:");
    }

    @Override
    public void inputCollector() {
        this.display();
        Scanner scanner = new Scanner(System.in);
        int myNumber = scanner.nextInt();
        this.myMath(myNumber);
    }

    @Override
    public void myMath(int input) {

        int rev = 0;
        int temp = input;
        while (temp != 0){
            rev = rev*10 + temp%10;
            temp = temp/10;
        }
        if(rev == input){
            System.out.println("This is a Palindrome Number");
        }else {
            System.out.println("This is not a Palindrome Number");
        }
    }
}
