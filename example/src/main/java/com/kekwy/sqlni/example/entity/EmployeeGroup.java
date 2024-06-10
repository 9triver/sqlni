package com.kekwy.sqlni.example.entity;

import java.util.List;

public class EmployeeGroup {

    private Integer gid;
    private String groupName;
    private List<Employee> groupMember;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<Employee> getGroupMember() {
        return groupMember;
    }

    public void setGroupMember(List<Employee> groupMember) {
        this.groupMember = groupMember;
    }
}
