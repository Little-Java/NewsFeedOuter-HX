package com.example.hongxing.entity;

import lombok.Data;

@Data
public class PWebEntity {

    private String tId;                 //编号

    private String title;               //栏目编号

    private String subHead;             //副标题

    private String titlePicUrl;         //标题图片连接地址

    private String deptId;              //部门编号

    private String deptName;            //部门名称

    private String author;              //作者

    private String agentIp;             //用户IP

    private String agentId;             //用户编号

    private String agentName;           //用户姓名

    private String recordTime;          //记录时间

    private String endEditTime;         //最后修改时间

    private String endEditOrName;       //最后修改人

    private String keyWord;             //关键字

    private String infoTag;             //信息标签

    private String infoSummary;         //摘要

    private String fileUrl;             //文件URL

    private String isPage;              //是否支持翻页

    private Integer maxCharPerPage;     //自动翻页时每页大约字数

    private String titleColor;          //标题颜色

    private String titleFontType;       //标题字体类型

    private String contentId;           //内容编号

    private String columnHide;          //栏目隐藏

    private String idXno;               //索引

    private String approvalNo;          //批文文号
}
