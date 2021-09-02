package com.company;

public class MovablePoint implements MovableInterface {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    MovablePoint(){

    }

    MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public String toString(){
        return "0";
    }
    @Override
    public void moveUp(){

    }
    @Override
    public void moveDown(){

    }
    @Override
    public void moveLeft(){

    }
    @Override
    public void moveRight(){

    }
}
