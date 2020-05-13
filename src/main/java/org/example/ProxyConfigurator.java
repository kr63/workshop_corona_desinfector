package org.example;

public interface ProxyConfigurator {

    Object replaceWithProxyIfNeeded(Object object, Class implClass);

}
