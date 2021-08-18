package com.company;

public class Main {

    public static void main(String[] args) {
        MyTemplate temp = new MyTemplate("Mr. Kamal", 503125);
        temp.accountInfo();
        MyTemplate temp2 = new MyTemplate();
        temp2.accountInfo();
        MyTemplate temp1 = new MyTemplate("Mr. Mike", 756486);
        temp1.accountInfo();
    }
}
