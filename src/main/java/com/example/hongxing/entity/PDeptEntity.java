package com.example.hongxing.entity;

import lombok.Data;

@Data
public class PDeptEntity {

    private String deptId;                  //部门编号

    private String deptName;                //部门名字

    private String deptEnName;              //部门英文名字

    private String upperId;                 //上一级编号

    private Integer sortId;                 //排序编号

    private String childWebId;              //站点编号

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptEnName() {
        return deptEnName;
    }

    public void setDeptEnName(String deptEnName) {
        this.deptEnName = deptEnName;
    }

    public String getUpperId() {
        return upperId;
    }

    public void setUpperId(String upperId) {
        this.upperId = upperId;
    }

    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

    public String getChildWebId() {
        return childWebId;
    }

    public void setChildWebId(String childWebId) {
        this.childWebId = childWebId;
    }
}
