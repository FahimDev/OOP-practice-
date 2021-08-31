package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myString = new Scanner(System.in);
        String myInput = myString.nextLine();
        CheckParentheses checkParentheses = new CheckParentheses(myInput);
        if(checkParentheses.operation()==true){
            System.out.println("Perfectly Balanced ");
        }else {
            System.out.println("Not Balanced ");
        }
    }
}
