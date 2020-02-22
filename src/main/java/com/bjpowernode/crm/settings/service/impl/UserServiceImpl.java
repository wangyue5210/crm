package com.bjpowernode.crm.settings.service.impl;
import com.bjpowernode.crm.exception.loginException;
import com.bjpowernode.crm.settings.dao.UserDao;
import com.bjpowernode.crm.settings.domain.User;
import com.bjpowernode.crm.settings.service.UserService;
import com.bjpowernode.crm.util.DateTimeUtil;
import com.bjpowernode.crm.util.SqlSessionUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService {
    private UserDao userDao= SqlSessionUtil.getSqlSession().getMapper(UserDao.class);
    @Override
    public User login(String loginAct, String loginPwd, String ip) throws loginException {
        Map<String,String> map=new HashMap<>();
        map.put("loginAct", loginAct);
        map.put("loginPwd",loginPwd );
        User user=userDao.login(map);
        if (user==null){
            throw new loginException("账号密码不正确");
        }

        String expireTime=user.getExpireTime();

        if (expireTime.compareTo(DateTimeUtil.getSysTime())<0){
            throw new loginException("账号已失效");

        }
        String lockState=user.getLockState();
        if ("0".equals(lockState)){
            throw new loginException("账号已锁定");
        }
        String allowIps=user.getAllowIps();
        if (!allowIps.contains(ip)){
            throw new loginException("ip地址受限");

        }

        //成功,返回user

        return user;
    }

    @Override
    public List<User> getUserList() {
        List<User> userList=userDao.getUserList();
        return userList;
    }
}
