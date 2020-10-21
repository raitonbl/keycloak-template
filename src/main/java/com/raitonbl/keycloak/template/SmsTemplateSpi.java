package com.raitonbl.keycloak.template;

import org.keycloak.provider.ProviderFactory;
import org.keycloak.provider.Spi;

public class SmsTemplateSpi implements Spi {

    @Override
    public boolean isInternal() {
        return Boolean.FALSE;
    }

    @Override
    public String getName() {
        return "sms-template";
    }

    @Override
    public Class<? extends SmsTemplateProvider> getProviderClass() {
        return SmsTemplateProvider.class;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class<? extends ProviderFactory> getProviderFactoryClass() {
        return SmsTemplateProviderFactory.class;
    }

}
