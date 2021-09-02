package com.company;

public class Triangle {
    private int x;
    private int y;
    private int z;

    Triangle(){

    }
    Triangle(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void showInfo(){

    }

    public void testTriangle(){
        if(this.x == this.y && this.y == this.z && this.x == this.z){
            System.out.println("The triangle is equilateral");
        }else if(this.x == this.y || this.z == this.x || this.y == this.z){
            System.out.println("The triangle is isosceles");
        }else{
            System.out.println("The triangle is scalene");
        }
        /*
        It will check whether the
        triangle is equilateral (3 equal
        sides), isosceles (2 equal sides),
        scalene (no equal sides)
         */
    }
}
