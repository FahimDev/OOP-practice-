package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static List<Student> students = new LinkedList<>();
    public static List<Course> courses = new LinkedList<>();
    //public static HashMap<Integer,Integer> COURSE_REGISTER = new HashMap<>();

    public static void main(String[] args) {
        Student s1 = new Student("Arif","16-32651-3","SE",4);
        Student s2 = new Student("Antonin","16-32675-3","SE",3);
        Student s3 = new Student("Mahir","16-32682-3","CSE",2);
        students.add(s1);
        students.add(s2);
        students.add(s3);

        Student student = new Student();

        Course c1 = new Course("Computer Fundamentals",3,90,30);
        Course c2 = new Course("OOP1 (Java)",3,90,30);
        Course c3 = new Course("OOP2 (C#)",3,90,30);
        Course c4 = new Course("Web Tech",3,90,30);
        Course c5 = new Course("ATP3",3,90,30);
        Course c6 = new Course("OOAD",3,90,30);
        Course c7 = new Course("Math 1",3,90,30);
        Course c8 = new Course("Math 2",3,90,30);
        Course c9 = new Course("Math 3",3,90,30);
        Course c10 = new Course("Math 4",3,90,30);

        courses.add(c1);
        courses.add(c2);
        courses.add(c3);
        courses.add(c4);
        courses.add(c5);
        courses.add(c6);
        courses.add(c7);
        courses.add(c8);
        courses.add(c9);
        courses.add(c10);

        Course course = new Course();

        c8.studentRegister(s2);
        c8.studentRegister(s1);
        c1.studentRegister(s2);

        s2.viewAllCourses();
        s2.dropCourse(c8);
        s2.viewAllCourses();
        s1.viewAllCourses();
        //course.showInfo();//All Courses
        //student.showInfo();//All Students

        //BOOKS
        Book book1 = new Book("Let us C","Yashavant Kanetkar","DX524",
                "Programming", 20 );
        Book book2 = new Book("Introduction to Algorithms","Clifford Stein","DX324",
                "Algorithms", 70 );
        Book book3 = new Book("Cracking the Coding Interview","Gayle Laakmann McDowell"
                ,"MX424","Interview", 40 );
        Book book4 = new Book("Design Patterns: Elements of Reusable Object-Oriented Software",
                "Ralph Johnson","KX357","Design Patterns", 60 );

        Book[] allbooks = {book2,book1,book3,book4};

        // STUDENT BANK ACCOUNT
        Account accountStu1 = new Account(s1.getName(), s1.getId(),5000);
        Account accountStu2 = new Account(s2.getName(), s2.getId(),3500);
        Account accountStu3 = new Account(s3.getName(), s3.getId(),4300);

        //LIBRARY
        Library library = new Library("Bhrammoman Library", "Karwan Bazar Dhaka", allbooks,10);
        library.bankAccount = "103-326-458612";

        Account accountLib = new Account(library.getLibName(), library.bankAccount,0);
        System.out.println("#########################################");
        //return BOOKs to LIBRARY
        //library.bookFineCounter(s2,30);
        System.out.println(s1.getName()+" has been charged "+library.bookFineCounter(book3,30)+"TK (BDT)");
        System.out.println(s1.getName()+" has been charged "+library.bookFineCounter(book2,6)+"TK (BDT)");
        //library.bookFineCounter(s1,60,"I was COVID+",60);
        System.out.println(s2.getName()+" has been charged "+library.bookFineCounter(book4,60,"I was COVID+"
                ,60)+"TK (BDT)");

        //PAY TO THE LIBRARY

        accountStu1.addTransaction(accountStu1,accountLib,library.bookFineCounter(book3,30));

        accountStu1.addTransaction(accountStu2,accountLib,library.bookFineCounter(book4,60,
                "I was COVID+",60));
        accountStu1.addTransaction(accountStu1,accountLib,library.bookFineCounter(book2,6));

        System.out.println("Total Balance of library:" );
        accountLib.showTotalBalance();

        System.out.println("Transaction History:" );
        accountStu1.showAllTranscation();
    }
}
