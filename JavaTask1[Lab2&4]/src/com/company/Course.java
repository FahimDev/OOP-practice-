package com.company;

import java.util.Arrays;
import java.util.ArrayList;

public class Course {
    //Lecture 3
    String cName;
    int credit;
    int duration;//Day
    int availableSeat;
    ArrayList<Student> studentList;

    Course(){
        studentList = new ArrayList<Student>();
    }
    Course(String cName, int credit, int duration, int seats){
        this.cName = cName;
        this.credit = credit;
        this.duration= duration;
        this.availableSeat = seats;
        studentList = new ArrayList<Student>();
    }

    public void setAvailableSeat(int availableSeat){
        this.availableSeat = availableSeat;
    }
    public int getAvailableSeat(){
        return availableSeat;
    }


    public void showInfo(){
        //System.out.println(Main.courses);
        for (Course c: Main.courses){
            System.out.println("########################################################");
            System.out.println("Course Title: "+c.cName);
            System.out.println("Credit: "+c.credit);
            System.out.println("Course Duration: "+c.duration+ " Days");
            System.out.println("Available Seat: "+c.availableSeat);
            /*for ( String s: c.studentList) {
                //System.out.println("Course: "+ Main.courses.get(Integer.parseInt(c)).cName);
            }
             */
            System.out.println("-------------------------------------------------------->");
        }
    }

    public void studentRegister(Student student){


        if(studentList.contains(student) == true){
            System.out.println("This course is taken");
           return;
        }else if(this.availableSeat <= 0){
            System.out.println("No Seat Available");
            return;
        }else{
            studentList.add(student);
            availableSeat--;
            System.out.println("Enrolled Student ("+ cName+"): "+student.getName());

            student.addCourse(this);
        }

    }

    public void removeStudent(Student student){
        studentList.remove(student);
        this.availableSeat++;
    }

}
