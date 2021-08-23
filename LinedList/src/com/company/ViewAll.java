package com.company;

public class ViewAll {
    ViewAll(){
        System.out.println("VIEW ALL RECORDS");
        System.out.println("_______________________________________________");
        System.out.println("Direct from Author List: "+Author.authorList);
        System.out.println("------------------------------------------------");

        for(Books b : Main.book){
            System.out.println("Book Name: "+b.name);
            for (int i = 0; i < b.author.size(); i++) {
                System.out.println("Author: "+Author.authorList.get(b.author.get(i)));
            }
            System.out.println("Publisher: "+ b.publisher+"("+b.year+")");
            System.out.println("Price: "+ b.price+" "+b.currency);
        }
    }
}
