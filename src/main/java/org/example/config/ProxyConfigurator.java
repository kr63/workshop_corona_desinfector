package org.example.config;

public interface ProxyConfigurator {

    Object replaceWithProxyIfNeeded(Object object, Class implClass);

}
