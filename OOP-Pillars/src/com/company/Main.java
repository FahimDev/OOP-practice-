package com.company;

public class Main {

    public static void main(String[] args) {
	/*
	* Father, 2 Child
	* Father (Property)-> Child
	* Father (Method) "Drive" overloading
	* Father "Drive" Method overriding
	* 1 Child Drives Racing Car
	* */
		Father dad = new Father();
		dad.name = "Hossain";
		dad.age = 60;

		Child c1 = new Child();
		c1.name = "Bappy";
		c1.age = 30;

		Child c2 = new Child();
		c2.name = "Fahim";
		c2.age = 25;

		dad.addChild(c1);
		dad.addChild(c2);
		dad.getAllChildren();

		c1.setSpeed(180);

		c1.drive();
		c1.drive(70);

		c2.drive();
    }
}
