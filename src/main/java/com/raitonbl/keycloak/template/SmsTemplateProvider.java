package com.raitonbl.keycloak.template;

import org.keycloak.models.RealmModel;
import org.keycloak.models.UserModel;
import org.keycloak.provider.Provider;
import org.keycloak.sessions.AuthenticationSessionModel;

import java.util.Map;

public interface SmsTemplateProvider extends Provider {

    SmsTemplateProvider setUser(UserModel user);

    SmsTemplateProvider setRealm(RealmModel realm);

    SmsTemplateProvider setAttribute(String name, Object value);

    SmsTemplateProvider setAuthenticationSession(AuthenticationSessionModel authenticationSession);

    void send(String template, Map<String, Object> attr) throws SmsTemplateException;

    void sendPasswordReset(String code, long expirationInMinutes) throws SmsTemplateException;

    void sendExecuteActions(String code, long expirationInMinutes) throws SmsTemplateException;

    void sendConfirmIdentityBrokerLink(String code, long expirationInMinutes) throws SmsTemplateException;

}
