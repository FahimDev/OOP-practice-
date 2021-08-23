package com.company;

import java.awt.print.Book;
import java.util.Scanner;

public class CreateAuthor {
    CreateAuthor(){
        System.out.println("Please, Input Author's Name only:");
        this.addNewAuthor();
    }

    public void addNewAuthor(){
        Scanner authorInput = new Scanner(System.in);
        String name = authorInput.nextLine();
        //Author author = new Author();
        Author.addNew(name);
        System.out.println("Author name: "+name+" saved successfully");

        ViewAll all = new ViewAll();
    }
}
