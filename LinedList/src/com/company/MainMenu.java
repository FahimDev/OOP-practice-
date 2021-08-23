package com.company;

import java.nio.charset.MalformedInputException;
import java.util.Scanner;

public class MainMenu {
    private int selected;
    MainMenu(){
        System.out.println("Please Select an option:");
        System.out.println("* Press 0 to View Information");
        System.out.println("* Press 1 for CREATE NEW AUTHOR");
        System.out.println("* Press 2 for ADD NEW BOOK");
        System.out.println("* Press 9 to exit");
        //option(selected);
    }

    public void option(int i){
        if(i == 1){
            CreateAuthor addWritter = new CreateAuthor();
        }
        else if(i == 2){
            AddNewBooks newBooks = new AddNewBooks();
        }else if(i == 9){
            System.exit(1);
        }
        else if(i == 0){
            ViewAll all = new ViewAll();
        }
        else{
            System.out.println("Sorry! Wrong input. Please, try again.");
            Scanner optionInput = new Scanner(System.in);
            i = optionInput.nextInt();
            this.option(i);
        }

    }

}
