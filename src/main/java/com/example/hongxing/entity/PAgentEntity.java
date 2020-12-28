package com.example.hongxing.entity;

import lombok.Data;

@Data
public class PAgentEntity {

    private String agentId;                 //用户编号

    private String agentPwd;                //用户登录密码

    private String agentName;               //用户姓名

    private String deptId;                  //部门编号

    private String enName;                  //用户英文名

    private String dutyId;                  //职位编号

    private String emailAddress;            //用户邮件

    private String officeTel;               //用户电话

    private String agentIp;                 //用户IP

    private String agentEnabled;            //用户启用

    private Integer unId;                   //编号

    private String lastUpdateTime;          //上次修改时间

    private String addTime;                 //增加时间

    private String question;                //问题

    private String answer;                  //答案

    private Integer logIns;                 //登录次数

    private String lastAccess;              //上一次访问

    private String lastLogin;               //上一次登录

    private Integer onlineTime;             //在线时长

    private String userSecurity;            //用户安全性

    private String isSystem;                //是否超级管理员

    private String timeInterVal;            //时间间隔

    private String isDelete;                //是否已删除

    private String id;                      //编号

    private String idCard;                  //身份证号码
}
