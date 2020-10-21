package com.raitonbl.keycloak.template;

public class SmsTemplateException extends TemplateException {

    public SmsTemplateException() {
    }

    public SmsTemplateException(String message) {
        super(message);
    }

    public SmsTemplateException(String message, Throwable cause) {
        super(message, cause);
    }

    public SmsTemplateException(Throwable cause) {
        super(cause);
    }

}
