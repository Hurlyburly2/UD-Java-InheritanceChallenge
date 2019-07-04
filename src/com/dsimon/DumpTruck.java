package com.dsimon;

public class DumpTruck extends Car {
    private int poundsOfDirt;

    public DumpTruck(int speed, int poundsOfDirt) {
        super(1, 0, speed);
        this.poundsOfDirt = poundsOfDirt;
    }

    public int getPoundsOfDirt() {
        return poundsOfDirt;
    }

    public void setPoundsOfDirt(int poundsOfDirt) {
        this.poundsOfDirt = poundsOfDirt;
    }

    public void dumpDirt() {
        poundsOfDirt = 0;
    }

    public void howMuchDump() {
        if (poundsOfDirt > 0) {
            System.out.println("We have " + poundsOfDirt + " pounds to dump.");
        } else {
            System.out.println("No more dirt!");
        }
    }
}
