package com.bqjr.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Response {

    /**
     * 生成5位数字随机验证码
     *
     * @return
     */
    public static int createDigitCode() {
        Random rnd = new Random();
        int num = rnd.nextInt(89999) + 10000;
        return num;
    }

    public static Map<String,Object> success() {
       Map<String,Object> map= new HashMap<String,Object>();
        map.put("status","success");
        return map;
    }
    public static <T>  Map<String,Object> success(T data) {
        Map<String,Object> map= new HashMap<String,Object>();
        map.put("status","success");
        map.put("data",data);
        return map;
    }
    public static Object failure(String msg, String errCode) {
        Map<String,Object> map= new HashMap<String,Object>();
        map.put("status","error");
        map.put("code","errCode");
        map.put("msg",msg);
        return map;
    }
}
