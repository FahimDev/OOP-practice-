package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Integer> lands = new ArrayList<>();
        int totalArea = 0;

        int rifat = 0;
        int karim = 0;
        int rifatLands = 0;


        Scanner input = new Scanner(System.in);

        int numberOfLands = input.nextInt();

        for (int i=0; i<numberOfLands;i++){
            int area = input.nextInt();
            lands.add(area);
            totalArea += area;
        }

        karim = totalArea;

        for (int i=0; i<numberOfLands;i++){
            if(rifat > karim){
                break;
            }
            int curr = lands.get(i);
            karim -= curr;
            rifat += curr;
            rifatLands++;
        }

        System.out.println(rifatLands);

    }
}
