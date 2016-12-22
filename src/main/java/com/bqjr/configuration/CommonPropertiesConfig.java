package com.bqjr.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 演示读取properties配置文件
 * Created by hp on 2016/12/21.
 */
@ConfigurationProperties(prefix = "spring.redis",locations = "classpath:common.properties")
public class CommonPropertiesConfig {

    private String host;
    private String port;
    private String pass;

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

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "CommonPropertiesConfig{" +
                "host='" + host + '\'' +
                ", port='" + port + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
