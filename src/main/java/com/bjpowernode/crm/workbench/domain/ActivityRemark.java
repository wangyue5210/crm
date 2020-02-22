package com.bjpowernode.crm.workbench.domain;

public class ActivityRemark {
    private String id;
    private String noteContent; //备注信息
    private String createTime;
    private String createBy;
    private String editTime;
    private String editBy;
    private String editFlag;
    private String activityId;

    public ActivityRemark() {
    }

    public ActivityRemark(String id, String noteContent, String createTime, String createBy, String editTime, String editBy, String editFlag, String activityId) {
        this.id = id;
        this.noteContent = noteContent;
        this.createTime = createTime;
        this.createBy = createBy;
        this.editTime = editTime;
        this.editBy = editBy;
        this.editFlag = editFlag;
        this.activityId = activityId;
    }

    public String getId() {
        return id;
    }

    public ActivityRemark setId(String id) {
        this.id = id;
        return this;
    }

    public String getNoteContent() {
        return noteContent;
    }

    public ActivityRemark setNoteContent(String noteContent) {
        this.noteContent = noteContent;
        return this;
    }

    public String getCreateTime() {
        return createTime;
    }

    public ActivityRemark setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateBy() {
        return createBy;
    }

    public ActivityRemark setCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    public String getEditTime() {
        return editTime;
    }

    public ActivityRemark setEditTime(String editTime) {
        this.editTime = editTime;
        return this;
    }

    public String getEditBy() {
        return editBy;
    }

    public ActivityRemark setEditBy(String editBy) {
        this.editBy = editBy;
        return this;
    }

    public String getEditFlag() {
        return editFlag;
    }

    public ActivityRemark setEditFlag(String editFlag) {
        this.editFlag = editFlag;
        return this;
    }

    public String getActivityId() {
        return activityId;
    }

    public ActivityRemark setActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }
}
