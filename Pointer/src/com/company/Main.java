package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public Node node = new Node();

    class Node{
        private int value;
        //public node next;
    }


    public static void main(String[] args) {

        Stack<Integer> jar = new Stack<Integer>();
        jar.push(60);
        jar.push(50);
        jar.push(40);
        jar.push(30);
        jar.push(20);
        jar.pop();
        //printing the stack
        System.out.println("Print Stack before pop:");
        System.out.println(jar);
        System.out.println(jar.peek());
        System.out.println(jar.search(40));

        Queue<Integer> barrel = new LinkedList<>();
        barrel.add(50);
        barrel.add(60);
        barrel.add(70);
        barrel.add(80);
        barrel.add(90);
        barrel.poll();
        System.out.println("Print Queue before pop:");
        System.out.println(barrel);
        System.out.println(barrel.peek());


    }
}
