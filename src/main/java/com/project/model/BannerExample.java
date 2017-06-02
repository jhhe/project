package com.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BannerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BannerExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andBidIsNull() {
            addCriterion("bid is null");
            return (Criteria) this;
        }

        public Criteria andBidIsNotNull() {
            addCriterion("bid is not null");
            return (Criteria) this;
        }

        public Criteria andBidEqualTo(Integer value) {
            addCriterion("bid =", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotEqualTo(Integer value) {
            addCriterion("bid <>", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThan(Integer value) {
            addCriterion("bid >", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bid >=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThan(Integer value) {
            addCriterion("bid <", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThanOrEqualTo(Integer value) {
            addCriterion("bid <=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidIn(List<Integer> values) {
            addCriterion("bid in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotIn(List<Integer> values) {
            addCriterion("bid not in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidBetween(Integer value1, Integer value2) {
            addCriterion("bid between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotBetween(Integer value1, Integer value2) {
            addCriterion("bid not between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andLinkIsNull() {
            addCriterion("link is null");
            return (Criteria) this;
        }

        public Criteria andLinkIsNotNull() {
            addCriterion("link is not null");
            return (Criteria) this;
        }

        public Criteria andLinkEqualTo(String value) {
            addCriterion("link =", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotEqualTo(String value) {
            addCriterion("link <>", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkGreaterThan(String value) {
            addCriterion("link >", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkGreaterThanOrEqualTo(String value) {
            addCriterion("link >=", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLessThan(String value) {
            addCriterion("link <", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLessThanOrEqualTo(String value) {
            addCriterion("link <=", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLike(String value) {
            addCriterion("link like", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotLike(String value) {
            addCriterion("link not like", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkIn(List<String> values) {
            addCriterion("link in", values, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotIn(List<String> values) {
            addCriterion("link not in", values, "link");
            return (Criteria) this;
        }

        public Criteria andLinkBetween(String value1, String value2) {
            addCriterion("link between", value1, value2, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotBetween(String value1, String value2) {
            addCriterion("link not between", value1, value2, "link");
            return (Criteria) this;
        }

        public Criteria andTolinkIsNull() {
            addCriterion("tolink is null");
            return (Criteria) this;
        }

        public Criteria andTolinkIsNotNull() {
            addCriterion("tolink is not null");
            return (Criteria) this;
        }

        public Criteria andTolinkEqualTo(String value) {
            addCriterion("tolink =", value, "tolink");
            return (Criteria) this;
        }

        public Criteria andTolinkNotEqualTo(String value) {
            addCriterion("tolink <>", value, "tolink");
            return (Criteria) this;
        }

        public Criteria andTolinkGreaterThan(String value) {
            addCriterion("tolink >", value, "tolink");
            return (Criteria) this;
        }

        public Criteria andTolinkGreaterThanOrEqualTo(String value) {
            addCriterion("tolink >=", value, "tolink");
            return (Criteria) this;
        }

        public Criteria andTolinkLessThan(String value) {
            addCriterion("tolink <", value, "tolink");
            return (Criteria) this;
        }

        public Criteria andTolinkLessThanOrEqualTo(String value) {
            addCriterion("tolink <=", value, "tolink");
            return (Criteria) this;
        }

        public Criteria andTolinkLike(String value) {
            addCriterion("tolink like", value, "tolink");
            return (Criteria) this;
        }

        public Criteria andTolinkNotLike(String value) {
            addCriterion("tolink not like", value, "tolink");
            return (Criteria) this;
        }

        public Criteria andTolinkIn(List<String> values) {
            addCriterion("tolink in", values, "tolink");
            return (Criteria) this;
        }

        public Criteria andTolinkNotIn(List<String> values) {
            addCriterion("tolink not in", values, "tolink");
            return (Criteria) this;
        }

        public Criteria andTolinkBetween(String value1, String value2) {
            addCriterion("tolink between", value1, value2, "tolink");
            return (Criteria) this;
        }

        public Criteria andTolinkNotBetween(String value1, String value2) {
            addCriterion("tolink not between", value1, value2, "tolink");
            return (Criteria) this;
        }

        public Criteria andCreationdateIsNull() {
            addCriterion("creationdate is null");
            return (Criteria) this;
        }

        public Criteria andCreationdateIsNotNull() {
            addCriterion("creationdate is not null");
            return (Criteria) this;
        }

        public Criteria andCreationdateEqualTo(Date value) {
            addCriterion("creationdate =", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateNotEqualTo(Date value) {
            addCriterion("creationdate <>", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateGreaterThan(Date value) {
            addCriterion("creationdate >", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateGreaterThanOrEqualTo(Date value) {
            addCriterion("creationdate >=", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateLessThan(Date value) {
            addCriterion("creationdate <", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateLessThanOrEqualTo(Date value) {
            addCriterion("creationdate <=", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateIn(List<Date> values) {
            addCriterion("creationdate in", values, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateNotIn(List<Date> values) {
            addCriterion("creationdate not in", values, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateBetween(Date value1, Date value2) {
            addCriterion("creationdate between", value1, value2, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateNotBetween(Date value1, Date value2) {
            addCriterion("creationdate not between", value1, value2, "creationdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("startdate is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("startdate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterion("startdate =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterion("startdate <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterion("startdate >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("startdate >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterion("startdate <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterion("startdate <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterion("startdate in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterion("startdate not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterion("startdate between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterion("startdate not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("enddate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("enddate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterion("enddate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterion("enddate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterion("enddate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("enddate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterion("enddate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterion("enddate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterion("enddate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterion("enddate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterion("enddate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterion("enddate not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Integer value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Integer value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Integer value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Integer value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Integer value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Integer value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Integer> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Integer> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Integer value1, Integer value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Integer value1, Integer value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andDetaillinkIsNull() {
            addCriterion("detaillink is null");
            return (Criteria) this;
        }

        public Criteria andDetaillinkIsNotNull() {
            addCriterion("detaillink is not null");
            return (Criteria) this;
        }

        public Criteria andDetaillinkEqualTo(String value) {
            addCriterion("detaillink =", value, "detaillink");
            return (Criteria) this;
        }

        public Criteria andDetaillinkNotEqualTo(String value) {
            addCriterion("detaillink <>", value, "detaillink");
            return (Criteria) this;
        }

        public Criteria andDetaillinkGreaterThan(String value) {
            addCriterion("detaillink >", value, "detaillink");
            return (Criteria) this;
        }

        public Criteria andDetaillinkGreaterThanOrEqualTo(String value) {
            addCriterion("detaillink >=", value, "detaillink");
            return (Criteria) this;
        }

        public Criteria andDetaillinkLessThan(String value) {
            addCriterion("detaillink <", value, "detaillink");
            return (Criteria) this;
        }

        public Criteria andDetaillinkLessThanOrEqualTo(String value) {
            addCriterion("detaillink <=", value, "detaillink");
            return (Criteria) this;
        }

        public Criteria andDetaillinkLike(String value) {
            addCriterion("detaillink like", value, "detaillink");
            return (Criteria) this;
        }

        public Criteria andDetaillinkNotLike(String value) {
            addCriterion("detaillink not like", value, "detaillink");
            return (Criteria) this;
        }

        public Criteria andDetaillinkIn(List<String> values) {
            addCriterion("detaillink in", values, "detaillink");
            return (Criteria) this;
        }

        public Criteria andDetaillinkNotIn(List<String> values) {
            addCriterion("detaillink not in", values, "detaillink");
            return (Criteria) this;
        }

        public Criteria andDetaillinkBetween(String value1, String value2) {
            addCriterion("detaillink between", value1, value2, "detaillink");
            return (Criteria) this;
        }

        public Criteria andDetaillinkNotBetween(String value1, String value2) {
            addCriterion("detaillink not between", value1, value2, "detaillink");
            return (Criteria) this;
        }

        public Criteria andSharetitleIsNull() {
            addCriterion("sharetitle is null");
            return (Criteria) this;
        }

        public Criteria andSharetitleIsNotNull() {
            addCriterion("sharetitle is not null");
            return (Criteria) this;
        }

        public Criteria andSharetitleEqualTo(String value) {
            addCriterion("sharetitle =", value, "sharetitle");
            return (Criteria) this;
        }

        public Criteria andSharetitleNotEqualTo(String value) {
            addCriterion("sharetitle <>", value, "sharetitle");
            return (Criteria) this;
        }

        public Criteria andSharetitleGreaterThan(String value) {
            addCriterion("sharetitle >", value, "sharetitle");
            return (Criteria) this;
        }

        public Criteria andSharetitleGreaterThanOrEqualTo(String value) {
            addCriterion("sharetitle >=", value, "sharetitle");
            return (Criteria) this;
        }

        public Criteria andSharetitleLessThan(String value) {
            addCriterion("sharetitle <", value, "sharetitle");
            return (Criteria) this;
        }

        public Criteria andSharetitleLessThanOrEqualTo(String value) {
            addCriterion("sharetitle <=", value, "sharetitle");
            return (Criteria) this;
        }

        public Criteria andSharetitleLike(String value) {
            addCriterion("sharetitle like", value, "sharetitle");
            return (Criteria) this;
        }

        public Criteria andSharetitleNotLike(String value) {
            addCriterion("sharetitle not like", value, "sharetitle");
            return (Criteria) this;
        }

        public Criteria andSharetitleIn(List<String> values) {
            addCriterion("sharetitle in", values, "sharetitle");
            return (Criteria) this;
        }

        public Criteria andSharetitleNotIn(List<String> values) {
            addCriterion("sharetitle not in", values, "sharetitle");
            return (Criteria) this;
        }

        public Criteria andSharetitleBetween(String value1, String value2) {
            addCriterion("sharetitle between", value1, value2, "sharetitle");
            return (Criteria) this;
        }

        public Criteria andSharetitleNotBetween(String value1, String value2) {
            addCriterion("sharetitle not between", value1, value2, "sharetitle");
            return (Criteria) this;
        }

        public Criteria andShareiconIsNull() {
            addCriterion("shareicon is null");
            return (Criteria) this;
        }

        public Criteria andShareiconIsNotNull() {
            addCriterion("shareicon is not null");
            return (Criteria) this;
        }

        public Criteria andShareiconEqualTo(String value) {
            addCriterion("shareicon =", value, "shareicon");
            return (Criteria) this;
        }

        public Criteria andShareiconNotEqualTo(String value) {
            addCriterion("shareicon <>", value, "shareicon");
            return (Criteria) this;
        }

        public Criteria andShareiconGreaterThan(String value) {
            addCriterion("shareicon >", value, "shareicon");
            return (Criteria) this;
        }

        public Criteria andShareiconGreaterThanOrEqualTo(String value) {
            addCriterion("shareicon >=", value, "shareicon");
            return (Criteria) this;
        }

        public Criteria andShareiconLessThan(String value) {
            addCriterion("shareicon <", value, "shareicon");
            return (Criteria) this;
        }

        public Criteria andShareiconLessThanOrEqualTo(String value) {
            addCriterion("shareicon <=", value, "shareicon");
            return (Criteria) this;
        }

        public Criteria andShareiconLike(String value) {
            addCriterion("shareicon like", value, "shareicon");
            return (Criteria) this;
        }

        public Criteria andShareiconNotLike(String value) {
            addCriterion("shareicon not like", value, "shareicon");
            return (Criteria) this;
        }

        public Criteria andShareiconIn(List<String> values) {
            addCriterion("shareicon in", values, "shareicon");
            return (Criteria) this;
        }

        public Criteria andShareiconNotIn(List<String> values) {
            addCriterion("shareicon not in", values, "shareicon");
            return (Criteria) this;
        }

        public Criteria andShareiconBetween(String value1, String value2) {
            addCriterion("shareicon between", value1, value2, "shareicon");
            return (Criteria) this;
        }

        public Criteria andShareiconNotBetween(String value1, String value2) {
            addCriterion("shareicon not between", value1, value2, "shareicon");
            return (Criteria) this;
        }

        public Criteria andSharedescribeIsNull() {
            addCriterion("sharedescribe is null");
            return (Criteria) this;
        }

        public Criteria andSharedescribeIsNotNull() {
            addCriterion("sharedescribe is not null");
            return (Criteria) this;
        }

        public Criteria andSharedescribeEqualTo(String value) {
            addCriterion("sharedescribe =", value, "sharedescribe");
            return (Criteria) this;
        }

        public Criteria andSharedescribeNotEqualTo(String value) {
            addCriterion("sharedescribe <>", value, "sharedescribe");
            return (Criteria) this;
        }

        public Criteria andSharedescribeGreaterThan(String value) {
            addCriterion("sharedescribe >", value, "sharedescribe");
            return (Criteria) this;
        }

        public Criteria andSharedescribeGreaterThanOrEqualTo(String value) {
            addCriterion("sharedescribe >=", value, "sharedescribe");
            return (Criteria) this;
        }

        public Criteria andSharedescribeLessThan(String value) {
            addCriterion("sharedescribe <", value, "sharedescribe");
            return (Criteria) this;
        }

        public Criteria andSharedescribeLessThanOrEqualTo(String value) {
            addCriterion("sharedescribe <=", value, "sharedescribe");
            return (Criteria) this;
        }

        public Criteria andSharedescribeLike(String value) {
            addCriterion("sharedescribe like", value, "sharedescribe");
            return (Criteria) this;
        }

        public Criteria andSharedescribeNotLike(String value) {
            addCriterion("sharedescribe not like", value, "sharedescribe");
            return (Criteria) this;
        }

        public Criteria andSharedescribeIn(List<String> values) {
            addCriterion("sharedescribe in", values, "sharedescribe");
            return (Criteria) this;
        }

        public Criteria andSharedescribeNotIn(List<String> values) {
            addCriterion("sharedescribe not in", values, "sharedescribe");
            return (Criteria) this;
        }

        public Criteria andSharedescribeBetween(String value1, String value2) {
            addCriterion("sharedescribe between", value1, value2, "sharedescribe");
            return (Criteria) this;
        }

        public Criteria andSharedescribeNotBetween(String value1, String value2) {
            addCriterion("sharedescribe not between", value1, value2, "sharedescribe");
            return (Criteria) this;
        }

        public Criteria andIshideIsNull() {
            addCriterion("ishide is null");
            return (Criteria) this;
        }

        public Criteria andIshideIsNotNull() {
            addCriterion("ishide is not null");
            return (Criteria) this;
        }

        public Criteria andIshideEqualTo(Integer value) {
            addCriterion("ishide =", value, "ishide");
            return (Criteria) this;
        }

        public Criteria andIshideNotEqualTo(Integer value) {
            addCriterion("ishide <>", value, "ishide");
            return (Criteria) this;
        }

        public Criteria andIshideGreaterThan(Integer value) {
            addCriterion("ishide >", value, "ishide");
            return (Criteria) this;
        }

        public Criteria andIshideGreaterThanOrEqualTo(Integer value) {
            addCriterion("ishide >=", value, "ishide");
            return (Criteria) this;
        }

        public Criteria andIshideLessThan(Integer value) {
            addCriterion("ishide <", value, "ishide");
            return (Criteria) this;
        }

        public Criteria andIshideLessThanOrEqualTo(Integer value) {
            addCriterion("ishide <=", value, "ishide");
            return (Criteria) this;
        }

        public Criteria andIshideIn(List<Integer> values) {
            addCriterion("ishide in", values, "ishide");
            return (Criteria) this;
        }

        public Criteria andIshideNotIn(List<Integer> values) {
            addCriterion("ishide not in", values, "ishide");
            return (Criteria) this;
        }

        public Criteria andIshideBetween(Integer value1, Integer value2) {
            addCriterion("ishide between", value1, value2, "ishide");
            return (Criteria) this;
        }

        public Criteria andIshideNotBetween(Integer value1, Integer value2) {
            addCriterion("ishide not between", value1, value2, "ishide");
            return (Criteria) this;
        }

        public Criteria andMarksIsNull() {
            addCriterion("marks is null");
            return (Criteria) this;
        }

        public Criteria andMarksIsNotNull() {
            addCriterion("marks is not null");
            return (Criteria) this;
        }

        public Criteria andMarksEqualTo(Integer value) {
            addCriterion("marks =", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksNotEqualTo(Integer value) {
            addCriterion("marks <>", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksGreaterThan(Integer value) {
            addCriterion("marks >", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksGreaterThanOrEqualTo(Integer value) {
            addCriterion("marks >=", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksLessThan(Integer value) {
            addCriterion("marks <", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksLessThanOrEqualTo(Integer value) {
            addCriterion("marks <=", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksIn(List<Integer> values) {
            addCriterion("marks in", values, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksNotIn(List<Integer> values) {
            addCriterion("marks not in", values, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksBetween(Integer value1, Integer value2) {
            addCriterion("marks between", value1, value2, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksNotBetween(Integer value1, Integer value2) {
            addCriterion("marks not between", value1, value2, "marks");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}