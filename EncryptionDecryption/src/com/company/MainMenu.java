package com.company;

import java.util.Scanner;

public class MainMenu {

    MainMenu(){

        this.welcomePage();

    }

    public void welcomePage(){
        System.out.println("Welcome to the TEXT-SECURITY");
        System.out.println("* Press 1 to Encrypt a Sentence.");
        System.out.println("* Press 2 to show an Encrypted Sentence.");
        System.out.println("* Press 3 to Decrypt a Sentence.");
        System.out.println("* Press 4 to Exit.");
    }

    public void operations(){
        Scanner choose = new Scanner(System.in);
        int choosen = choose.nextInt();

        switch (choosen){
            case 1:
                EncryptService encrypt = new EncryptService();
                encrypt.collectInput();
                break;
            case 2:
                Database encryptInfo = new Database();
                encryptInfo.view();
                break;
            case 3:
                DecryptService decrypt = new DecryptService();
                decrypt.showInfo();
                break;
            case 4:
                System.exit(1);

        }

        choose.close();
    }
}
