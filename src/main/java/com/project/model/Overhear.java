package com.project.model;

import java.util.Date;

public class Overhear {
    private Integer oid;

    private Integer uid;

    private Integer resourceid;

    private Date creationdate;

    private Integer deleted;

    private Integer isread;

    private Integer liveid;

    private Integer freehear;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getResourceid() {
        return resourceid;
    }

    public void setResourceid(Integer resourceid) {
        this.resourceid = resourceid;
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

    public Integer getIsread() {
        return isread;
    }

    public void setIsread(Integer isread) {
        this.isread = isread;
    }

    public Integer getLiveid() {
        return liveid;
    }

    public void setLiveid(Integer liveid) {
        this.liveid = liveid;
    }

    public Integer getFreehear() {
        return freehear;
    }

    public void setFreehear(Integer freehear) {
        this.freehear = freehear;
    }
}