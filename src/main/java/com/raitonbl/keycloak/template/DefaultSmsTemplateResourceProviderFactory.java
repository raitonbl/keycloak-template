package com.raitonbl.keycloak.template;

import org.keycloak.Config;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;

public class DefaultSmsTemplateResourceProviderFactory implements SmsTemplateResourceProviderFactory {

    private static final SmsTemplateResourceProvider SINGLETON = new DefaultSmsTemplateResourceProvider();

    @Override
    public SmsTemplateResourceProvider create(KeycloakSession keycloakSession) {
        return SINGLETON;
    }

    @Override
    public void init(Config.Scope scope) {
        //DO NOTHING
    }

    @Override
    public void postInit(KeycloakSessionFactory keycloakSessionFactory) {
        //DO NOTHING
    }

    @Override
    public void close() {
        //DO NOTHING
    }

    @Override
    public String getId() {
        return "default";
    }

    @Override
    public int order() {
        return 0;
    }

}
