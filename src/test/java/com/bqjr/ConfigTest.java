package com.bqjr;

import com.bqjr.configuration.CommonPropertiesConfig;
import com.bqjr.configuration.CommonYmlConfig;
import com.bqjr.mongo.services.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by hp on 2016/12/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = App.class)
public class ConfigTest {
    @Autowired
    private CommonPropertiesConfig commonPropertiesConfig;
    @Autowired
    private CommonYmlConfig commonYmlConfig;
    @Autowired
    private UserService userService;

    @Test
    public void testPropConfig() {
        System.out.println("commonPropertiesConfig: " + commonPropertiesConfig.toString());
    }
    @Test
    public void testYmlConfig() {
        System.out.println("commonYmlConfig: " + commonYmlConfig.toString());
    }
    @Test
    public void testFindAllUser() {
        System.out.println("testFindAllUser: " + userService.findAll());
    }
}
