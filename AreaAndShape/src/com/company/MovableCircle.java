package com.company;

public class MovableCircle extends MovablePoint implements MovableInterface{

    private int radious;
    MovablePoint center;

    MovableCircle(){

    }

    MovableCircle(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = ySpeed;
        this.ySpeed = ySpeed;
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
