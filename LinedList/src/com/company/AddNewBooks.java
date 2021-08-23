package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class AddNewBooks {

    AddNewBooks(){
        System.out.println("Please Select the Author 1st");
        System.out.println("------------------------------------------");
        System.out.println("If author name is not in the list input -1");
        System.out.println("-------------------------------------------");
        this.showList();
        this.booksMenu();
        System.out.println("-------------------------------------------");
    }

    public void showList(){
        for(int i=0;i<Author.authorList.size();i++){
            System.out.println("Press "+i+" to select Author: "+Author.authorList.get(i));
        }
    }
    int authorIndex;
    public void booksMenu(){
        Scanner inputUser = new Scanner(System.in);
        authorIndex = inputUser.nextInt();

        if(authorIndex >= Author.authorList.size()){
            System.out.println("Wrong Author ID!");
            System.exit(1);
        }

        if(authorIndex == -1){
            CreateAuthor addAuth = new CreateAuthor();
        }else{
            int lastIndex = Main.book.size();
            lastIndex = Main.book.get(lastIndex-1).code;
            System.out.println("Book ID: "+(lastIndex+1));
            System.out.println("Book Name:");
            Scanner inputName = new Scanner(System.in);
            String name = inputName.nextLine();
            int[] authorId = {authorIndex};
            System.out.println("Publisher Name:");
            Scanner inputPub = new Scanner(System.in);
            String publisher = inputPub.nextLine();
            System.out.println("Publishing Year:");
            Scanner inputYear = new Scanner(System.in);
            int year = inputYear.nextInt();
            System.out.println("Price:");
            Scanner inputCost = new Scanner(System.in);
            int cost = inputCost.nextInt();
            System.out.println("Currency:");
            Scanner inputType = new Scanner(System.in);
            String currency = inputType.nextLine();
            Books b = new Books(lastIndex+1,name,authorId,publisher,year,cost,currency);
            Main.book.add(b);
            System.out.println("New Record Created Successfully!");

            ViewAll all = new ViewAll();
        }
    }
}
