package cn.edu.swpu.met.stuteam.pojo;

import java.util.ArrayList;
import java.util.List;

public class ManageSignKeysExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManageSignKeysExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSigntableidIsNull() {
            addCriterion("signTableId is null");
            return (Criteria) this;
        }

        public Criteria andSigntableidIsNotNull() {
            addCriterion("signTableId is not null");
            return (Criteria) this;
        }

        public Criteria andSigntableidEqualTo(String value) {
            addCriterion("signTableId =", value, "signtableid");
            return (Criteria) this;
        }

        public Criteria andSigntableidNotEqualTo(String value) {
            addCriterion("signTableId <>", value, "signtableid");
            return (Criteria) this;
        }

        public Criteria andSigntableidGreaterThan(String value) {
            addCriterion("signTableId >", value, "signtableid");
            return (Criteria) this;
        }

        public Criteria andSigntableidGreaterThanOrEqualTo(String value) {
            addCriterion("signTableId >=", value, "signtableid");
            return (Criteria) this;
        }

        public Criteria andSigntableidLessThan(String value) {
            addCriterion("signTableId <", value, "signtableid");
            return (Criteria) this;
        }

        public Criteria andSigntableidLessThanOrEqualTo(String value) {
            addCriterion("signTableId <=", value, "signtableid");
            return (Criteria) this;
        }

        public Criteria andSigntableidLike(String value) {
            addCriterion("signTableId like", value, "signtableid");
            return (Criteria) this;
        }

        public Criteria andSigntableidNotLike(String value) {
            addCriterion("signTableId not like", value, "signtableid");
            return (Criteria) this;
        }

        public Criteria andSigntableidIn(List<String> values) {
            addCriterion("signTableId in", values, "signtableid");
            return (Criteria) this;
        }

        public Criteria andSigntableidNotIn(List<String> values) {
            addCriterion("signTableId not in", values, "signtableid");
            return (Criteria) this;
        }

        public Criteria andSigntableidBetween(String value1, String value2) {
            addCriterion("signTableId between", value1, value2, "signtableid");
            return (Criteria) this;
        }

        public Criteria andSigntableidNotBetween(String value1, String value2) {
            addCriterion("signTableId not between", value1, value2, "signtableid");
            return (Criteria) this;
        }

        public Criteria andKeyidIsNull() {
            addCriterion("keyId is null");
            return (Criteria) this;
        }

        public Criteria andKeyidIsNotNull() {
            addCriterion("keyId is not null");
            return (Criteria) this;
        }

        public Criteria andKeyidEqualTo(String value) {
            addCriterion("keyId =", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidNotEqualTo(String value) {
            addCriterion("keyId <>", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidGreaterThan(String value) {
            addCriterion("keyId >", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidGreaterThanOrEqualTo(String value) {
            addCriterion("keyId >=", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidLessThan(String value) {
            addCriterion("keyId <", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidLessThanOrEqualTo(String value) {
            addCriterion("keyId <=", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidLike(String value) {
            addCriterion("keyId like", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidNotLike(String value) {
            addCriterion("keyId not like", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidIn(List<String> values) {
            addCriterion("keyId in", values, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidNotIn(List<String> values) {
            addCriterion("keyId not in", values, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidBetween(String value1, String value2) {
            addCriterion("keyId between", value1, value2, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidNotBetween(String value1, String value2) {
            addCriterion("keyId not between", value1, value2, "keyid");
            return (Criteria) this;
        }

        public Criteria andStationIsNull() {
            addCriterion("station is null");
            return (Criteria) this;
        }

        public Criteria andStationIsNotNull() {
            addCriterion("station is not null");
            return (Criteria) this;
        }

        public Criteria andStationEqualTo(Integer value) {
            addCriterion("station =", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationNotEqualTo(Integer value) {
            addCriterion("station <>", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationGreaterThan(Integer value) {
            addCriterion("station >", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationGreaterThanOrEqualTo(Integer value) {
            addCriterion("station >=", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationLessThan(Integer value) {
            addCriterion("station <", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationLessThanOrEqualTo(Integer value) {
            addCriterion("station <=", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationIn(List<Integer> values) {
            addCriterion("station in", values, "station");
            return (Criteria) this;
        }

        public Criteria andStationNotIn(List<Integer> values) {
            addCriterion("station not in", values, "station");
            return (Criteria) this;
        }

        public Criteria andStationBetween(Integer value1, Integer value2) {
            addCriterion("station between", value1, value2, "station");
            return (Criteria) this;
        }

        public Criteria andStationNotBetween(Integer value1, Integer value2) {
            addCriterion("station not between", value1, value2, "station");
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