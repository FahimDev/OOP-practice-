package com.company;

import java.util.Scanner;

public class PrimeNumber implements MathStructure {
    PrimeNumber(){
        inputCollector();
    }

    @Override
    public void display() {
        System.out.println("Please, provide a Number to check it is Prime Number or not:");
        System.out.println("[ n > 1 ]");
    }

    @Override
    public void inputCollector() {
        display();
        Scanner getInput = new Scanner(System.in);
        int myInput = getInput.nextInt();
        myMath(myInput);
    }

    @Override
    public void myMath(int input) {

        boolean isPrime = false;

        for(int i =2;i<=input;i++){
            if(input%i == 0 && input != i){
                System.out.println("This is not a Prime Number!");
                break;
            }else if(input%i == 0 && input == i ){
                isPrime = true;
                //continue;
            }
        }

        if(isPrime == true){
            System.out.println("This is a Prime Number!");
        }

    }
}
