package org.example;

public class CoronaDisinfector {

    public void start(Room room) {
        disinfect(room);
    }

    private void disinfect(Room room) {
        System.out.println("disinfect!");
    }
}
