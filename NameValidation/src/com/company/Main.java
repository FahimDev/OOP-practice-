package com.company;
import java.util.regex.*;
public class Main {
    public static boolean validate(String x){
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        String first = Character.toString(x.charAt(0));
        if(x.length() >= 4 && x.endsWith("_") == false && pattern.matcher(first).matches() == false){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {

        System.out.println(validate("Mike_kazi"));
        System.out.println(validate("Naveed Mahbub"));
        System.out.println(validate("5A3F Ullah"));
        System.out.println(validate("Mahir Faisal_"));
    }
}
