package com.raitonbl.keycloak.template;

public final class DefaultSmsTemplateResourceProvider extends ClasspathSmsTemplateResourceProvider implements SmsTemplateResourceProvider {

    public DefaultSmsTemplateResourceProvider() {
        super("template/sms");
    }

}
