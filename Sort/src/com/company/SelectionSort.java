package com.company;
import java.util.Arrays;
public class SelectionSort {
    Main m = new Main();
    int myArr[] = m.arr;

    int findSmallest(int pos){

        int temp = 0;
        int min = myArr[pos];
        for(int i=pos; i<myArr.length-1;i++){

            for(int j=pos+1; j<myArr.length;j++){
                if(min > myArr[j]){
                    pos = j;
                    min = myArr[pos];
                }
            }
        }
        return pos;
    }

    void sort(){

        for(int i=0; i<myArr.length-1;i++){

            int minPos = findSmallest(i);
            int temp = myArr[i];
            myArr[i] = myArr[minPos];
            myArr[minPos] = temp;
        }
        System.out.println(">>>>SELECTION SORT:START<<<<");
        System.out.println(Arrays.toString(myArr));
        System.out.println(">>>>SELECTION SORT:END<<<<");
    }
}
