package com.study.security.oauth.oauthstudy.user.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Users {
    @Id @GeneratedValue
    private Long idx;
    private String id;
    private String email;
    private int solvedQuestionCount;
}
