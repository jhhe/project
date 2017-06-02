package com.project.model;

import java.util.Date;

public class Live {
    private Integer lid;

    private Integer uid;

    private String title;

    private Integer touid;

    private Integer listencount;

    private Integer down;

    private Date creationdate;

    private Integer deleted;

    private Integer ispublic;

    private Integer anonymous;

    private Integer state;

    private Integer status;

    private Integer flag;

    private Integer sort;

    private Integer sid;

    private Integer uidread;

    private Integer touidread;

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getTouid() {
        return touid;
    }

    public void setTouid(Integer touid) {
        this.touid = touid;
    }

    public Integer getListencount() {
        return listencount;
    }

    public void setListencount(Integer listencount) {
        this.listencount = listencount;
    }

    public Integer getDown() {
        return down;
    }

    public void setDown(Integer down) {
        this.down = down;
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

    public Integer getIspublic() {
        return ispublic;
    }

    public void setIspublic(Integer ispublic) {
        this.ispublic = ispublic;
    }

    public Integer getAnonymous() {
        return anonymous;
    }

    public void setAnonymous(Integer anonymous) {
        this.anonymous = anonymous;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getUidread() {
        return uidread;
    }

    public void setUidread(Integer uidread) {
        this.uidread = uidread;
    }

    public Integer getTouidread() {
        return touidread;
    }

    public void setTouidread(Integer touidread) {
        this.touidread = touidread;
    }
}