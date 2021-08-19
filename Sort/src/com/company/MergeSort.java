package com.company;
import java.util.Arrays;
public class MergeSort {
    Main m = new Main();
    int myArr[] = m.arr;
    int mid = myArr.length/2;
    //int left = myArr[0];
    //int right = myArr.length-1;
    //int mid = left + (right - left) / 2;

    void breakArr(){

        int lArr[] = new int[mid];
        for(int i=0; i < mid; i++){
            lArr[i] = myArr[i];
        }


        int rArr[] = new int[myArr.length-mid];
        int rl = mid;
        for(int i=0; i < rArr.length; i++){
            rArr[i] = myArr[mid];
            mid++;
        }

        sort(lArr,lArr.length);
        sort(rArr,rArr.length);
        //I WILL USE THREAD in Next DAY

        for(int i =0; i< lArr.length;i++){
            myArr[i] = lArr[i];
        }
        int j = 0;
        for(int i =lArr.length-1; i< rArr.length-1;i++){
            myArr[i] = rArr[j];
            j++;
        }

        sort(myArr,myArr.length);
        System.out.println(">>>>MERGE SORT:START<<<<");
        System.out.println("1st Part:");
        System.out.println(Arrays.toString(lArr));
        System.out.println("2nd Part:");
        System.out.println(Arrays.toString(rArr));
        System.out.println("Merge Part:");
        System.out.println(Arrays.toString(myArr));
        System.out.println(">>>>MERGE SORT:END<<<<");

    }

    void sort(int arr[],int n){

        if(n==1){
            return;
        }

        for(int i=0;i<n-1;i++){
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        sort(arr,n-1);
    }

}
