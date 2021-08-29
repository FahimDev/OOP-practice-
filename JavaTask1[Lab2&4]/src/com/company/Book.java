package com.company;

public class Book {
    private String bookName;
    private String bookAuthor;
    private String bookId;
    private String bookType;
    private int bookCopy; // how many copy

    static int bookCounter;

    Book(){

    }

    Book(String bookName, String bookAuthor, String bookId, String bookType, int bookCopy){
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookId = bookId;
        this.bookType = bookType;
        this.bookCopy = bookCopy;
    }

    public static void showTotalBookInfo(){

    }

    void showInfo(){

        System.out.println("Book Title: "+bookName);
        System.out.println("Author: "+bookAuthor);
        System.out.println("Book Type: "+bookType);
        System.out.println("Book ID: "+bookId);
        System.out.println("-------------------------------------------------------->");
    }
    void addBookCopy(int x){

    }// how many copy of book

}
