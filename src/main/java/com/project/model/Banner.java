package com.project.model;

import java.util.Date;

public class Banner {
    private Integer bid;

    private Integer sid;

    private String title;

    private String link;

    private String tolink;

    private Date creationdate;

    private Date startdate;

    private Date enddate;

    private Integer deleted;

    private Integer sort;

    private String detaillink;

    private String sharetitle;

    private String shareicon;

    private String sharedescribe;

    private Integer ishide;

    private Integer marks;

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    public String getTolink() {
        return tolink;
    }

    public void setTolink(String tolink) {
        this.tolink = tolink == null ? null : tolink.trim();
    }

    public Date getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getDetaillink() {
        return detaillink;
    }

    public void setDetaillink(String detaillink) {
        this.detaillink = detaillink == null ? null : detaillink.trim();
    }

    public String getSharetitle() {
        return sharetitle;
    }

    public void setSharetitle(String sharetitle) {
        this.sharetitle = sharetitle == null ? null : sharetitle.trim();
    }

    public String getShareicon() {
        return shareicon;
    }

    public void setShareicon(String shareicon) {
        this.shareicon = shareicon == null ? null : shareicon.trim();
    }

    public String getSharedescribe() {
        return sharedescribe;
    }

    public void setSharedescribe(String sharedescribe) {
        this.sharedescribe = sharedescribe == null ? null : sharedescribe.trim();
    }

    public Integer getIshide() {
        return ishide;
    }

    public void setIshide(Integer ishide) {
        this.ishide = ishide;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }
}