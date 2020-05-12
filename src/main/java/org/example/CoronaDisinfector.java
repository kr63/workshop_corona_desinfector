package org.example;

public class CoronaDisinfector {

    private final Announcer announcer = ObjectFactory.getInstance().createObject(Announcer.class);
    private final Policeman policeman = ObjectFactory.getInstance().createObject(Policeman.class);

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
