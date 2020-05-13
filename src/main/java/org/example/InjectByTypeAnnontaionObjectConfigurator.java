package org.example;

import lombok.SneakyThrows;

import java.lang.reflect.Field;

public class InjectByTypeAnnontaionObjectConfigurator implements ObjectConfigurator {

    @SneakyThrows
    @Override
    public void configure(Object object, ApplicationContext context) {
        for (Field field : object.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(InjectByType.class)) {
                field.setAccessible(true);
                Object value = context.getObject(field.getType());
                field.set(object, value);
            }
        }
    }

}
