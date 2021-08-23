package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Books{
    int code;
    String name;
    LinkedList<Integer> author = new LinkedList<>();
    String publisher;
    int year;
    double price;
    String currency;
    //Default open for all in the same Package

    public Books(int bookId, String bookName, int authorId[], String publisher, int year, double cost, String currency){
        this.code = bookId;
        this.name = bookName;
        for(int i=0; i < authorId.length;i++){
            this.author.add(authorId[i]);
        }
        this.publisher = publisher;
        this.year = year;
        this.price = cost;
        this.currency = currency;
    }
}
