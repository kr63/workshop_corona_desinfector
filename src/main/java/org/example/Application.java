package org.example;

import org.example.config.JavaConfig;

import java.util.Map;

public class Application {

    public static ApplicationContext run(String packageToScan, Map<Class, Class> ifc2ImplClass) {
        JavaConfig config = new JavaConfig(packageToScan, ifc2ImplClass);
        ApplicationContext context = new ApplicationContext(config);
        ObjectFactory objectFactory = new ObjectFactory(context);

        // TODO: 5/15/20 init all singletons which are not lazy

        context.setFactory(objectFactory);

        return context;
    }

}
