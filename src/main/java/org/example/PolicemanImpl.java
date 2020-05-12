package org.example;

public class PolicemanImpl implements Policeman {

    @InjectByType
    private Recommendator recommendator;

    public PolicemanImpl() {
        System.out.println(recommendator.getClass());
    }

    @Override
    public void makePeopleLeaveRoom() {
        System.out.println(recommendator.getClass());
        System.out.println("bang-bang");
    }

}
