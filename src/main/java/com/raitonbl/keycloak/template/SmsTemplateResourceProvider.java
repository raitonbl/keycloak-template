package com.raitonbl.keycloak.template;

import org.keycloak.provider.Provider;

import java.io.InputStream;
import java.net.URL;
import java.util.Locale;
import java.util.Properties;

public interface SmsTemplateResourceProvider extends Provider {

    URL getTemplate(String name);

    InputStream getResourceAsStream(String name);

    default Properties getMessages(String bundle, Locale locale) {
        return new Properties();
    }

}
