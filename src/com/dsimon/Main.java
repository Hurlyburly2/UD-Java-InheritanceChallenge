package com.dsimon;

public class Main {

    public static void main(String[] args) {
        DumpTruck dumpTruck = new DumpTruck(10, 100);

        dumpTruck.howMuchDump();
        dumpTruck.dumpDirt();
        dumpTruck.howMuchDump();

        dumpTruck.steering();
        dumpTruck.move();
        dumpTruck.steering();
        dumpTruck.changeGears(2);
        dumpTruck.move();
        dumpTruck.stop();
        dumpTruck.move();
    }
}
