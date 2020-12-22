package com.example.hongxing.entity;

import lombok.Data;

@Data
public class PInfoEntity {

    private String infoId;                  //信息编号

    private String originalInfoId;          //原始信息编号

    private String sourceId;                //资源编号

    private String columnId;                //栏目编号

    private String columnName;              //栏目名称

    private String childWebId;              //站点编号

    private String sourceType;              //资源来源

    private String state;                   //图片

    private Integer sortId;                 //排序编号

    private String infoUrl;                 //资源URL

    private String workFlow;                //工作流名称

    private String workFlowId;              //工作流编号

    private String templateId;              //模板编号

    private String relateType;              //关联

    private String isStatic;                //是否静态的

    private String specialId;               //专题编号

    private String isCritic;                //是否支持评论

    private String showType;                //显示

    private String beginTime;               //开始时间

    private String endTime;                 //过期时间

    private String releaseTime;             //发布时间

    private String releaseName;             //发布人

    private String updateTime;              //修改时间

    private String updateName;              //修改人

    private String creationTime;            //创建时间

    private String creationName;            //创建人

    private Integer dotNum;                 //点击量

    private String questionId;              //副标题编号

    private String columnHide;              //栏目隐藏

    private String oldSortId;               //原来的分类编号

    private String relevance;               //关联信息

    private String isEmail;                 //是否发送到邮箱

    private String isPhone;                 //是否发送到短信

    private String isWeiBo;                 //是否发送到微博

    private String isBlog;                  //是否发送到博客

    private String isApp;                   //是否发送到手机客户端

    private String guest;                   //客户

    public String getInfoId() {
        return infoId;
    }

    public void setInfoId(String infoId) {
        this.infoId = infoId;
    }

    public String getOriginalInfoId() {
        return originalInfoId;
    }

    public void setOriginalInfoId(String originalInfoId) {
        this.originalInfoId = originalInfoId;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getColumnId() {
        return columnId;
    }

    public void setColumnId(String columnId) {
        this.columnId = columnId;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getChildWebId() {
        return childWebId;
    }

    public void setChildWebId(String childWebId) {
        this.childWebId = childWebId;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

    public String getInfoUrl() {
        return infoUrl;
    }

    public void setInfoUrl(String infoUrl) {
        this.infoUrl = infoUrl;
    }

    public String getWorkFlow() {
        return workFlow;
    }

    public void setWorkFlow(String workFlow) {
        this.workFlow = workFlow;
    }

    public String getWorkFlowId() {
        return workFlowId;
    }

    public void setWorkFlowId(String workFlowId) {
        this.workFlowId = workFlowId;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getRelateType() {
        return relateType;
    }

    public void setRelateType(String relateType) {
        this.relateType = relateType;
    }

    public String getIsStatic() {
        return isStatic;
    }

    public void setIsStatic(String isStatic) {
        this.isStatic = isStatic;
    }

    public String getSpecialId() {
        return specialId;
    }

    public void setSpecialId(String specialId) {
        this.specialId = specialId;
    }

    public String getIsCritic() {
        return isCritic;
    }

    public void setIsCritic(String isCritic) {
        this.isCritic = isCritic;
    }

    public String getShowType() {
        return showType;
    }

    public void setShowType(String showType) {
        this.showType = showType;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getReleaseName() {
        return releaseName;
    }

    public void setReleaseName(String releaseName) {
        this.releaseName = releaseName;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public String getCreationName() {
        return creationName;
    }

    public void setCreationName(String creationName) {
        this.creationName = creationName;
    }

    public Integer getDotNum() {
        return dotNum;
    }

    public void setDotNum(Integer dotNum) {
        this.dotNum = dotNum;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getColumnHide() {
        return columnHide;
    }

    public void setColumnHide(String columnHide) {
        this.columnHide = columnHide;
    }

    public String getOldSortId() {
        return oldSortId;
    }

    public void setOldSortId(String oldSortId) {
        this.oldSortId = oldSortId;
    }

    public String getRelevance() {
        return relevance;
    }

    public void setRelevance(String relevance) {
        this.relevance = relevance;
    }

    public String getIsEmail() {
        return isEmail;
    }

    public void setIsEmail(String isEmail) {
        this.isEmail = isEmail;
    }

    public String getIsPhone() {
        return isPhone;
    }

    public void setIsPhone(String isPhone) {
        this.isPhone = isPhone;
    }

    public String getIsWeiBo() {
        return isWeiBo;
    }

    public void setIsWeiBo(String isWeiBo) {
        this.isWeiBo = isWeiBo;
    }

    public String getIsBlog() {
        return isBlog;
    }

    public void setIsBlog(String isBlog) {
        this.isBlog = isBlog;
    }

    public String getIsApp() {
        return isApp;
    }

    public void setIsApp(String isApp) {
        this.isApp = isApp;
    }

    public String getGuest() {
        return guest;
    }

    public void setGuest(String guest) {
        this.guest = guest;
    }
}
