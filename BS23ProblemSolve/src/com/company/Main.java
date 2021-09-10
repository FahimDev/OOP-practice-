package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] week = {"Sunday","Monday", "Tuesday","Wednesday", "Thursday","Friday", "Saturday"};
        // I AM COUNTING SUNDAY AS OUR STARTING DAY

        int currentDay = 0;
        int dayCount = 0;

	    Scanner rations = new Scanner(System.in);
	    int rationBlack = rations.nextInt();
        int rationRed = rations.nextInt();
        int rationGreen = rations.nextInt();

        boolean operation = true;
        while (operation){

            if(rationBlack == 0 && rationRed == 0 && rationGreen ==0){
                break;
            }

            switch (week[currentDay]){
                case "Sunday" :
                case "Monday" :
                case "Thursday" :
                   if(rationBlack > 0){
                       rationBlack--;
                       dayCount++;
                       //operation = true;
                   }else {
                       operation = false;
                   }
                   break;
                case "Tuesday" :
                case "Saturday" :
                    if(rationRed > 0){
                        rationRed--;
                        dayCount++;
                        //operation = true;
                    }else {
                        operation = false;
                    }
                    break;
                case "Friday" :
                case "Wednesday" :
                    if(rationGreen > 0){
                        rationGreen--;
                        dayCount++;
                        //operation = true;
                    }else {
                        operation = false;
                    }
                    break;
            }
            //End Switch
/*
            if(operation == false){
                break;
            }
*/
            currentDay++;
            if(currentDay > 6){
                currentDay = 0;//Reset Week
            }
        }

        System.out.println(dayCount);
    }
}
