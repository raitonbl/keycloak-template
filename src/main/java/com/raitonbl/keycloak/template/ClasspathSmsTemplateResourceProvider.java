package com.raitonbl.keycloak.template;

import org.jboss.resteasy.logging.Logger;

import java.io.InputStream;
import java.net.URL;
import java.util.Locale;
import java.util.Properties;

public class ClasspathSmsTemplateResourceProvider implements SmsTemplateResourceProvider {

    private final String path;
    private Logger LOG = Logger.getLogger(ClasspathSmsTemplateResourceProvider.class);

    public ClasspathSmsTemplateResourceProvider() {
        this(null);
    }

    public ClasspathSmsTemplateResourceProvider(String path) {
        this.path = path;
    }

    @Override
    public URL getTemplate(String name) {
        try {

            if (name == null) {
                return null;
            }

            return getClass().getClassLoader().getResource(this.path == null ? name : this.path + "/" + name);
        } catch (Exception ex) {
            throw new SmsTemplateLoadException(ex);
        }
    }

    @Override
    public InputStream getResourceAsStream(String name) {
        try {

            if (name == null) {
                return null;
            }

            return getClass().getClassLoader().getResourceAsStream(this.path == null ? name : this.path + "/" + name);
        } catch (Exception ex) {
            throw new SmsTemplateLoadException(ex);
        }
    }

    public Properties getMessages(String bundle, Locale locale) {
        try {

            if (bundle == null || locale == null) {
                return new Properties();
            }

            String filename = (this.path == null ? "messages/" + bundle : this.path + "/" + "messages/" + bundle) + "/messages_" + locale.toString() + ".properties";

            InputStream io = getClass().getClassLoader().getResourceAsStream(filename);

            Properties properties = new Properties();

            if (io == null) {
                return properties;
            }

            properties.load(getClass().getClassLoader().getResourceAsStream(filename));
            return properties;
        } catch (Exception ex) {
            throw new SmsTemplateLoadException(ex);
        }
    }

    @Override
    public void close() {
        // DO NOTHING
    }

}
