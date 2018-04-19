package com.jcgroup.service.impl;

import com.jcgroup.dao.GoodCategoryMapper;
import com.weibo.api.motan.config.springsupport.annotation.MotanService;
import com.weibo.motan.demo.service.GoodCategoryService;
import com.weibo.motan.demo.service.model.GoodCategory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Administrator on 2018/2/22 0022.
 */
@MotanService
public class GoodCategoryServiceImpl implements GoodCategoryService{

    @Autowired
    private GoodCategoryMapper goodCategoryMapper;

    @Override
    public List<GoodCategory> getGoodCategory(String parentId) {
        return goodCategoryMapper.getGoodCategory(parentId);
    }
}
