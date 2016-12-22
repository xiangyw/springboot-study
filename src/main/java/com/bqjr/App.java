package com.bqjr;

import com.bqjr.configuration.CommonPropertiesConfig;
import com.bqjr.configuration.CommonYmlConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by hp on 2016/12/21.
 */
@SpringBootApplication
@ComponentScan
@EnableConfigurationProperties({CommonYmlConfig.class, CommonPropertiesConfig.class})
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
