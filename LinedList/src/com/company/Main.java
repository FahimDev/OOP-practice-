package com.company;

import java.util.*;
public class Main {

    /*
    * TASK1:
    * Make default 3 Authors & 2 Books
    * 1 Books have 2 Authors
    * TASK2:
    * Make Option Panel with options (Create Author, Add Book)
    * Create Author -> Inout Author Name
    * Add Books -> Show Author List with id (Index Number) -> Input Author ID -> Input Author Details
    * Show Full Book List
    * */

    public static List<Books> book = new LinkedList<>();

    public static void main(String[] args) {

        Author writters = new Author();
        writters.addNew("Md. Al-Amin");
        writters.addNew("Md. Mehdi Hasan");
        writters.addNew("Ratul Khan");
        System.out.println("_______________________________________________");
        System.out.println("Direct from Author List: "+writters.authorList);
        System.out.println("------------------------------------------------");


        Books b1 = new Books(102,"Cloud IT Solutions", new int[]{0, 1}, "INCEPTION",2018, 420,"BDT");
        Books b2 = new Books(202,"Opo Dartho Biggan", new int[]{2}, "Ideal",2020, 230,"BDT");
        //LinkedList<Books> book = new LinkedList<Books>();

        book.add(b1);
        book.add(b2);

        for(Books b : book){
            System.out.println("Book Name: "+b.name);
            for (int i = 0; i < b.author.size(); i++) {
                System.out.println("Author: "+writters.authorList.get(b.author.get(i)));
            }
            System.out.println("Publisher: "+ b.publisher+"("+b.year+")");
            System.out.println("Price: "+ b.price+" "+b.currency);
        }
        while(true){
            MainMenu dashboard = new MainMenu();
            Scanner selected = new Scanner(System.in);
            int select = selected.nextInt();
            dashboard.option(select);
        }
    }
}
