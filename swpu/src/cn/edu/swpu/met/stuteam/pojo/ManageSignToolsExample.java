package cn.edu.swpu.met.stuteam.pojo;

import java.util.ArrayList;
import java.util.List;

public class ManageSignToolsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManageSignToolsExample() {
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

        public Criteria andSigntableIsNull() {
            addCriterion("signTable is null");
            return (Criteria) this;
        }

        public Criteria andSigntableIsNotNull() {
            addCriterion("signTable is not null");
            return (Criteria) this;
        }

        public Criteria andSigntableEqualTo(String value) {
            addCriterion("signTable =", value, "signtable");
            return (Criteria) this;
        }

        public Criteria andSigntableNotEqualTo(String value) {
            addCriterion("signTable <>", value, "signtable");
            return (Criteria) this;
        }

        public Criteria andSigntableGreaterThan(String value) {
            addCriterion("signTable >", value, "signtable");
            return (Criteria) this;
        }

        public Criteria andSigntableGreaterThanOrEqualTo(String value) {
            addCriterion("signTable >=", value, "signtable");
            return (Criteria) this;
        }

        public Criteria andSigntableLessThan(String value) {
            addCriterion("signTable <", value, "signtable");
            return (Criteria) this;
        }

        public Criteria andSigntableLessThanOrEqualTo(String value) {
            addCriterion("signTable <=", value, "signtable");
            return (Criteria) this;
        }

        public Criteria andSigntableLike(String value) {
            addCriterion("signTable like", value, "signtable");
            return (Criteria) this;
        }

        public Criteria andSigntableNotLike(String value) {
            addCriterion("signTable not like", value, "signtable");
            return (Criteria) this;
        }

        public Criteria andSigntableIn(List<String> values) {
            addCriterion("signTable in", values, "signtable");
            return (Criteria) this;
        }

        public Criteria andSigntableNotIn(List<String> values) {
            addCriterion("signTable not in", values, "signtable");
            return (Criteria) this;
        }

        public Criteria andSigntableBetween(String value1, String value2) {
            addCriterion("signTable between", value1, value2, "signtable");
            return (Criteria) this;
        }

        public Criteria andSigntableNotBetween(String value1, String value2) {
            addCriterion("signTable not between", value1, value2, "signtable");
            return (Criteria) this;
        }

        public Criteria andToolidIsNull() {
            addCriterion("toolId is null");
            return (Criteria) this;
        }

        public Criteria andToolidIsNotNull() {
            addCriterion("toolId is not null");
            return (Criteria) this;
        }

        public Criteria andToolidEqualTo(String value) {
            addCriterion("toolId =", value, "toolid");
            return (Criteria) this;
        }

        public Criteria andToolidNotEqualTo(String value) {
            addCriterion("toolId <>", value, "toolid");
            return (Criteria) this;
        }

        public Criteria andToolidGreaterThan(String value) {
            addCriterion("toolId >", value, "toolid");
            return (Criteria) this;
        }

        public Criteria andToolidGreaterThanOrEqualTo(String value) {
            addCriterion("toolId >=", value, "toolid");
            return (Criteria) this;
        }

        public Criteria andToolidLessThan(String value) {
            addCriterion("toolId <", value, "toolid");
            return (Criteria) this;
        }

        public Criteria andToolidLessThanOrEqualTo(String value) {
            addCriterion("toolId <=", value, "toolid");
            return (Criteria) this;
        }

        public Criteria andToolidLike(String value) {
            addCriterion("toolId like", value, "toolid");
            return (Criteria) this;
        }

        public Criteria andToolidNotLike(String value) {
            addCriterion("toolId not like", value, "toolid");
            return (Criteria) this;
        }

        public Criteria andToolidIn(List<String> values) {
            addCriterion("toolId in", values, "toolid");
            return (Criteria) this;
        }

        public Criteria andToolidNotIn(List<String> values) {
            addCriterion("toolId not in", values, "toolid");
            return (Criteria) this;
        }

        public Criteria andToolidBetween(String value1, String value2) {
            addCriterion("toolId between", value1, value2, "toolid");
            return (Criteria) this;
        }

        public Criteria andToolidNotBetween(String value1, String value2) {
            addCriterion("toolId not between", value1, value2, "toolid");
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