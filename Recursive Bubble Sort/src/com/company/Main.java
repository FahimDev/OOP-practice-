package com.company;
import java.util.Arrays;
public class Main {

    public static void bubbleSort(int arr[],int n){

        if(n == 1){
            return;
        }

        for(int i =0 ; i < n-1;i++){

            if(arr[i] > arr[i+1]){
                int temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp;
            }


        }

        bubbleSort(arr,n-1);


    }

    public static void main(String[] args) {

        int myArray[] =  {25,45,75,36,14,11,23,53,80,16,90,2,64,3};
        int l = myArray.length;

        bubbleSort(myArray,l);

        System.out.println("Sorted array : ");
        System.out.println(Arrays.toString(myArray));

    }
}
