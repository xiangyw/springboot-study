package com.bqjr.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Created by Panda on 2016/10/31.
 *
 * @version 1.0
 * @description com.bqjr.commons.utils.SpringUtil
 */
@Component
public class SpringUtil implements ApplicationContextAware {

    private static ApplicationContext applicationContext = null;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if (SpringUtil.applicationContext == null) {
            SpringUtil.applicationContext = applicationContext;
        }
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    //通过class获取Bean.

    public static <T> T getBean(Class<T> clazz){

        return getApplicationContext().getBean(clazz);

    }



    //通过name,以及Clazz返回指定的Bean

    public static <T> T getBean(String name,Class<T> clazz){

        return getApplicationContext().getBean(name, clazz);

    }
}
