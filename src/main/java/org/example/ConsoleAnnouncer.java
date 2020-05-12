package org.example;

public class ConsoleAnnouncer implements Announcer {

    private final Recommendator recommendator = ObjectFactory.getInstance().createObject(Recommendator.class);

    @Override
    public void announce(String message) {
        System.out.println(message);
        recommendator.recommend();
    }

}
