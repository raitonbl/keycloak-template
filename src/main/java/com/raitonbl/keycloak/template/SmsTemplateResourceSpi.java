package com.raitonbl.keycloak.template;

import org.keycloak.provider.Provider;
import org.keycloak.provider.ProviderFactory;
import org.keycloak.provider.Spi;

public class SmsTemplateResourceSpi implements Spi {

    @Override
    public boolean isInternal() {
        return Boolean.FALSE;
    }

    @Override
    public String getName() {
        return "sms-template-resource";
    }

    @Override
    public Class<? extends Provider> getProviderClass() {
        return SmsTemplateResourceProvider.class;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class<? extends ProviderFactory> getProviderFactoryClass() {
        return SmsTemplateResourceProviderFactory.class;
    }

}
