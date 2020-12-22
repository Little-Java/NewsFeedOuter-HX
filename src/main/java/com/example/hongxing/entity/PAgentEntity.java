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

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public String getAgentPwd() {
        return agentPwd;
    }

    public void setAgentPwd(String agentPwd) {
        this.agentPwd = agentPwd;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getDutyId() {
        return dutyId;
    }

    public void setDutyId(String dutyId) {
        this.dutyId = dutyId;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getOfficeTel() {
        return officeTel;
    }

    public void setOfficeTel(String officeTel) {
        this.officeTel = officeTel;
    }

    public String getAgentIp() {
        return agentIp;
    }

    public void setAgentIp(String agentIp) {
        this.agentIp = agentIp;
    }

    public String getAgentEnabled() {
        return agentEnabled;
    }

    public void setAgentEnabled(String agentEnabled) {
        this.agentEnabled = agentEnabled;
    }

    public Integer getUnId() {
        return unId;
    }

    public void setUnId(Integer unId) {
        this.unId = unId;
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Integer getLogIns() {
        return logIns;
    }

    public void setLogIns(Integer logIns) {
        this.logIns = logIns;
    }

    public String getLastAccess() {
        return lastAccess;
    }

    public void setLastAccess(String lastAccess) {
        this.lastAccess = lastAccess;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Integer getOnlineTime() {
        return onlineTime;
    }

    public void setOnlineTime(Integer onlineTime) {
        this.onlineTime = onlineTime;
    }

    public String getUserSecurity() {
        return userSecurity;
    }

    public void setUserSecurity(String userSecurity) {
        this.userSecurity = userSecurity;
    }

    public String getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(String isSystem) {
        this.isSystem = isSystem;
    }

    public String getTimeInterVal() {
        return timeInterVal;
    }

    public void setTimeInterVal(String timeInterVal) {
        this.timeInterVal = timeInterVal;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
}
