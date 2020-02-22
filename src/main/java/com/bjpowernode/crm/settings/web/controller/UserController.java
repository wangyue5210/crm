package com.bjpowernode.crm.settings.web.controller;



import com.bjpowernode.crm.exception.loginException;
import com.bjpowernode.crm.settings.domain.User;
import com.bjpowernode.crm.settings.service.UserService;
import com.bjpowernode.crm.settings.service.impl.UserServiceImpl;
import com.bjpowernode.crm.util.MD5Util;
import com.bjpowernode.crm.util.PrintJson;
import com.bjpowernode.crm.util.ServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class UserController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("进入到用户模块控制器");

        String path = request.getServletPath();

        if("/settings/user/login.do".equals(path)){

            login(request,response);

        }else if("/settings/user/xxx.do".equals(path)){

            //xxx(request,response);

        }

    }

    private void login(HttpServletRequest request, HttpServletResponse response) {

        System.out.println("进入到验证登陆的操作");

        String loginAct =request.getParameter("loginAct");
        String loginPwd =request.getParameter("loginPwd");
        loginPwd= MD5Util.getMD5(loginPwd);
        String ip=request.getRemoteAddr();
        System.out.println(ip);
        //未来业务层开发，统一使用代理形态的接口对象
        UserService userService= (UserService) ServiceFactory.getService(new UserServiceImpl());
        User user= null;
        try {
            user = userService.login(loginAct,loginPwd,ip);
            //如果程序能够走到这证明登陆成功


            request.getSession().setAttribute("user", user);
            PrintJson.printJsonFlag(response, true);
        } catch (loginException e) {
            e.printStackTrace();

            //业务层为我们抛出了异常

            String msg=e.getMessage();
            Map<String,Object> map=new HashMap<>();
            map.put("success",false );
            map.put("msg", msg);
            PrintJson.printJsonObj(response,map);

        }


    }
}































