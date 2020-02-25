package com.bjpowernode.crm.workbench.service.impl;

import com.bjpowernode.crm.settings.dao.UserDao;
import com.bjpowernode.crm.settings.domain.User;
import com.bjpowernode.crm.util.SqlSessionUtil;
import com.bjpowernode.crm.vo.PaginationVO;
import com.bjpowernode.crm.workbench.dao.ActivityDao;
import com.bjpowernode.crm.workbench.dao.ActivityRemarkDao;
import com.bjpowernode.crm.workbench.domain.Activity;
import com.bjpowernode.crm.workbench.domain.ActivityRemark;
import com.bjpowernode.crm.workbench.service.ActivityService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ActivityServiceImpl implements ActivityService {


    private ActivityDao activityDao= SqlSessionUtil.getSqlSession().getMapper(ActivityDao.class);
    private ActivityRemarkDao activityRemarkDao= SqlSessionUtil.getSqlSession().getMapper(ActivityRemarkDao.class);
    private UserDao userDao= SqlSessionUtil.getSqlSession().getMapper(UserDao.class);


    @Override
    public boolean save(Activity a) {
        boolean flag=true;
        int count =activityDao.save(a);
        if (count!=1){
            flag=false;
        }


        return flag;
    }

    @Override
    public PaginationVO<Activity> pageList(Map<String, Object> map) {
        //取得total
       int total= activityDao.getTotalByCondition(map);

        //取得dataList
       List<Activity> dataList= activityDao.getActivityByCondition(map);

        //创建一个vo对象将total和dataList封装到vo
        PaginationVO<Activity> vo=new PaginationVO<>();
        vo.setDataList(dataList);
        vo.setTotal(total);
        return vo;
    }

    @Override
    public boolean delete(String[] ids) {

        boolean flag=true;
        //查询出需要删除备注的数量
        int count1=activityRemarkDao.getCountByIds(ids);

        //实际删除的数量
        int count2=activityRemarkDao.deleteByIds(ids);
        if (count1!=count2){
            flag=false;
        }

        //删除市场活动
        int count3=activityDao.delete(ids);
        if (count3!=ids.length){

            flag=true;

        }

        return flag;
    }

    @Override
    public Map<String, Object> getUserListAndActivity(String id) {
        //取uList，a打包成map，返回map
        List<User> uList=userDao.getUserList();

        Activity a=activityDao.getById(id);

        Map<String,Object> map=new HashMap<>();
        map.put("uList",uList);
        map.put("a",a);
        return map;
    }

    @Override
    public boolean update(Activity a) {
        boolean flag=true;
        int count =activityDao.update(a);
        if (count!=1){
            flag=false;
        }


        return flag;
    }

    @Override
    public Activity detail(String id) {

        //activityDao.getById(id);不能复用，因为所有者是32数字
        Activity a=activityDao.detail(id);
        return a;
    }

    @Override
    public List<ActivityRemark> getRemarkListByAid(String id) {
        List<ActivityRemark> ar=activityRemarkDao.getRemarkListByAid(id);
        return ar;
    }

    @Override
    public boolean deleteRemark(String id) {
        boolean flag;
        if (activityRemarkDao.deleteRemark(id)==1){
            flag=true;
        }else {
            flag=false;
        }

        return  flag;
    }

    @Override
    public boolean saveRemark(ActivityRemark activityRemark) {
        boolean flag=true;
        int count=activityRemarkDao.saveRemark(activityRemark);
        if (count!=1){
            flag=false;
        }
        return flag;
    }

    @Override
    public boolean updateRemark(ActivityRemark activityRemark) {
        boolean flag=true;
        int count=activityRemarkDao.updateRemark(activityRemark);
        if (count!=1){
            flag=false;
        }
        return flag;
    }

    @Override
    public List<Activity> getActivityListByClueId(String clueId) {
        List<Activity> aList = activityDao.getActivityListByClueId(clueId);

        return aList;
    }

    @Override
    public List<Activity> getActivityListByNameAndNotByClueId(Map<String, String> map) {
        List<Activity> aList = activityDao.getActivityListByNameAndNotByClueId(map);

        return aList;
    }

    @Override
    public List<Activity> getActivityListByName(String aname) {

        List<Activity> aList = activityDao.getActivityListByName(aname);

        return aList;
    }


}
