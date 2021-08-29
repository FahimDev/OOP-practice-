package com.company;

public class Library {
    private String libName;
    private String libAddress;
    private Book [] listOfBook;
    public int totalBook;
    private int fineRate;

    public String bankAccount;

    Library(){

    }

    Library(String libName, String libAddress, Book[] list, int fineRate){
        this.libName = libName;
        this.libAddress = libAddress;
        this.listOfBook = list;
        this.fineRate = fineRate;
    }
/*
    public void bookDistribution(Book takenBook, Student student){

    }

 */
    public int bookFineCounter(Book book,int delay){
        return totalFine(book,delay);
    }
    //OVERLOADING
    public int bookFineCounter(Book book,int delay,String reason, int excuse){
        int fine = totalFine(book,delay);
        System.out.println("For the reason of: "+reason+ " charged amount "+ excuse+"% is deducted");
        return fine*excuse/100;
    }

    private int totalFine(Book book,int delay){
        System.out.println("-------------------------------------------------------->");
        System.out.println("TOTAL FINE "+fineRate*delay+ " TK (BDT) FOR: ");
        book.showInfo();
        return fineRate*delay;
    }

    public void changeFromBank(){

    }


    public void setLibName(String libName) {
        this.libName = libName;
    }

    public String getLibName() {
        return libName;
    }

    public void setLibAddress(String libAddress) {
        this.libAddress = libAddress;
    }

    public String getLibAddress() {
        return libAddress;
    }

    void showLibInfo(){

    } // show library info and all book info as well
    void addNewBook(Book book){

    } // add a new book into lib
    void deleteBook(Book book){

    } // delete book object
    void addNewBookCopy(Book book, int copy){

    }
}
