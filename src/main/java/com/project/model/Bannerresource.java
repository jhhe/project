package com.project.model;

import java.util.Date;

public class Bannerresource {
    private Integer brid;

    private Integer uid;

    private Integer bid;

    private String content;

    private Date creationdate;

    private Integer deleted;

    private Integer listencount;

    private Integer reallisten;

    private Integer praisecount;

    private Integer realpraise;

    private Integer duration;

    private Integer sort;

    private Integer islive;

    private Integer state;

    private Integer score;

    public Integer getBrid() {
        return brid;
    }

    public void setBrid(Integer brid) {
        this.brid = brid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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

    public Integer getListencount() {
        return listencount;
    }

    public void setListencount(Integer listencount) {
        this.listencount = listencount;
    }

    public Integer getReallisten() {
        return reallisten;
    }

    public void setReallisten(Integer reallisten) {
        this.reallisten = reallisten;
    }

    public Integer getPraisecount() {
        return praisecount;
    }

    public void setPraisecount(Integer praisecount) {
        this.praisecount = praisecount;
    }

    public Integer getRealpraise() {
        return realpraise;
    }

    public void setRealpraise(Integer realpraise) {
        this.realpraise = realpraise;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getIslive() {
        return islive;
    }

    public void setIslive(Integer islive) {
        this.islive = islive;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}