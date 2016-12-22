package com.bqjr.jpa.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by hp on 2016/12/22.
 */
@Table(name = "grilfriend")
@Entity
public class GrilFriend implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    @Column(name = "user_id")
    private long userId;
    @Column(name = "name")
    private String name;
    @Column(name = "bwh")
    private String bwh;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBwh() {
        return bwh;
    }

    public void setBwh(String bwh) {
        this.bwh = bwh;
    }

    @Override
    public String toString() {
        return "GrilFriend{" +
                "id=" + id +
                ", userId=" + userId +
                ", username='" + name + '\'' +
                ", bwh='" + bwh + '\'' +
                '}';
    }
}
