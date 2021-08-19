package com.company;

import java.util.Arrays;

public class BubbleSort {
    Main m = new Main();
    int myArr[] = m.arr;
    int l = myArr.length;

    void sort(int tempArr[],int n){
        if(n == 1){
            return;
        }
        for(int i = 0; i < n-1; i++){
            if(tempArr[i] > tempArr[i+1]){
                int temp = tempArr[i];
                tempArr[i] = tempArr[i+1];
                tempArr[i+1] = temp;
            }

        }
        myArr = tempArr;
        sort(myArr,n-1);
    }

    void bubbleSort(){

        sort(myArr,l);
        System.out.println(">>>>BUBBLE SORT:START<<<<");
        System.out.println(Arrays.toString(myArr));
        System.out.println(">>>>BUBBLE SORT:END<<<<");
    }

}
