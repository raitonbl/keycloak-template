package com.raitonbl.keycloak.template;

public class SmsTemplateLoadException extends TemplateException {

    public SmsTemplateLoadException() {
    }

    public SmsTemplateLoadException(String message) {
        super(message);
    }

    public SmsTemplateLoadException(String message, Throwable cause) {
        super(message, cause);
    }

    public SmsTemplateLoadException(Throwable cause) {
        super(cause);
    }

}
