package com.bjpowernode.crm.workbench.web.controller;

import com.bjpowernode.crm.settings.domain.User;
import com.bjpowernode.crm.settings.service.UserService;
import com.bjpowernode.crm.settings.service.impl.UserServiceImpl;
import com.bjpowernode.crm.util.DateTimeUtil;
import com.bjpowernode.crm.util.PrintJson;
import com.bjpowernode.crm.util.ServiceFactory;
import com.bjpowernode.crm.util.UUIDUtil;
import com.bjpowernode.crm.vo.PaginationVO;
import com.bjpowernode.crm.workbench.domain.Activity;
import com.bjpowernode.crm.workbench.domain.ActivityRemark;
import com.bjpowernode.crm.workbench.service.ActivityService;
import com.bjpowernode.crm.workbench.service.impl.ActivityServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ActivityController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("进入市场模块控制器");
        String path = req.getServletPath();
        if ("/workbench/activity/getUserList.do".equals(path)){
            getUserList(req, resp);
        }else if ("/workbench/activity/save.do".equals(path)){
           save(req,resp);
        }else if ("/workbench/activity/pageList.do".equals(path)){
            pageList(req,resp);
        }else if ("/workbench/activity/delete.do".equals(path)){
            delete(req,resp);
        }else if ("/workbench/activity/getUserListAndActivity.do".equals(path)){
            getUserListAndActivity(req,resp);
        }else if ("/workbench/activity/update.do".equals(path)){
            update(req,resp);
        }else if ("/workbench/activity/detail.do".equals(path)){
            detail(req,resp);
        }else if ("/workbench/activity/getRemarkListByAid.do".equals(path)){
            getRemarkListByAid(req,resp);
        }else if ("/workbench/activity/deleteRemark.do".equals(path)){
            deleteRemark(req,resp);
        }else if ("/workbench/activity/saveRemark.do".equals(path)){
            saveRemark(req,resp);
        }else if ("/workbench/activity/updateRemark.do".equals(path)){
            updateRemark(req,resp);
        }

    }

    private void updateRemark(HttpServletRequest req, HttpServletResponse resp) {
        String id=req.getParameter("id");
        String noteContent=req.getParameter("noteContent");
        String editTime= DateTimeUtil.getSysTime();
        String editBy=((User)req.getSession().getAttribute("user")).getName();
        String editFlag="1";

        ActivityRemark activityRemark=new ActivityRemark();

        activityRemark.setNoteContent(noteContent);
        activityRemark.setId(id);
        activityRemark.setEditTime(editTime);
        activityRemark.setEditBy(editBy);
        activityRemark.setEditFlag(editFlag);

        ActivityService as= (ActivityService) ServiceFactory.getService(new ActivityServiceImpl());
        boolean flag=as.updateRemark(activityRemark);

        Map<String,Object> map=new HashMap<>();
        map.put("ar",activityRemark);
        map.put("success",flag);
        PrintJson.printJsonObj(resp,map);
    }

    private void saveRemark(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("saveRemark");
        String noteContent=req.getParameter("noteContent");
        String activityId=req.getParameter("activityId");
        String id=UUIDUtil.getUUID();
        String createTime= DateTimeUtil.getSysTime();
        String createBy=((User)req.getSession().getAttribute("user")).getName();
        String editFlag="0";

        ActivityRemark activityRemark=new ActivityRemark();
        activityRemark.setActivityId(activityId);
        activityRemark.setNoteContent(noteContent);
        activityRemark.setId(id);
        activityRemark.setCreateTime(createTime);
        activityRemark.setCreateBy(createBy);
        activityRemark.setEditFlag(editFlag);

        ActivityService as= (ActivityService) ServiceFactory.getService(new ActivityServiceImpl());
        boolean flag=as.saveRemark(activityRemark);

        Map<String,Object> map=new HashMap<>();
        map.put("ar",activityRemark);
        map.put("success",flag);
        PrintJson.printJsonObj(resp,map);
        System.out.println(activityRemark.getNoteContent());
        System.out.println(noteContent);
        System.out.println(activityId);

    }

    private void deleteRemark(HttpServletRequest req, HttpServletResponse resp) {

        String id=req.getParameter("id");
        ActivityService as= (ActivityService) ServiceFactory.getService(new ActivityServiceImpl());
        boolean success=as.deleteRemark(id);
        PrintJson.printJsonFlag(resp,success);

    }

    private void getRemarkListByAid(HttpServletRequest req, HttpServletResponse resp) {

        String id=req.getParameter("activityId");
        ActivityService as= (ActivityService) ServiceFactory.getService(new ActivityServiceImpl());
        List<ActivityRemark> activityRemarks=as.getRemarkListByAid(id);

        PrintJson.printJsonObj(resp,activityRemarks);



    }

    private void detail(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("进入到调转到详情信息页的操作");
        String id=req.getParameter("id");

        ActivityService as= (ActivityService) ServiceFactory.getService(new ActivityServiceImpl());
        Activity a=as.detail(id);
        req.setAttribute("a",a);
        //只能用转发，重定向值将不存在
        req.getRequestDispatcher("/workbench/activity/detail.jsp").forward(req,resp);
    }

    private void update(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("执行市场活动修改操作");
        String id= req.getParameter("id");
        String owner=req.getParameter("owner");
        String name=req.getParameter("name");
        String startDate=req.getParameter("startDate");
        String endDate=req.getParameter("endDate");
        String cost=req.getParameter("cost");
        String description=req.getParameter("description");
        String editTime= DateTimeUtil.getSysTime();
        String editBy=((User)req.getSession().getAttribute("user")).getName();

        Activity a=new Activity();
        a.setId(id);
        a.setOwner(owner);
        a.setName(name);
        a.setStartDate(startDate);
        a.setEndDate(endDate);
        a.setCost(cost);
        a.setDescription(description);
        a.setEditBy(editBy);
        a.setEditTime(editTime);

        ActivityService as= (ActivityService) ServiceFactory.getService(new ActivityServiceImpl());
        boolean flag=as.update(a);
        PrintJson.printJsonFlag(resp, flag);

    }

    private void getUserListAndActivity(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("进入到用户列表和市场活动列表");
        String id=req.getParameter("id");
        ActivityService as= (ActivityService) ServiceFactory.getService(new ActivityServiceImpl());


        /*
          uList
          a
          复用率不高
          map
         */

        Map<String,Object> map=as.getUserListAndActivity(id);

        PrintJson.printJsonObj(resp,map);



    }

    private void delete(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("进入市场活动的删除");
        String ids[] =req.getParameterValues("id");
        //System.out.println(ids);
        ActivityService as= (ActivityService) ServiceFactory.getService(new ActivityServiceImpl());
        boolean flag= as.delete(ids);
        PrintJson.printJsonFlag(resp,flag);



    }

    private void pageList(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("进入查询市场活动操作列表操作（条件查询和分页查询）");
        String name=req.getParameter("name");
        String owner=req.getParameter("owner");
        String startDate=req.getParameter("startDate");
        String endDate=req.getParameter("endDate");
        String pageNoStr=req.getParameter("pageNo");
        String pageSizeStr=req.getParameter("pageSize");

        int pageSize=Integer.parseInt(pageSizeStr);
        int pageNo=Integer.parseInt(pageNoStr);
        int skipNo=(pageNo-1)*pageSize;

        Map<String,Object> map=new HashMap<>();
        map.put("name",name);
        map.put("owner",owner);
        map.put("startDate",startDate);
        map.put("endDate",endDate);
        map.put("pageSize",pageSize);
        map.put("skipNo",skipNo);

        /*
         将来分页查询每一个模块都有，所以使用一个通用vo
         */
        ActivityService activityService= (ActivityService) ServiceFactory.getService(new ActivityServiceImpl());
        PaginationVO<Activity> vo =activityService.pageList(map);
        PrintJson.printJsonObj(resp,vo);


    }

    private void getUserList(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("进入查询用户操作列表操作");
        UserService userService= (UserService) ServiceFactory.getService(new UserServiceImpl());
        List<User> userList =userService.getUserList();
        PrintJson.printJsonObj(resp, userList);
    }

    private void save(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("执行市场活动添加操作");


        String id= UUIDUtil.getUUID();
        String owner=req.getParameter("owner");
        String name=req.getParameter("name");
        String startDate=req.getParameter("startDate");
        String endDate=req.getParameter("endDate");
        String cost=req.getParameter("cost");
        String description=req.getParameter("description");
        String createTime= DateTimeUtil.getSysTime();
        String createBy=((User)req.getSession().getAttribute("user")).getName();
        Activity a=new Activity();
        a.setId(id);
        a.setOwner(owner);
        a.setName(name);
        a.setStartDate(startDate);
        a.setEndDate(endDate);
        a.setCost(cost);
        a.setDescription(description);
        a.setCreateTime(createTime);
        a.setCreateBy(createBy);

        ActivityService as= (ActivityService) ServiceFactory.getService(new ActivityServiceImpl());
        boolean flag=as.save(a);
        PrintJson.printJsonFlag(resp, flag);

    }

}
