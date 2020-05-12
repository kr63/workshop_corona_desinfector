package org.example;

public class CoronaDisinfector {

    @InjectByType
    private Announcer announcer;
    @InjectByType
    private Policeman policeman;

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
