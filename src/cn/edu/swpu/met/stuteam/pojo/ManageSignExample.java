package cn.edu.swpu.met.stuteam.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ManageSignExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManageSignExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andWeekIsNull() {
            addCriterion("week is null");
            return (Criteria) this;
        }

        public Criteria andWeekIsNotNull() {
            addCriterion("week is not null");
            return (Criteria) this;
        }

        public Criteria andWeekEqualTo(Integer value) {
            addCriterion("week =", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotEqualTo(Integer value) {
            addCriterion("week <>", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekGreaterThan(Integer value) {
            addCriterion("week >", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekGreaterThanOrEqualTo(Integer value) {
            addCriterion("week >=", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekLessThan(Integer value) {
            addCriterion("week <", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekLessThanOrEqualTo(Integer value) {
            addCriterion("week <=", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekIn(List<Integer> values) {
            addCriterion("week in", values, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotIn(List<Integer> values) {
            addCriterion("week not in", values, "week");
            return (Criteria) this;
        }

        public Criteria andWeekBetween(Integer value1, Integer value2) {
            addCriterion("week between", value1, value2, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotBetween(Integer value1, Integer value2) {
            addCriterion("week not between", value1, value2, "week");
            return (Criteria) this;
        }

        public Criteria andBanciIsNull() {
            addCriterion("banci is null");
            return (Criteria) this;
        }

        public Criteria andBanciIsNotNull() {
            addCriterion("banci is not null");
            return (Criteria) this;
        }

        public Criteria andBanciEqualTo(String value) {
            addCriterion("banci =", value, "banci");
            return (Criteria) this;
        }

        public Criteria andBanciNotEqualTo(String value) {
            addCriterion("banci <>", value, "banci");
            return (Criteria) this;
        }

        public Criteria andBanciGreaterThan(String value) {
            addCriterion("banci >", value, "banci");
            return (Criteria) this;
        }

        public Criteria andBanciGreaterThanOrEqualTo(String value) {
            addCriterion("banci >=", value, "banci");
            return (Criteria) this;
        }

        public Criteria andBanciLessThan(String value) {
            addCriterion("banci <", value, "banci");
            return (Criteria) this;
        }

        public Criteria andBanciLessThanOrEqualTo(String value) {
            addCriterion("banci <=", value, "banci");
            return (Criteria) this;
        }

        public Criteria andBanciLike(String value) {
            addCriterion("banci like", value, "banci");
            return (Criteria) this;
        }

        public Criteria andBanciNotLike(String value) {
            addCriterion("banci not like", value, "banci");
            return (Criteria) this;
        }

        public Criteria andBanciIn(List<String> values) {
            addCriterion("banci in", values, "banci");
            return (Criteria) this;
        }

        public Criteria andBanciNotIn(List<String> values) {
            addCriterion("banci not in", values, "banci");
            return (Criteria) this;
        }

        public Criteria andBanciBetween(String value1, String value2) {
            addCriterion("banci between", value1, value2, "banci");
            return (Criteria) this;
        }

        public Criteria andBanciNotBetween(String value1, String value2) {
            addCriterion("banci not between", value1, value2, "banci");
            return (Criteria) this;
        }

        public Criteria andCreatenameIsNull() {
            addCriterion("createName is null");
            return (Criteria) this;
        }

        public Criteria andCreatenameIsNotNull() {
            addCriterion("createName is not null");
            return (Criteria) this;
        }

        public Criteria andCreatenameEqualTo(String value) {
            addCriterion("createName =", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameNotEqualTo(String value) {
            addCriterion("createName <>", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameGreaterThan(String value) {
            addCriterion("createName >", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameGreaterThanOrEqualTo(String value) {
            addCriterion("createName >=", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameLessThan(String value) {
            addCriterion("createName <", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameLessThanOrEqualTo(String value) {
            addCriterion("createName <=", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameLike(String value) {
            addCriterion("createName like", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameNotLike(String value) {
            addCriterion("createName not like", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameIn(List<String> values) {
            addCriterion("createName in", values, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameNotIn(List<String> values) {
            addCriterion("createName not in", values, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameBetween(String value1, String value2) {
            addCriterion("createName between", value1, value2, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameNotBetween(String value1, String value2) {
            addCriterion("createName not between", value1, value2, "createname");
            return (Criteria) this;
        }

        public Criteria andConfirmnameIsNull() {
            addCriterion("confirmName is null");
            return (Criteria) this;
        }

        public Criteria andConfirmnameIsNotNull() {
            addCriterion("confirmName is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmnameEqualTo(String value) {
            addCriterion("confirmName =", value, "confirmname");
            return (Criteria) this;
        }

        public Criteria andConfirmnameNotEqualTo(String value) {
            addCriterion("confirmName <>", value, "confirmname");
            return (Criteria) this;
        }

        public Criteria andConfirmnameGreaterThan(String value) {
            addCriterion("confirmName >", value, "confirmname");
            return (Criteria) this;
        }

        public Criteria andConfirmnameGreaterThanOrEqualTo(String value) {
            addCriterion("confirmName >=", value, "confirmname");
            return (Criteria) this;
        }

        public Criteria andConfirmnameLessThan(String value) {
            addCriterion("confirmName <", value, "confirmname");
            return (Criteria) this;
        }

        public Criteria andConfirmnameLessThanOrEqualTo(String value) {
            addCriterion("confirmName <=", value, "confirmname");
            return (Criteria) this;
        }

        public Criteria andConfirmnameLike(String value) {
            addCriterion("confirmName like", value, "confirmname");
            return (Criteria) this;
        }

        public Criteria andConfirmnameNotLike(String value) {
            addCriterion("confirmName not like", value, "confirmname");
            return (Criteria) this;
        }

        public Criteria andConfirmnameIn(List<String> values) {
            addCriterion("confirmName in", values, "confirmname");
            return (Criteria) this;
        }

        public Criteria andConfirmnameNotIn(List<String> values) {
            addCriterion("confirmName not in", values, "confirmname");
            return (Criteria) this;
        }

        public Criteria andConfirmnameBetween(String value1, String value2) {
            addCriterion("confirmName between", value1, value2, "confirmname");
            return (Criteria) this;
        }

        public Criteria andConfirmnameNotBetween(String value1, String value2) {
            addCriterion("confirmName not between", value1, value2, "confirmname");
            return (Criteria) this;
        }

        public Criteria andLatesdesIsNull() {
            addCriterion("latesDes is null");
            return (Criteria) this;
        }

        public Criteria andLatesdesIsNotNull() {
            addCriterion("latesDes is not null");
            return (Criteria) this;
        }

        public Criteria andLatesdesEqualTo(String value) {
            addCriterion("latesDes =", value, "latesdes");
            return (Criteria) this;
        }

        public Criteria andLatesdesNotEqualTo(String value) {
            addCriterion("latesDes <>", value, "latesdes");
            return (Criteria) this;
        }

        public Criteria andLatesdesGreaterThan(String value) {
            addCriterion("latesDes >", value, "latesdes");
            return (Criteria) this;
        }

        public Criteria andLatesdesGreaterThanOrEqualTo(String value) {
            addCriterion("latesDes >=", value, "latesdes");
            return (Criteria) this;
        }

        public Criteria andLatesdesLessThan(String value) {
            addCriterion("latesDes <", value, "latesdes");
            return (Criteria) this;
        }

        public Criteria andLatesdesLessThanOrEqualTo(String value) {
            addCriterion("latesDes <=", value, "latesdes");
            return (Criteria) this;
        }

        public Criteria andLatesdesLike(String value) {
            addCriterion("latesDes like", value, "latesdes");
            return (Criteria) this;
        }

        public Criteria andLatesdesNotLike(String value) {
            addCriterion("latesDes not like", value, "latesdes");
            return (Criteria) this;
        }

        public Criteria andLatesdesIn(List<String> values) {
            addCriterion("latesDes in", values, "latesdes");
            return (Criteria) this;
        }

        public Criteria andLatesdesNotIn(List<String> values) {
            addCriterion("latesDes not in", values, "latesdes");
            return (Criteria) this;
        }

        public Criteria andLatesdesBetween(String value1, String value2) {
            addCriterion("latesDes between", value1, value2, "latesdes");
            return (Criteria) this;
        }

        public Criteria andLatesdesNotBetween(String value1, String value2) {
            addCriterion("latesDes not between", value1, value2, "latesdes");
            return (Criteria) this;
        }

        public Criteria andBikesdesIsNull() {
            addCriterion("bikesDes is null");
            return (Criteria) this;
        }

        public Criteria andBikesdesIsNotNull() {
            addCriterion("bikesDes is not null");
            return (Criteria) this;
        }

        public Criteria andBikesdesEqualTo(String value) {
            addCriterion("bikesDes =", value, "bikesdes");
            return (Criteria) this;
        }

        public Criteria andBikesdesNotEqualTo(String value) {
            addCriterion("bikesDes <>", value, "bikesdes");
            return (Criteria) this;
        }

        public Criteria andBikesdesGreaterThan(String value) {
            addCriterion("bikesDes >", value, "bikesdes");
            return (Criteria) this;
        }

        public Criteria andBikesdesGreaterThanOrEqualTo(String value) {
            addCriterion("bikesDes >=", value, "bikesdes");
            return (Criteria) this;
        }

        public Criteria andBikesdesLessThan(String value) {
            addCriterion("bikesDes <", value, "bikesdes");
            return (Criteria) this;
        }

        public Criteria andBikesdesLessThanOrEqualTo(String value) {
            addCriterion("bikesDes <=", value, "bikesdes");
            return (Criteria) this;
        }

        public Criteria andBikesdesLike(String value) {
            addCriterion("bikesDes like", value, "bikesdes");
            return (Criteria) this;
        }

        public Criteria andBikesdesNotLike(String value) {
            addCriterion("bikesDes not like", value, "bikesdes");
            return (Criteria) this;
        }

        public Criteria andBikesdesIn(List<String> values) {
            addCriterion("bikesDes in", values, "bikesdes");
            return (Criteria) this;
        }

        public Criteria andBikesdesNotIn(List<String> values) {
            addCriterion("bikesDes not in", values, "bikesdes");
            return (Criteria) this;
        }

        public Criteria andBikesdesBetween(String value1, String value2) {
            addCriterion("bikesDes between", value1, value2, "bikesdes");
            return (Criteria) this;
        }

        public Criteria andBikesdesNotBetween(String value1, String value2) {
            addCriterion("bikesDes not between", value1, value2, "bikesdes");
            return (Criteria) this;
        }

        public Criteria andKeysdesIsNull() {
            addCriterion("keysDes is null");
            return (Criteria) this;
        }

        public Criteria andKeysdesIsNotNull() {
            addCriterion("keysDes is not null");
            return (Criteria) this;
        }

        public Criteria andKeysdesEqualTo(String value) {
            addCriterion("keysDes =", value, "keysdes");
            return (Criteria) this;
        }

        public Criteria andKeysdesNotEqualTo(String value) {
            addCriterion("keysDes <>", value, "keysdes");
            return (Criteria) this;
        }

        public Criteria andKeysdesGreaterThan(String value) {
            addCriterion("keysDes >", value, "keysdes");
            return (Criteria) this;
        }

        public Criteria andKeysdesGreaterThanOrEqualTo(String value) {
            addCriterion("keysDes >=", value, "keysdes");
            return (Criteria) this;
        }

        public Criteria andKeysdesLessThan(String value) {
            addCriterion("keysDes <", value, "keysdes");
            return (Criteria) this;
        }

        public Criteria andKeysdesLessThanOrEqualTo(String value) {
            addCriterion("keysDes <=", value, "keysdes");
            return (Criteria) this;
        }

        public Criteria andKeysdesLike(String value) {
            addCriterion("keysDes like", value, "keysdes");
            return (Criteria) this;
        }

        public Criteria andKeysdesNotLike(String value) {
            addCriterion("keysDes not like", value, "keysdes");
            return (Criteria) this;
        }

        public Criteria andKeysdesIn(List<String> values) {
            addCriterion("keysDes in", values, "keysdes");
            return (Criteria) this;
        }

        public Criteria andKeysdesNotIn(List<String> values) {
            addCriterion("keysDes not in", values, "keysdes");
            return (Criteria) this;
        }

        public Criteria andKeysdesBetween(String value1, String value2) {
            addCriterion("keysDes between", value1, value2, "keysdes");
            return (Criteria) this;
        }

        public Criteria andKeysdesNotBetween(String value1, String value2) {
            addCriterion("keysDes not between", value1, value2, "keysdes");
            return (Criteria) this;
        }

        public Criteria andCdmd125IsNull() {
            addCriterion("CDMD125 is null");
            return (Criteria) this;
        }

        public Criteria andCdmd125IsNotNull() {
            addCriterion("CDMD125 is not null");
            return (Criteria) this;
        }

        public Criteria andCdmd125EqualTo(String value) {
            addCriterion("CDMD125 =", value, "cdmd125");
            return (Criteria) this;
        }

        public Criteria andCdmd125NotEqualTo(String value) {
            addCriterion("CDMD125 <>", value, "cdmd125");
            return (Criteria) this;
        }

        public Criteria andCdmd125GreaterThan(String value) {
            addCriterion("CDMD125 >", value, "cdmd125");
            return (Criteria) this;
        }

        public Criteria andCdmd125GreaterThanOrEqualTo(String value) {
            addCriterion("CDMD125 >=", value, "cdmd125");
            return (Criteria) this;
        }

        public Criteria andCdmd125LessThan(String value) {
            addCriterion("CDMD125 <", value, "cdmd125");
            return (Criteria) this;
        }

        public Criteria andCdmd125LessThanOrEqualTo(String value) {
            addCriterion("CDMD125 <=", value, "cdmd125");
            return (Criteria) this;
        }

        public Criteria andCdmd125Like(String value) {
            addCriterion("CDMD125 like", value, "cdmd125");
            return (Criteria) this;
        }

        public Criteria andCdmd125NotLike(String value) {
            addCriterion("CDMD125 not like", value, "cdmd125");
            return (Criteria) this;
        }

        public Criteria andCdmd125In(List<String> values) {
            addCriterion("CDMD125 in", values, "cdmd125");
            return (Criteria) this;
        }

        public Criteria andCdmd125NotIn(List<String> values) {
            addCriterion("CDMD125 not in", values, "cdmd125");
            return (Criteria) this;
        }

        public Criteria andCdmd125Between(String value1, String value2) {
            addCriterion("CDMD125 between", value1, value2, "cdmd125");
            return (Criteria) this;
        }

        public Criteria andCdmd125NotBetween(String value1, String value2) {
            addCriterion("CDMD125 not between", value1, value2, "cdmd125");
            return (Criteria) this;
        }

        public Criteria andCdmd182IsNull() {
            addCriterion("CDMD182 is null");
            return (Criteria) this;
        }

        public Criteria andCdmd182IsNotNull() {
            addCriterion("CDMD182 is not null");
            return (Criteria) this;
        }

        public Criteria andCdmd182EqualTo(String value) {
            addCriterion("CDMD182 =", value, "cdmd182");
            return (Criteria) this;
        }

        public Criteria andCdmd182NotEqualTo(String value) {
            addCriterion("CDMD182 <>", value, "cdmd182");
            return (Criteria) this;
        }

        public Criteria andCdmd182GreaterThan(String value) {
            addCriterion("CDMD182 >", value, "cdmd182");
            return (Criteria) this;
        }

        public Criteria andCdmd182GreaterThanOrEqualTo(String value) {
            addCriterion("CDMD182 >=", value, "cdmd182");
            return (Criteria) this;
        }

        public Criteria andCdmd182LessThan(String value) {
            addCriterion("CDMD182 <", value, "cdmd182");
            return (Criteria) this;
        }

        public Criteria andCdmd182LessThanOrEqualTo(String value) {
            addCriterion("CDMD182 <=", value, "cdmd182");
            return (Criteria) this;
        }

        public Criteria andCdmd182Like(String value) {
            addCriterion("CDMD182 like", value, "cdmd182");
            return (Criteria) this;
        }

        public Criteria andCdmd182NotLike(String value) {
            addCriterion("CDMD182 not like", value, "cdmd182");
            return (Criteria) this;
        }

        public Criteria andCdmd182In(List<String> values) {
            addCriterion("CDMD182 in", values, "cdmd182");
            return (Criteria) this;
        }

        public Criteria andCdmd182NotIn(List<String> values) {
            addCriterion("CDMD182 not in", values, "cdmd182");
            return (Criteria) this;
        }

        public Criteria andCdmd182Between(String value1, String value2) {
            addCriterion("CDMD182 between", value1, value2, "cdmd182");
            return (Criteria) this;
        }

        public Criteria andCdmd182NotBetween(String value1, String value2) {
            addCriterion("CDMD182 not between", value1, value2, "cdmd182");
            return (Criteria) this;
        }

        public Criteria andCuqIsNull() {
            addCriterion("CUQ is null");
            return (Criteria) this;
        }

        public Criteria andCuqIsNotNull() {
            addCriterion("CUQ is not null");
            return (Criteria) this;
        }

        public Criteria andCuqEqualTo(String value) {
            addCriterion("CUQ =", value, "cuq");
            return (Criteria) this;
        }

        public Criteria andCuqNotEqualTo(String value) {
            addCriterion("CUQ <>", value, "cuq");
            return (Criteria) this;
        }

        public Criteria andCuqGreaterThan(String value) {
            addCriterion("CUQ >", value, "cuq");
            return (Criteria) this;
        }

        public Criteria andCuqGreaterThanOrEqualTo(String value) {
            addCriterion("CUQ >=", value, "cuq");
            return (Criteria) this;
        }

        public Criteria andCuqLessThan(String value) {
            addCriterion("CUQ <", value, "cuq");
            return (Criteria) this;
        }

        public Criteria andCuqLessThanOrEqualTo(String value) {
            addCriterion("CUQ <=", value, "cuq");
            return (Criteria) this;
        }

        public Criteria andCuqLike(String value) {
            addCriterion("CUQ like", value, "cuq");
            return (Criteria) this;
        }

        public Criteria andCuqNotLike(String value) {
            addCriterion("CUQ not like", value, "cuq");
            return (Criteria) this;
        }

        public Criteria andCuqIn(List<String> values) {
            addCriterion("CUQ in", values, "cuq");
            return (Criteria) this;
        }

        public Criteria andCuqNotIn(List<String> values) {
            addCriterion("CUQ not in", values, "cuq");
            return (Criteria) this;
        }

        public Criteria andCuqBetween(String value1, String value2) {
            addCriterion("CUQ between", value1, value2, "cuq");
            return (Criteria) this;
        }

        public Criteria andCuqNotBetween(String value1, String value2) {
            addCriterion("CUQ not between", value1, value2, "cuq");
            return (Criteria) this;
        }

        public Criteria andEduIsNull() {
            addCriterion("EDU is null");
            return (Criteria) this;
        }

        public Criteria andEduIsNotNull() {
            addCriterion("EDU is not null");
            return (Criteria) this;
        }

        public Criteria andEduEqualTo(String value) {
            addCriterion("EDU =", value, "edu");
            return (Criteria) this;
        }

        public Criteria andEduNotEqualTo(String value) {
            addCriterion("EDU <>", value, "edu");
            return (Criteria) this;
        }

        public Criteria andEduGreaterThan(String value) {
            addCriterion("EDU >", value, "edu");
            return (Criteria) this;
        }

        public Criteria andEduGreaterThanOrEqualTo(String value) {
            addCriterion("EDU >=", value, "edu");
            return (Criteria) this;
        }

        public Criteria andEduLessThan(String value) {
            addCriterion("EDU <", value, "edu");
            return (Criteria) this;
        }

        public Criteria andEduLessThanOrEqualTo(String value) {
            addCriterion("EDU <=", value, "edu");
            return (Criteria) this;
        }

        public Criteria andEduLike(String value) {
            addCriterion("EDU like", value, "edu");
            return (Criteria) this;
        }

        public Criteria andEduNotLike(String value) {
            addCriterion("EDU not like", value, "edu");
            return (Criteria) this;
        }

        public Criteria andEduIn(List<String> values) {
            addCriterion("EDU in", values, "edu");
            return (Criteria) this;
        }

        public Criteria andEduNotIn(List<String> values) {
            addCriterion("EDU not in", values, "edu");
            return (Criteria) this;
        }

        public Criteria andEduBetween(String value1, String value2) {
            addCriterion("EDU between", value1, value2, "edu");
            return (Criteria) this;
        }

        public Criteria andEduNotBetween(String value1, String value2) {
            addCriterion("EDU not between", value1, value2, "edu");
            return (Criteria) this;
        }

        public Criteria andLogistics1IsNull() {
            addCriterion("logistics1 is null");
            return (Criteria) this;
        }

        public Criteria andLogistics1IsNotNull() {
            addCriterion("logistics1 is not null");
            return (Criteria) this;
        }

        public Criteria andLogistics1EqualTo(Integer value) {
            addCriterion("logistics1 =", value, "logistics1");
            return (Criteria) this;
        }

        public Criteria andLogistics1NotEqualTo(Integer value) {
            addCriterion("logistics1 <>", value, "logistics1");
            return (Criteria) this;
        }

        public Criteria andLogistics1GreaterThan(Integer value) {
            addCriterion("logistics1 >", value, "logistics1");
            return (Criteria) this;
        }

        public Criteria andLogistics1GreaterThanOrEqualTo(Integer value) {
            addCriterion("logistics1 >=", value, "logistics1");
            return (Criteria) this;
        }

        public Criteria andLogistics1LessThan(Integer value) {
            addCriterion("logistics1 <", value, "logistics1");
            return (Criteria) this;
        }

        public Criteria andLogistics1LessThanOrEqualTo(Integer value) {
            addCriterion("logistics1 <=", value, "logistics1");
            return (Criteria) this;
        }

        public Criteria andLogistics1In(List<Integer> values) {
            addCriterion("logistics1 in", values, "logistics1");
            return (Criteria) this;
        }

        public Criteria andLogistics1NotIn(List<Integer> values) {
            addCriterion("logistics1 not in", values, "logistics1");
            return (Criteria) this;
        }

        public Criteria andLogistics1Between(Integer value1, Integer value2) {
            addCriterion("logistics1 between", value1, value2, "logistics1");
            return (Criteria) this;
        }

        public Criteria andLogistics1NotBetween(Integer value1, Integer value2) {
            addCriterion("logistics1 not between", value1, value2, "logistics1");
            return (Criteria) this;
        }

        public Criteria andLogistics2IsNull() {
            addCriterion("logistics2 is null");
            return (Criteria) this;
        }

        public Criteria andLogistics2IsNotNull() {
            addCriterion("logistics2 is not null");
            return (Criteria) this;
        }

        public Criteria andLogistics2EqualTo(Integer value) {
            addCriterion("logistics2 =", value, "logistics2");
            return (Criteria) this;
        }

        public Criteria andLogistics2NotEqualTo(Integer value) {
            addCriterion("logistics2 <>", value, "logistics2");
            return (Criteria) this;
        }

        public Criteria andLogistics2GreaterThan(Integer value) {
            addCriterion("logistics2 >", value, "logistics2");
            return (Criteria) this;
        }

        public Criteria andLogistics2GreaterThanOrEqualTo(Integer value) {
            addCriterion("logistics2 >=", value, "logistics2");
            return (Criteria) this;
        }

        public Criteria andLogistics2LessThan(Integer value) {
            addCriterion("logistics2 <", value, "logistics2");
            return (Criteria) this;
        }

        public Criteria andLogistics2LessThanOrEqualTo(Integer value) {
            addCriterion("logistics2 <=", value, "logistics2");
            return (Criteria) this;
        }

        public Criteria andLogistics2In(List<Integer> values) {
            addCriterion("logistics2 in", values, "logistics2");
            return (Criteria) this;
        }

        public Criteria andLogistics2NotIn(List<Integer> values) {
            addCriterion("logistics2 not in", values, "logistics2");
            return (Criteria) this;
        }

        public Criteria andLogistics2Between(Integer value1, Integer value2) {
            addCriterion("logistics2 between", value1, value2, "logistics2");
            return (Criteria) this;
        }

        public Criteria andLogistics2NotBetween(Integer value1, Integer value2) {
            addCriterion("logistics2 not between", value1, value2, "logistics2");
            return (Criteria) this;
        }

        public Criteria andCdmdunfinishIsNull() {
            addCriterion("CDMDUnfinish is null");
            return (Criteria) this;
        }

        public Criteria andCdmdunfinishIsNotNull() {
            addCriterion("CDMDUnfinish is not null");
            return (Criteria) this;
        }

        public Criteria andCdmdunfinishEqualTo(Integer value) {
            addCriterion("CDMDUnfinish =", value, "cdmdunfinish");
            return (Criteria) this;
        }

        public Criteria andCdmdunfinishNotEqualTo(Integer value) {
            addCriterion("CDMDUnfinish <>", value, "cdmdunfinish");
            return (Criteria) this;
        }

        public Criteria andCdmdunfinishGreaterThan(Integer value) {
            addCriterion("CDMDUnfinish >", value, "cdmdunfinish");
            return (Criteria) this;
        }

        public Criteria andCdmdunfinishGreaterThanOrEqualTo(Integer value) {
            addCriterion("CDMDUnfinish >=", value, "cdmdunfinish");
            return (Criteria) this;
        }

        public Criteria andCdmdunfinishLessThan(Integer value) {
            addCriterion("CDMDUnfinish <", value, "cdmdunfinish");
            return (Criteria) this;
        }

        public Criteria andCdmdunfinishLessThanOrEqualTo(Integer value) {
            addCriterion("CDMDUnfinish <=", value, "cdmdunfinish");
            return (Criteria) this;
        }

        public Criteria andCdmdunfinishIn(List<Integer> values) {
            addCriterion("CDMDUnfinish in", values, "cdmdunfinish");
            return (Criteria) this;
        }

        public Criteria andCdmdunfinishNotIn(List<Integer> values) {
            addCriterion("CDMDUnfinish not in", values, "cdmdunfinish");
            return (Criteria) this;
        }

        public Criteria andCdmdunfinishBetween(Integer value1, Integer value2) {
            addCriterion("CDMDUnfinish between", value1, value2, "cdmdunfinish");
            return (Criteria) this;
        }

        public Criteria andCdmdunfinishNotBetween(Integer value1, Integer value2) {
            addCriterion("CDMDUnfinish not between", value1, value2, "cdmdunfinish");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
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