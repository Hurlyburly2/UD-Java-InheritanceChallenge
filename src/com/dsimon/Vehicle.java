package com.dsimon;

public class Vehicle {
    protected int turnSpeed;
    protected int direction;
    protected int speed;

    public Vehicle(int turnSpeed, int direction, int speed) {
        this.turnSpeed = turnSpeed;
        this.direction = direction;
        this.speed = speed;
    }

    public int getTurnSpeed() {
        return turnSpeed;
    }

    public void setTurnSpeed(int turnSpeed) {
        this.turnSpeed = turnSpeed;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void steering() {
        direction += turnSpeed;
        System.out.println("You are going in direction " + direction);
    }

    public void move() {
        System.out.println("Moving at " + speed + " in direction: " + direction);
    }

    public void stop() {
        speed = 0;
        System.out.println("Vehicle has stopped");
    }
}
