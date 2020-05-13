package org.example;

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
