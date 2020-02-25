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
import com.bjpowernode.crm.workbench.domain.Clue;
import com.bjpowernode.crm.workbench.domain.Tran;
import com.bjpowernode.crm.workbench.service.ActivityService;
import com.bjpowernode.crm.workbench.service.ClueService;
import com.bjpowernode.crm.workbench.service.impl.ActivityServiceImpl;
import com.bjpowernode.crm.workbench.service.impl.ClueServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClueController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("进入线索模块控制器");
        String path = req.getServletPath();
        if ("/workbench/clue/getUserList.do".equals(path)){
            getUserList(req, resp);
        }else if ("/workbench/clue/save.do".equals(path)){
           save(req,resp);
        }else if ("/workbench/clue/detail.do".equals(path)){
            detail(req,resp);
        }else if ("/workbench/clue/pageList.do".equals(path)){
            pageList(req,resp);
        }else if ("/workbench/clue/detail.do".equals(path)){
            detail(req,resp);
        }else if ("/workbench/clue/getActivityListByClueId.do".equals(path)){
            getActivityListByClueId(req,resp);
        }else if ("/workbench/clue/unbund.do".equals(path)){
            unbund(req,resp);
        }else if ("/workbench/clue/getActivityListByNameAndNotByClueId.do".equals(path)){
            getActivityListByNameAndNotByClueId(req,resp);
        }else if ("/workbench/clue/bund.do".equals(path)){
            bund(req,resp);
        }else if ("/workbench/clue/getActivityListByName.do".equals(path)){
            getActivityListByName(req,resp);
        }else if ("/workbench/clue/convert.do".equals(path)){
            convert(req,resp);
        }




    }

    private void convert(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {

        System.out.println("执行线索转换的操作");

        String createBy = ((User)request.getSession().getAttribute("user")).getName();

        String clueId = request.getParameter("clueId");

        String flag = request.getParameter("flag");

        Tran t = null;

        //如果标记为a，说明需要创建交易
        if("a".equals(flag)){

            t = new Tran();

            //如果需要创建交易，需要接收交易表单中的参数
            String money = request.getParameter("money");
            String name = request.getParameter("name");
            String expectedDate = request.getParameter("expectedDate");
            String stage = request.getParameter("stage");
            String activityId = request.getParameter("activityId");
            //控制器中处理的其他字段信息
            String id = UUIDUtil.getUUID();
            String createTime = DateTimeUtil.getSysTime();

            t.setId(id);
            t.setMoney(money);
            t.setName(name);
            t.setExpectedDate(expectedDate);
            t.setStage(stage);
            t.setActivityId(activityId);
            t.setCreateBy(createBy);
            t.setCreateTime(createTime);

        }

        /*

            当程序执行到了此行，说明我们一定已经为是否已经创建交易做出了一个明确的判断

            我们需要将t对象处理到业务层去，如果t为null，说明不需要创建交易，如果t不为null，说明需要创建交易

         */


        /*

            接下来我们创建业务层对象
            让业务层帮我们处理线索转换的业务逻辑

            我们要为业务层传递哪些参数？
            clueId：业务层拿到该参数，才能够执行线索的转换操作
            t：业务层拿到该参数，执行创建交易的操作（在业务层需要判断，如果t不为null，才创建交易）


         */
        ClueService cs = (ClueService) ServiceFactory.getService(new ClueServiceImpl());

        boolean flag1 = cs.convert(clueId,t,createBy);

        if(flag1){

            response.sendRedirect(request.getContextPath() + "/workbench/clue/index.jsp");

        }




    }

    private void getActivityListByName(HttpServletRequest request, HttpServletResponse response) {

        System.out.println("查询市场活动列表（根据名称模糊查）");

        String aname = request.getParameter("aname");

        ActivityService as = (ActivityService) ServiceFactory.getService(new ActivityServiceImpl());

        List<Activity> aList = as.getActivityListByName(aname);

        PrintJson.printJsonObj(response,aList);


    }

    private void bund(HttpServletRequest request, HttpServletResponse response) {

        System.out.println("进入到关联市场活动的操作");

        String cid = request.getParameter("cid");
        String aids[] = request.getParameterValues("aid");

        ClueService cs = (ClueService) ServiceFactory.getService(new ClueServiceImpl());

        boolean flag = cs.bund(cid,aids);

        PrintJson.printJsonFlag(response,flag);


    }

    private void getActivityListByNameAndNotByClueId(HttpServletRequest request, HttpServletResponse response) {

        System.out.println("查询市场活动信息列表（根据名称模糊查+排除掉已经与线索关联过的市场活动）");

        String aname = request.getParameter("aname");
        String clueId = request.getParameter("clueId");

        Map<String,String> map = new HashMap<String, String>();
        map.put("aname",aname);
        map.put("clueId",clueId);

        ActivityService as = (ActivityService) ServiceFactory.getService(new ActivityServiceImpl());

        List<Activity> aList = as.getActivityListByNameAndNotByClueId(map);

        PrintJson.printJsonObj(response,aList);


    }

    private void unbund(HttpServletRequest request, HttpServletResponse response) {

        System.out.println("执行解除关联操作");

        String id = request.getParameter("id");

        ClueService cs = (ClueService) ServiceFactory.getService(new ClueServiceImpl());

        boolean flag = cs.unbund(id);

        PrintJson.printJsonFlag(response,flag);


    }

    private void getActivityListByClueId(HttpServletRequest request, HttpServletResponse response) {

        System.out.println("查询指定线索关联的市场活动列表");

        String clueId = request.getParameter("clueId");

        ActivityService as = (ActivityService) ServiceFactory.getService(new ActivityServiceImpl());

        List<Activity> aList = as.getActivityListByClueId(clueId);

        PrintJson.printJsonObj(response,aList);

    }

    private void pageList(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("进入线索操作列表操作（条件查询和分页查询）");
        String fullname=req.getParameter("fullname");
        String company=req.getParameter("company");
        String phone=req.getParameter("phone");
        String mphone=req.getParameter("mphone");
        String source=req.getParameter("source");
        String owner=req.getParameter("owner");
        String state=req.getParameter("state");


        String pageNoStr=req.getParameter("pageNo");
        String pageSizeStr=req.getParameter("pageSize");

        int pageSize=Integer.parseInt(pageSizeStr);
        int pageNo=Integer.parseInt(pageNoStr);
        int skipNo=(pageNo-1)*pageSize;

        Map<String,Object> map=new HashMap<>();
        map.put("fullname",fullname);
        map.put("company",company);
        map.put("phone",phone);
        map.put("mphone",mphone);
        map.put("source",source);
        map.put("owner",owner);
        map.put("state",state);

        map.put("pageSize",pageSize);
        map.put("skipNo",skipNo);

        /*
         将来分页查询每一个模块都有，所以使用一个通用vo
         */
        ClueService cs = (ClueService) ServiceFactory.getService(new ClueServiceImpl());
        PaginationVO<Clue> vo =cs.pageList(map);
        PrintJson.printJsonObj(resp,vo);
    }

    private void detail(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {

        System.out.println("跳转到线索详细信息页的操作");

        String id = request.getParameter("id");

        ClueService cs = (ClueService) ServiceFactory.getService(new ClueServiceImpl());

        Clue c = cs.detail(id);

        request.setAttribute("c",c);
        request.getRequestDispatcher("/workbench/clue/detail.jsp").forward(request,response);


    }

    private void save(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("执行线索的添加操作");

        String id = UUIDUtil.getUUID();
        String fullname = request.getParameter("fullname");
        String appellation = request.getParameter("appellation");
        String owner = request.getParameter("owner");
        String company = request.getParameter("company");
        String job = request.getParameter("job");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String website = request.getParameter("website");
        String mphone = request.getParameter("mphone");
        String state = request.getParameter("state");
        String source = request.getParameter("source");
        String createTime = DateTimeUtil.getSysTime();
        String createBy = ((User)request.getSession().getAttribute("user")).getName();
        String description = request.getParameter("description");
        String contactSummary = request.getParameter("contactSummary");
        String nextContactTime = request.getParameter("nextContactTime");
        String address = request.getParameter("address");

        Clue c = new Clue();
        c.setId(id);
        c.setWebsite(website);
        c.setState(state);
        c.setSource(source);
        c.setPhone(phone);
        c.setOwner(owner);
        c.setNextContactTime(nextContactTime);
        c.setMphone(mphone);
        c.setJob(job);
        c.setFullname(fullname);
        c.setEmail(email);
        c.setDescription(description);
        c.setCreateTime(createTime);
        c.setCreateBy(createBy);
        c.setContactSummary(contactSummary);
        c.setCompany(company);
        c.setAppellation(appellation);
        c.setAddress(address);

        ClueService cs = (ClueService) ServiceFactory.getService(new ClueServiceImpl());

        boolean flag = cs.save(c);

        PrintJson.printJsonFlag(response,flag);
    }

    private void getUserList(HttpServletRequest req, HttpServletResponse resp) {

        UserService userService= (UserService) ServiceFactory.getService(new UserServiceImpl());
        List<User> userList=userService.getUserList();
        PrintJson.printJsonObj(resp,userList);
    }

    private void xxx(HttpServletRequest req, HttpServletResponse resp) {
    }


}
