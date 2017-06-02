package com.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BannerresourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BannerresourceExample() {
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

        public Criteria andBridIsNull() {
            addCriterion("brid is null");
            return (Criteria) this;
        }

        public Criteria andBridIsNotNull() {
            addCriterion("brid is not null");
            return (Criteria) this;
        }

        public Criteria andBridEqualTo(Integer value) {
            addCriterion("brid =", value, "brid");
            return (Criteria) this;
        }

        public Criteria andBridNotEqualTo(Integer value) {
            addCriterion("brid <>", value, "brid");
            return (Criteria) this;
        }

        public Criteria andBridGreaterThan(Integer value) {
            addCriterion("brid >", value, "brid");
            return (Criteria) this;
        }

        public Criteria andBridGreaterThanOrEqualTo(Integer value) {
            addCriterion("brid >=", value, "brid");
            return (Criteria) this;
        }

        public Criteria andBridLessThan(Integer value) {
            addCriterion("brid <", value, "brid");
            return (Criteria) this;
        }

        public Criteria andBridLessThanOrEqualTo(Integer value) {
            addCriterion("brid <=", value, "brid");
            return (Criteria) this;
        }

        public Criteria andBridIn(List<Integer> values) {
            addCriterion("brid in", values, "brid");
            return (Criteria) this;
        }

        public Criteria andBridNotIn(List<Integer> values) {
            addCriterion("brid not in", values, "brid");
            return (Criteria) this;
        }

        public Criteria andBridBetween(Integer value1, Integer value2) {
            addCriterion("brid between", value1, value2, "brid");
            return (Criteria) this;
        }

        public Criteria andBridNotBetween(Integer value1, Integer value2) {
            addCriterion("brid not between", value1, value2, "brid");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
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

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
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

        public Criteria andListencountIsNull() {
            addCriterion("listencount is null");
            return (Criteria) this;
        }

        public Criteria andListencountIsNotNull() {
            addCriterion("listencount is not null");
            return (Criteria) this;
        }

        public Criteria andListencountEqualTo(Integer value) {
            addCriterion("listencount =", value, "listencount");
            return (Criteria) this;
        }

        public Criteria andListencountNotEqualTo(Integer value) {
            addCriterion("listencount <>", value, "listencount");
            return (Criteria) this;
        }

        public Criteria andListencountGreaterThan(Integer value) {
            addCriterion("listencount >", value, "listencount");
            return (Criteria) this;
        }

        public Criteria andListencountGreaterThanOrEqualTo(Integer value) {
            addCriterion("listencount >=", value, "listencount");
            return (Criteria) this;
        }

        public Criteria andListencountLessThan(Integer value) {
            addCriterion("listencount <", value, "listencount");
            return (Criteria) this;
        }

        public Criteria andListencountLessThanOrEqualTo(Integer value) {
            addCriterion("listencount <=", value, "listencount");
            return (Criteria) this;
        }

        public Criteria andListencountIn(List<Integer> values) {
            addCriterion("listencount in", values, "listencount");
            return (Criteria) this;
        }

        public Criteria andListencountNotIn(List<Integer> values) {
            addCriterion("listencount not in", values, "listencount");
            return (Criteria) this;
        }

        public Criteria andListencountBetween(Integer value1, Integer value2) {
            addCriterion("listencount between", value1, value2, "listencount");
            return (Criteria) this;
        }

        public Criteria andListencountNotBetween(Integer value1, Integer value2) {
            addCriterion("listencount not between", value1, value2, "listencount");
            return (Criteria) this;
        }

        public Criteria andReallistenIsNull() {
            addCriterion("reallisten is null");
            return (Criteria) this;
        }

        public Criteria andReallistenIsNotNull() {
            addCriterion("reallisten is not null");
            return (Criteria) this;
        }

        public Criteria andReallistenEqualTo(Integer value) {
            addCriterion("reallisten =", value, "reallisten");
            return (Criteria) this;
        }

        public Criteria andReallistenNotEqualTo(Integer value) {
            addCriterion("reallisten <>", value, "reallisten");
            return (Criteria) this;
        }

        public Criteria andReallistenGreaterThan(Integer value) {
            addCriterion("reallisten >", value, "reallisten");
            return (Criteria) this;
        }

        public Criteria andReallistenGreaterThanOrEqualTo(Integer value) {
            addCriterion("reallisten >=", value, "reallisten");
            return (Criteria) this;
        }

        public Criteria andReallistenLessThan(Integer value) {
            addCriterion("reallisten <", value, "reallisten");
            return (Criteria) this;
        }

        public Criteria andReallistenLessThanOrEqualTo(Integer value) {
            addCriterion("reallisten <=", value, "reallisten");
            return (Criteria) this;
        }

        public Criteria andReallistenIn(List<Integer> values) {
            addCriterion("reallisten in", values, "reallisten");
            return (Criteria) this;
        }

        public Criteria andReallistenNotIn(List<Integer> values) {
            addCriterion("reallisten not in", values, "reallisten");
            return (Criteria) this;
        }

        public Criteria andReallistenBetween(Integer value1, Integer value2) {
            addCriterion("reallisten between", value1, value2, "reallisten");
            return (Criteria) this;
        }

        public Criteria andReallistenNotBetween(Integer value1, Integer value2) {
            addCriterion("reallisten not between", value1, value2, "reallisten");
            return (Criteria) this;
        }

        public Criteria andPraisecountIsNull() {
            addCriterion("praisecount is null");
            return (Criteria) this;
        }

        public Criteria andPraisecountIsNotNull() {
            addCriterion("praisecount is not null");
            return (Criteria) this;
        }

        public Criteria andPraisecountEqualTo(Integer value) {
            addCriterion("praisecount =", value, "praisecount");
            return (Criteria) this;
        }

        public Criteria andPraisecountNotEqualTo(Integer value) {
            addCriterion("praisecount <>", value, "praisecount");
            return (Criteria) this;
        }

        public Criteria andPraisecountGreaterThan(Integer value) {
            addCriterion("praisecount >", value, "praisecount");
            return (Criteria) this;
        }

        public Criteria andPraisecountGreaterThanOrEqualTo(Integer value) {
            addCriterion("praisecount >=", value, "praisecount");
            return (Criteria) this;
        }

        public Criteria andPraisecountLessThan(Integer value) {
            addCriterion("praisecount <", value, "praisecount");
            return (Criteria) this;
        }

        public Criteria andPraisecountLessThanOrEqualTo(Integer value) {
            addCriterion("praisecount <=", value, "praisecount");
            return (Criteria) this;
        }

        public Criteria andPraisecountIn(List<Integer> values) {
            addCriterion("praisecount in", values, "praisecount");
            return (Criteria) this;
        }

        public Criteria andPraisecountNotIn(List<Integer> values) {
            addCriterion("praisecount not in", values, "praisecount");
            return (Criteria) this;
        }

        public Criteria andPraisecountBetween(Integer value1, Integer value2) {
            addCriterion("praisecount between", value1, value2, "praisecount");
            return (Criteria) this;
        }

        public Criteria andPraisecountNotBetween(Integer value1, Integer value2) {
            addCriterion("praisecount not between", value1, value2, "praisecount");
            return (Criteria) this;
        }

        public Criteria andRealpraiseIsNull() {
            addCriterion("realpraise is null");
            return (Criteria) this;
        }

        public Criteria andRealpraiseIsNotNull() {
            addCriterion("realpraise is not null");
            return (Criteria) this;
        }

        public Criteria andRealpraiseEqualTo(Integer value) {
            addCriterion("realpraise =", value, "realpraise");
            return (Criteria) this;
        }

        public Criteria andRealpraiseNotEqualTo(Integer value) {
            addCriterion("realpraise <>", value, "realpraise");
            return (Criteria) this;
        }

        public Criteria andRealpraiseGreaterThan(Integer value) {
            addCriterion("realpraise >", value, "realpraise");
            return (Criteria) this;
        }

        public Criteria andRealpraiseGreaterThanOrEqualTo(Integer value) {
            addCriterion("realpraise >=", value, "realpraise");
            return (Criteria) this;
        }

        public Criteria andRealpraiseLessThan(Integer value) {
            addCriterion("realpraise <", value, "realpraise");
            return (Criteria) this;
        }

        public Criteria andRealpraiseLessThanOrEqualTo(Integer value) {
            addCriterion("realpraise <=", value, "realpraise");
            return (Criteria) this;
        }

        public Criteria andRealpraiseIn(List<Integer> values) {
            addCriterion("realpraise in", values, "realpraise");
            return (Criteria) this;
        }

        public Criteria andRealpraiseNotIn(List<Integer> values) {
            addCriterion("realpraise not in", values, "realpraise");
            return (Criteria) this;
        }

        public Criteria andRealpraiseBetween(Integer value1, Integer value2) {
            addCriterion("realpraise between", value1, value2, "realpraise");
            return (Criteria) this;
        }

        public Criteria andRealpraiseNotBetween(Integer value1, Integer value2) {
            addCriterion("realpraise not between", value1, value2, "realpraise");
            return (Criteria) this;
        }

        public Criteria andDurationIsNull() {
            addCriterion("duration is null");
            return (Criteria) this;
        }

        public Criteria andDurationIsNotNull() {
            addCriterion("duration is not null");
            return (Criteria) this;
        }

        public Criteria andDurationEqualTo(Integer value) {
            addCriterion("duration =", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotEqualTo(Integer value) {
            addCriterion("duration <>", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThan(Integer value) {
            addCriterion("duration >", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("duration >=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThan(Integer value) {
            addCriterion("duration <", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThanOrEqualTo(Integer value) {
            addCriterion("duration <=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationIn(List<Integer> values) {
            addCriterion("duration in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotIn(List<Integer> values) {
            addCriterion("duration not in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationBetween(Integer value1, Integer value2) {
            addCriterion("duration between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("duration not between", value1, value2, "duration");
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

        public Criteria andIsliveIsNull() {
            addCriterion("islive is null");
            return (Criteria) this;
        }

        public Criteria andIsliveIsNotNull() {
            addCriterion("islive is not null");
            return (Criteria) this;
        }

        public Criteria andIsliveEqualTo(Integer value) {
            addCriterion("islive =", value, "islive");
            return (Criteria) this;
        }

        public Criteria andIsliveNotEqualTo(Integer value) {
            addCriterion("islive <>", value, "islive");
            return (Criteria) this;
        }

        public Criteria andIsliveGreaterThan(Integer value) {
            addCriterion("islive >", value, "islive");
            return (Criteria) this;
        }

        public Criteria andIsliveGreaterThanOrEqualTo(Integer value) {
            addCriterion("islive >=", value, "islive");
            return (Criteria) this;
        }

        public Criteria andIsliveLessThan(Integer value) {
            addCriterion("islive <", value, "islive");
            return (Criteria) this;
        }

        public Criteria andIsliveLessThanOrEqualTo(Integer value) {
            addCriterion("islive <=", value, "islive");
            return (Criteria) this;
        }

        public Criteria andIsliveIn(List<Integer> values) {
            addCriterion("islive in", values, "islive");
            return (Criteria) this;
        }

        public Criteria andIsliveNotIn(List<Integer> values) {
            addCriterion("islive not in", values, "islive");
            return (Criteria) this;
        }

        public Criteria andIsliveBetween(Integer value1, Integer value2) {
            addCriterion("islive between", value1, value2, "islive");
            return (Criteria) this;
        }

        public Criteria andIsliveNotBetween(Integer value1, Integer value2) {
            addCriterion("islive not between", value1, value2, "islive");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
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