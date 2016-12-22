package com.bqjr.jpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by hp on 2016/12/22.
 */
@Table(name = "user")
@Entity
public class UserDb implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    @Column(name = "username",unique = true, nullable = false)
    private String username;
    @Column(name = "phone")
    private String phone;

    @OneToMany
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private Set<GrilFriend> gfs = new HashSet<>();

   /* //@ManyToMany注释表示Teacher是多对多关系的一端。
    //@JoinTable描述了多对多关系的数据表关系。name属性指定中间表名称，joinColumns定义中间表与Teacher表的外键关系。
    //中间表Teacher_Student的Teacher_ID列是Teacher表的主键列对应的外键列，inverseJoinColumns属性定义了中间表与另外一端(Student)的外键关系。
    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinTable(name = "Teacher_Student",
            joinColumns = { @JoinColumn(name = "Teacher_ID", referencedColumnName = "teacherid") },
            inverseJoinColumns = { @JoinColumn(name = "Student_ID", referencedColumnName = "studentid") })*/
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Set<GrilFriend> getGfs() {
        return gfs;
    }

    public void setGfs(Set<GrilFriend> gfs) {
        this.gfs = gfs;
    }

    @Override
    public String toString() {
        return "UserDb{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", phone='" + phone + '\'' +
                ", gfs=" + gfs +
                '}';
    }
}
