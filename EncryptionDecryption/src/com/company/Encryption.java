package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Encryption {
    private String givenInout;
    private String finalEncryption;

    Encryption(){

    }

    public void collectInput(){
        Scanner userInput = new Scanner(System.in);
        String plainText = userInput.nextLine();
        String[] convert = plainText.split(" ");
        System.out.println("CONVERTING...."+Arrays.toString(convert));
        mechanism(convert);
    }

    private void mechanism(String[] param){
        String rev = "";
        for (int i = param.length-1; i>= 0; i--){

            StringBuilder temp = new StringBuilder(param[i]);
            for (int j = 0 ; j< temp.length()-1; j++ ){
                //ENCODING
                if(temp.charAt(j) == temp.charAt(j+1)){
                   temp.setCharAt(j+1, '2');
                }

                if(temp.charAt(j) == 'e' || temp.charAt(j) == 'E' ){
                    temp.setCharAt(j, '3');
                }

                if(temp.charAt(j) == 's' || temp.charAt(j) == 'S' ){
                    temp.setCharAt(j, '$');
                }
                param[i] = temp.toString();
            }

            rev += param[i]+"^";
        }
        this.finalEncryption = rev;

        Database db = new Database();
        db.save(this.finalEncryption);

        showInfo();
    }

    public void showInfo(){
        System.out.println("---->Your given text has been encrypted into:");
        System.out.println(this.finalEncryption);
    }
}
