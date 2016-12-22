package com.bqjr.redis.entity;

import java.io.Serializable;

/**
 * Created by hp on 2016/12/21.
 */
public class UserRedis implements Serializable {

    private Long id;

    private String username;
    private Integer age;

    public UserRedis() {
    }

    public UserRedis(Long id, String username, Integer age) {
        this.id = id;
        this.username = username;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}