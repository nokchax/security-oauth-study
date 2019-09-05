package com.study.security.oauth.oauthstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//spring security automatically applied with out annotation @EnableWebSecurity
public class OauthStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(OauthStudyApplication.class, args);
    }

}
