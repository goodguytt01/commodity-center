package com.weibo.motan.demo.service.model;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/2/22 0022.
 */
@Data
public class GoodCategory implements Serializable {

    private static final long serialVersionUID = 2297562660487310938L;

    private int Id;

    private String name;
}
