package com.example.hongxing.entity;

import lombok.Data;

@Data
public class PChildWebEntity {

    private String childWebId;                  //站点编号

    private String childWebName;                //站点名称

    private String upperId;                     //上一级编号

    private String tempLetTeam;                 //站点初始模板

    private String indexPreview;                //站点文件地址

    private String siteDoMainName;              //站点访问路径

    private String siteIndexFullPath;           //站点访问绝对路径

    private String childWebType;                //站点

    private String state;                       //状态

    private String beginDate;                   //开始日期

    private String endDate;                     //结束日期

    private Integer sortId;                     //排序编号

    private String wmlSupportState;             //手机门户支持

    private String wmlIndexPreview;             //手机门户文件地址

    private Integer wmlPicWidth;                //手机门户图片宽度

    private Integer wmlPicHeight;               //手机门户图片高度

    private Integer wmlPicMaxCharPerPage;       //最大字符页面

    private Integer maxOnlineUserCount;         //最大在线用户数

    private Integer maxOnlineDate;              //最大在线天数

    private String remoteHostId;                //远程主机编号

    private String title;                       //栏目编号

    private String keyWords;                    //关键词

    private String description;                 //描述

    private String author;                      //作者

    private String generator;                   //创建者

    private String banner;                      //横幅

    private String copyRight;                   //版权

    private String isMain;                      //是否主站

    private String isSystem;                    //是否超级管理员

    private String companyId;                   //公司编号

    public String getChildWebId() {
        return childWebId;
    }

    public void setChildWebId(String childWebId) {
        this.childWebId = childWebId;
    }

    public String getChildWebName() {
        return childWebName;
    }

    public void setChildWebName(String childWebName) {
        this.childWebName = childWebName;
    }

    public String getUpperId() {
        return upperId;
    }

    public void setUpperId(String upperId) {
        this.upperId = upperId;
    }

    public String getTempLetTeam() {
        return tempLetTeam;
    }

    public void setTempLetTeam(String tempLetTeam) {
        this.tempLetTeam = tempLetTeam;
    }

    public String getIndexPreview() {
        return indexPreview;
    }

    public void setIndexPreview(String indexPreview) {
        this.indexPreview = indexPreview;
    }

    public String getSiteDoMainName() {
        return siteDoMainName;
    }

    public void setSiteDoMainName(String siteDoMainName) {
        this.siteDoMainName = siteDoMainName;
    }

    public String getSiteIndexFullPath() {
        return siteIndexFullPath;
    }

    public void setSiteIndexFullPath(String siteIndexFullPath) {
        this.siteIndexFullPath = siteIndexFullPath;
    }

    public String getChildWebType() {
        return childWebType;
    }

    public void setChildWebType(String childWebType) {
        this.childWebType = childWebType;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

    public String getWmlSupportState() {
        return wmlSupportState;
    }

    public void setWmlSupportState(String wmlSupportState) {
        this.wmlSupportState = wmlSupportState;
    }

    public String getWmlIndexPreview() {
        return wmlIndexPreview;
    }

    public void setWmlIndexPreview(String wmlIndexPreview) {
        this.wmlIndexPreview = wmlIndexPreview;
    }

    public Integer getWmlPicWidth() {
        return wmlPicWidth;
    }

    public void setWmlPicWidth(Integer wmlPicWidth) {
        this.wmlPicWidth = wmlPicWidth;
    }

    public Integer getWmlPicHeight() {
        return wmlPicHeight;
    }

    public void setWmlPicHeight(Integer wmlPicHeight) {
        this.wmlPicHeight = wmlPicHeight;
    }

    public Integer getWmlPicMaxCharPerPage() {
        return wmlPicMaxCharPerPage;
    }

    public void setWmlPicMaxCharPerPage(Integer wmlPicMaxCharPerPage) {
        this.wmlPicMaxCharPerPage = wmlPicMaxCharPerPage;
    }

    public Integer getMaxOnlineUserCount() {
        return maxOnlineUserCount;
    }

    public void setMaxOnlineUserCount(Integer maxOnlineUserCount) {
        this.maxOnlineUserCount = maxOnlineUserCount;
    }

    public Integer getMaxOnlineDate() {
        return maxOnlineDate;
    }

    public void setMaxOnlineDate(Integer maxOnlineDate) {
        this.maxOnlineDate = maxOnlineDate;
    }

    public String getRemoteHostId() {
        return remoteHostId;
    }

    public void setRemoteHostId(String remoteHostId) {
        this.remoteHostId = remoteHostId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenerator() {
        return generator;
    }

    public void setGenerator(String generator) {
        this.generator = generator;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getCopyRight() {
        return copyRight;
    }

    public void setCopyRight(String copyRight) {
        this.copyRight = copyRight;
    }

    public String getIsMain() {
        return isMain;
    }

    public void setIsMain(String isMain) {
        this.isMain = isMain;
    }

    public String getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(String isSystem) {
        this.isSystem = isSystem;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
}
