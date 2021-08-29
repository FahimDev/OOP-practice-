package com.company;

import java.util.ArrayList;

public class Student {
    private String name;
    private String id;
    private String department;
    private float cgpa;
    private ArrayList<Course> courseList;

    Student(){

    }

    Student(String name, String id, String department, float cgpa){
        this.name = name;
        this.id = id;
        this.department = department;
        this.cgpa = cgpa;
        courseList = new ArrayList<Course>();
    }

    public void showInfo(){

        for(Student s : Main.students){
            System.out.println("-------------------------------------------------------->");
            System.out.println("Student Name: "+s.name);
            System.out.println("Student ID: "+s.id);
            System.out.println("Department: "+s.department);
            System.out.println("CGPA: "+s.cgpa);
/*
            for ( String c: s.ENROLLED_COURSES) {
                System.out.println("Course: "+ Main.courses.get(Integer.parseInt(c)).cName);
            }

 */
        }

    }

    public void viewAllCourses(){
        System.out.println("Student Name: "+name);
        System.out.println("Student Name: "+id);
        for (Course courses: courseList) {
            System.out.println("----------------------------------------------------");
            System.out.println("==> Course Name: "+courses.cName+ " Days");
            System.out.println("==> Course Duration: "+courses.duration+ " Days");
            System.out.println("==> Available Seats: "+courses.availableSeat);
        }
    }

    public void dropCourse(Course course){
        courseList.remove(course);
        course.removeStudent(this);
    }

    public void addCourse(Course course){
        if(courseList.size() > 5){
            System.out.println("Five Course Taken. No Slot available.");
        }else{
            courseList.add(course);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

}
