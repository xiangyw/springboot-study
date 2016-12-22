package com.bqjr.configuration;

/**
 * Created by hp on 2016/12/21.
 */

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.*;

/**
 * 演示读取yml配置文件
 * Created by hp on 2016/12/21.
 */
@ConfigurationProperties(prefix = "spring.data.mongodb",locations = "classpath:common.yml")
public class CommonYmlConfig {

    private String host;
    private String port;
    private String username;
    private String password;
    private String database;
    private String authenticationDatabase;

    private String[] arrayProps;
    private List<Map<String, String>> listmap = new ArrayList<Map<String, String>>(); //接收prop1里面的属性值
    private List<String> list = new ArrayList<String>(); //接收prop2里面的属性值
    private Map<String, String> map = new HashMap<String, String>(); //接收prop1里面的属性值

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getAuthenticationDatabase() {
        return authenticationDatabase;
    }

    public void setAuthenticationDatabase(String authenticationDatabase) {
        this.authenticationDatabase = authenticationDatabase;
    }

    public String[] getArrayProps() {
        return arrayProps;
    }

    public void setArrayProps(String[] arrayProps) {
        this.arrayProps = arrayProps;
    }

    public List<Map<String, String>> getListmap() {
        return listmap;
    }

    public void setListmap(List<Map<String, String>> listmap) {
        this.listmap = listmap;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "CommonYmlConfig{" +
                "host='" + host + '\'' +
                ", port='" + port + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", database='" + database + '\'' +
                ", authenticationDatabase='" + authenticationDatabase + '\'' +
                ", arrayProps=" + Arrays.toString(arrayProps) +
                ", listmap=" + listmap +
                ", list=" + list +
                ", map=" + map +
                '}';
    }
}
