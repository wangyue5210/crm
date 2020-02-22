package com.bjpowernode.settings.user.test;/*
 *张晓光
 *2019/6/28
 *
 */

import com.bjpowernode.crm.util.DateTimeUtil;
import com.bjpowernode.crm.util.MD5Util;

public class Test01 {
    public static void main(String[] args) {
        //System.out.println("123");
       /* String expireTime="2018-10-10 10:10:10";
        String currentTime= DateTimeUtil.getSysTime();
        int count=expireTime.compareTo(currentTime);
        System.out.println(count);*/


        /*String ip = "192.168.1.6";
        String allowIps="192.168.1.1,192.168.1.2,192.168.1.3";
        if (!allowIps.contains(ip)){
            System.out.println("ip地址无效");
        }*/
        String str="123";
        str= MD5Util.getMD5(str);
        System.out.println(str);









    }
}
