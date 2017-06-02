package com.project.model;

import java.util.Date;

public class Message {
    private Integer mid;

    private Integer liveid;

    private Integer uid;

    private Date creationdate;

    private Integer deleted;

    private Integer operate;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getLiveid() {
        return liveid;
    }

    public void setLiveid(Integer liveid) {
        this.liveid = liveid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Date getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Integer getOperate() {
        return operate;
    }

    public void setOperate(Integer operate) {
        this.operate = operate;
    }
}