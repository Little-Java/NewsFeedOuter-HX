package com.example.hongxing.entity;

import lombok.Data;

@Data
public class PColumnEntity {

    private Integer columnId;               //栏目编号

    private String columnEnName;            //栏目英文名称

    private String columnName;              //栏目名称

    private String columnDisplayName;       //栏目显示名称

    private Integer upperId;                //上一级编号

    private String childWebId;              //站点编号

    private String columnType;              //栏目类型

    private String columnPicUrl;            //栏目图片URL

    private String isCritic;                //是否支持图片

    private String listTempLet;             //栏目列表模板

    private String ArticleTempLet;          //栏目文章模板

    private Integer sortId;                 //排序编号

    private String tState;                  //状态

    private String isScroll;                //在首页是否支持滚动

    private Integer tHeight;                //在首页显示高度

    private Integer infoNumber;             //在首页显示的信息数

    private String actionType;              //栏目处理方式

    private String linkUrl;                 //链接地址

    private String tips;                    //栏目提示

    private String readme;                  //栏目说明

    private Integer checkLevel;             //栏目审核

    private Integer columnScope;            //浏览/查看权限

    private String flowId;                  //工作流编号

    private String isCriticCheck;           //评论是否审批

    //还有补充

}
