package com.company;

import java.util.Scanner;

public class Menu {
    Menu(){
        System.out.println(">>Welcome to basic Math room<<");
    }

    public  void display(){
        System.out.println("Please Select your Math operation:");
        System.out.println("* Press 1 for Fibonacci");
        System.out.println("* Press 2 for Prime Number");
        System.out.println("* Press 3 for Armstrong Number");
        System.out.println("* Press 4 for Palindrome Number");
        System.out.println("* Press 5 for Check LeapYear");
        System.out.println("* Press 6 for Factorial");
        System.out.println("* Press 7 for Centigrade to Fahrenheit");
        System.out.println("* Press 8 for Check GCD(গসাগু)");
        System.out.println("* Press 9 for Check LCM(লসাগু)");
    }

    public void operations(){
        this.display();
        Scanner takeInput = new Scanner(System.in);
        int myInput = takeInput.nextInt();

        switch (myInput){
            case 1:
                System.out.println("Loading Fibonacci.....");
                Fibonacci fibonacci = new Fibonacci();
                break;
            case 2:
                System.out.println("Loading Prime Number.....");
                PrimeNumber primeNumber = new PrimeNumber();
                break;
            case 3:
                System.out.println("Loading Armstrong Number.....");
                ArmstrongNumber armstrongNumber = new ArmstrongNumber();
                break;
            case 4:
                System.out.println("Loading Palindrome Number.....");
                PalindromeNumber palindromeNumber = new PalindromeNumber();
                break;
            case 5:
                System.out.println("Loading LeapYear checker.....");
                LeapYear leapYear = new LeapYear();
                break;
            case 6:
                System.out.println("Loading Factorial.....");
                Factorial factorial = new Factorial();
                break;
            case 7:
                System.out.println("Loading Centigrade to Fahrenheit.....");
                Fahrenheit fahrenheit = new Fahrenheit();
                break;
            case 8:
                System.out.println("Loading GCD.....");
                GCD gcd = new GCD();
                break;
            case 9:
                System.out.println("Loading LCM.....");
                LCM lcm = new LCM();
                break;
        }

    }
}
