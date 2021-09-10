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
            case 4:
                System.out.println("Loading Palindrome Number.....");
                PalindromeNumber palindromeNumber = new PalindromeNumber();
            case 5:
                System.out.println("Loading LeapYear checker.....");
                LeapYear leapYear = new LeapYear();
        }

    }
}
