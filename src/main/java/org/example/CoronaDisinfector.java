package org.example;

public class CoronaDisinfector {

    private Announcer announcer = new ConsoleAnnouncer();
    private Policeman policeman = new PolicemanImpl();

    public void start(Room room) {
        announcer.announce("disinfect begin!");
        policeman.makePeopleLeaveRoom();
        disinfect(room);
        announcer.announce("can back hoom");
    }

    private void disinfect(Room room) {
        System.out.println("disinfect!");
    }
}
