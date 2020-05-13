package org.example;

import org.example.model.CoronaDisinfector;
import org.example.model.Policeman;
import org.example.model.PolicemanImpl;
import org.example.model.Room;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context =
                Application.run("org.example", new HashMap<>(Map.of(Policeman.class, PolicemanImpl.class)));

        CoronaDisinfector disinfector = context.getObject(CoronaDisinfector.class);
        disinfector.start(new Room());
    }

}
