package com.dsimon;

public class Car extends Vehicle {
    private int gear;

    public Car(int turnSpeed, int direction, int speed) {
        super(turnSpeed, direction, speed);
        this.gear = 1;
    }

    public void changeGears(int gearChange) {
        speed += gearChange;
        gear += gearChange;
    }

    @Override
    public void stop() {
        gear = 1;
        System.out.println("Car has stopped");
        super.stop();
    }
}
