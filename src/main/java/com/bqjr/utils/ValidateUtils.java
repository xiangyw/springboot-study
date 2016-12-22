package com.bqjr.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Jaeger on 2016/10/23.
 */
public class ValidateUtils {

    public static boolean isCharNumber(String charNumber) {
        Pattern p = Pattern.compile("^([a-zA-Z0-9]+)$");
        Matcher m = p.matcher(charNumber);
        return  m.matches();
    }

    public static boolean isChinese(String chinese) {
        Pattern p = Pattern.compile("^[\\u4e00-\\u9fa5]+$");
        Matcher m = p.matcher(chinese);
        return  m.matches();
    }

    public static boolean isMobileNumber(String mobileNumber) {
        Pattern p = Pattern.compile("^(((13[0-9]{1})|(15[0-9]{1})|(17[0-9]{1}))+\\d{8})$");
        Matcher m = p.matcher(mobileNumber);
        return  m.matches();
    }

    public static boolean isPhoneNumber(String phoneNumber) {
        Pattern p = Pattern.compile("^(0[0-9]{2,3}\\-)?([2-9][0-9]{6,7})+(\\-[0-9]{1,4})?$");
        Matcher m = p.matcher(phoneNumber);
        return  m.matches();
    }

    public static boolean isZipCode(String zipCode) {
        Pattern p = Pattern.compile("^[0-9]{6}$");
        Matcher m = p.matcher(zipCode);
        return  m.matches();
    }

    public static boolean isQQNumber(String QQNumber) {
        Pattern p = Pattern.compile("^[1-9]\\d{4,9}$");
        Matcher m = p.matcher(QQNumber);
        return  m.matches();
    }

    public static boolean isIPAddress(String IPAddress) {
        Pattern p = Pattern.compile("^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
        Matcher m = p.matcher(IPAddress);
        return  m.matches();
    }

    public static boolean isEmailAddress(String emailAddress) {
        Pattern p = Pattern.compile("^([a-zA-Z0-9]+[_|\\_|\\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\\_|\\.]?)*[a-zA-Z0-9]+\\.[a-zA-Z]{2,3}$");
        Matcher m = p.matcher(emailAddress);
        return  m.matches();
    }
}
