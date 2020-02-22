package com.bjpowernode.crm.settings.service.impl;

import com.bjpowernode.crm.settings.dao.DicTypeDao;
import com.bjpowernode.crm.settings.dao.DicValueDao;
import com.bjpowernode.crm.settings.domain.DicType;
import com.bjpowernode.crm.settings.domain.DicValue;
import com.bjpowernode.crm.settings.service.DicService;
import com.bjpowernode.crm.util.SqlSessionUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DicServiceImpl implements DicService {

    private DicTypeDao dicTypeDao = SqlSessionUtil.getSqlSession().getMapper(DicTypeDao.class);
    private DicValueDao dicValueDao = SqlSessionUtil.getSqlSession().getMapper(DicValueDao.class);

    public Map<String, List<DicValue>> getAll() {

        Map<String, List<DicValue>> map = new HashMap<String, List<DicValue>>();

        //取得字典类型信息列表
        List<DicType> dtList = dicTypeDao.getTypeList();

        //遍历字典类型列表
        for(DicType dt:dtList){

            //根据每一个遍历出来的类型，取得字典类型编码
            String code = dt.getCode();

            //根据每一个code，取得对应的字典值列表
            List<DicValue> dvList = dicValueDao.getListByTypeCode(code);

            map.put(code+"List",dvList);


        }


        return map;
    }
}




























