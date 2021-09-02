package com.company;

public class EncryptService extends Encryption {
    EncryptService(){

    }

    @Override
    public void collectInput() {
        System.out.println(">>>Please write a sentence for encryption<<<");
        super.collectInput();
    }

    @Override
    public void showInfo() {
        super.showInfo();
    }
}
