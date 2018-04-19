package com.jcgroup.dao;

import com.weibo.motan.demo.service.model.GoodCategory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Administrator on 2018/2/22 0022.
 */
@Mapper
public interface GoodCategoryMapper{
    public List<GoodCategory> getGoodCategory(String parentId);
}
