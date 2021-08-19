package com.company;

public class Main {
    int arr[] = {45,25,78,1,5,3,65,44,54,100,71,55,63,41,20,32,12};
    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        ss.sort();
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort();
        MergeSort ms = new MergeSort();
        ms.breakArr();
        Main main = new Main();

        System.out.println("Total Length:"+main.arr.length);
    }
}
