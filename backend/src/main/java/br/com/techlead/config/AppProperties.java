package br.com.techlead.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppProperties {

    @Value("${security.jwt.token.secret:secret}")
    private String tokenSecret = ")4QSvMKu_2j)2WWvc#";

    public String getTokenSecret() {

        return tokenSecret;
    }
}
