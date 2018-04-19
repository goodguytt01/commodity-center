package com.weibo.motan.demo.service;

import com.weibo.motan.demo.service.model.GoodCategory;

import java.util.List;

/**
 * Created by Administrator on 2018/2/22 0022.
 */
public interface GoodCategoryService {
    public List<GoodCategory> getGoodCategory(String parentId);
}
