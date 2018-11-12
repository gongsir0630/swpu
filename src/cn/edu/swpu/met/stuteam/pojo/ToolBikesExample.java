package cn.edu.swpu.met.stuteam.pojo;

import java.util.ArrayList;
import java.util.List;

public class ToolBikesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ToolBikesExample() {
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

        public Criteria andBikeidIsNull() {
            addCriterion("bikeId is null");
            return (Criteria) this;
        }

        public Criteria andBikeidIsNotNull() {
            addCriterion("bikeId is not null");
            return (Criteria) this;
        }

        public Criteria andBikeidEqualTo(String value) {
            addCriterion("bikeId =", value, "bikeid");
            return (Criteria) this;
        }

        public Criteria andBikeidNotEqualTo(String value) {
            addCriterion("bikeId <>", value, "bikeid");
            return (Criteria) this;
        }

        public Criteria andBikeidGreaterThan(String value) {
            addCriterion("bikeId >", value, "bikeid");
            return (Criteria) this;
        }

        public Criteria andBikeidGreaterThanOrEqualTo(String value) {
            addCriterion("bikeId >=", value, "bikeid");
            return (Criteria) this;
        }

        public Criteria andBikeidLessThan(String value) {
            addCriterion("bikeId <", value, "bikeid");
            return (Criteria) this;
        }

        public Criteria andBikeidLessThanOrEqualTo(String value) {
            addCriterion("bikeId <=", value, "bikeid");
            return (Criteria) this;
        }

        public Criteria andBikeidLike(String value) {
            addCriterion("bikeId like", value, "bikeid");
            return (Criteria) this;
        }

        public Criteria andBikeidNotLike(String value) {
            addCriterion("bikeId not like", value, "bikeid");
            return (Criteria) this;
        }

        public Criteria andBikeidIn(List<String> values) {
            addCriterion("bikeId in", values, "bikeid");
            return (Criteria) this;
        }

        public Criteria andBikeidNotIn(List<String> values) {
            addCriterion("bikeId not in", values, "bikeid");
            return (Criteria) this;
        }

        public Criteria andBikeidBetween(String value1, String value2) {
            addCriterion("bikeId between", value1, value2, "bikeid");
            return (Criteria) this;
        }

        public Criteria andBikeidNotBetween(String value1, String value2) {
            addCriterion("bikeId not between", value1, value2, "bikeid");
            return (Criteria) this;
        }

        public Criteria andBikenameIsNull() {
            addCriterion("bikeName is null");
            return (Criteria) this;
        }

        public Criteria andBikenameIsNotNull() {
            addCriterion("bikeName is not null");
            return (Criteria) this;
        }

        public Criteria andBikenameEqualTo(String value) {
            addCriterion("bikeName =", value, "bikename");
            return (Criteria) this;
        }

        public Criteria andBikenameNotEqualTo(String value) {
            addCriterion("bikeName <>", value, "bikename");
            return (Criteria) this;
        }

        public Criteria andBikenameGreaterThan(String value) {
            addCriterion("bikeName >", value, "bikename");
            return (Criteria) this;
        }

        public Criteria andBikenameGreaterThanOrEqualTo(String value) {
            addCriterion("bikeName >=", value, "bikename");
            return (Criteria) this;
        }

        public Criteria andBikenameLessThan(String value) {
            addCriterion("bikeName <", value, "bikename");
            return (Criteria) this;
        }

        public Criteria andBikenameLessThanOrEqualTo(String value) {
            addCriterion("bikeName <=", value, "bikename");
            return (Criteria) this;
        }

        public Criteria andBikenameLike(String value) {
            addCriterion("bikeName like", value, "bikename");
            return (Criteria) this;
        }

        public Criteria andBikenameNotLike(String value) {
            addCriterion("bikeName not like", value, "bikename");
            return (Criteria) this;
        }

        public Criteria andBikenameIn(List<String> values) {
            addCriterion("bikeName in", values, "bikename");
            return (Criteria) this;
        }

        public Criteria andBikenameNotIn(List<String> values) {
            addCriterion("bikeName not in", values, "bikename");
            return (Criteria) this;
        }

        public Criteria andBikenameBetween(String value1, String value2) {
            addCriterion("bikeName between", value1, value2, "bikename");
            return (Criteria) this;
        }

        public Criteria andBikenameNotBetween(String value1, String value2) {
            addCriterion("bikeName not between", value1, value2, "bikename");
            return (Criteria) this;
        }

        public Criteria andBikepriceIsNull() {
            addCriterion("bikePrice is null");
            return (Criteria) this;
        }

        public Criteria andBikepriceIsNotNull() {
            addCriterion("bikePrice is not null");
            return (Criteria) this;
        }

        public Criteria andBikepriceEqualTo(Double value) {
            addCriterion("bikePrice =", value, "bikeprice");
            return (Criteria) this;
        }

        public Criteria andBikepriceNotEqualTo(Double value) {
            addCriterion("bikePrice <>", value, "bikeprice");
            return (Criteria) this;
        }

        public Criteria andBikepriceGreaterThan(Double value) {
            addCriterion("bikePrice >", value, "bikeprice");
            return (Criteria) this;
        }

        public Criteria andBikepriceGreaterThanOrEqualTo(Double value) {
            addCriterion("bikePrice >=", value, "bikeprice");
            return (Criteria) this;
        }

        public Criteria andBikepriceLessThan(Double value) {
            addCriterion("bikePrice <", value, "bikeprice");
            return (Criteria) this;
        }

        public Criteria andBikepriceLessThanOrEqualTo(Double value) {
            addCriterion("bikePrice <=", value, "bikeprice");
            return (Criteria) this;
        }

        public Criteria andBikepriceIn(List<Double> values) {
            addCriterion("bikePrice in", values, "bikeprice");
            return (Criteria) this;
        }

        public Criteria andBikepriceNotIn(List<Double> values) {
            addCriterion("bikePrice not in", values, "bikeprice");
            return (Criteria) this;
        }

        public Criteria andBikepriceBetween(Double value1, Double value2) {
            addCriterion("bikePrice between", value1, value2, "bikeprice");
            return (Criteria) this;
        }

        public Criteria andBikepriceNotBetween(Double value1, Double value2) {
            addCriterion("bikePrice not between", value1, value2, "bikeprice");
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

        public Criteria andBikedesIsNull() {
            addCriterion("bikeDes is null");
            return (Criteria) this;
        }

        public Criteria andBikedesIsNotNull() {
            addCriterion("bikeDes is not null");
            return (Criteria) this;
        }

        public Criteria andBikedesEqualTo(String value) {
            addCriterion("bikeDes =", value, "bikedes");
            return (Criteria) this;
        }

        public Criteria andBikedesNotEqualTo(String value) {
            addCriterion("bikeDes <>", value, "bikedes");
            return (Criteria) this;
        }

        public Criteria andBikedesGreaterThan(String value) {
            addCriterion("bikeDes >", value, "bikedes");
            return (Criteria) this;
        }

        public Criteria andBikedesGreaterThanOrEqualTo(String value) {
            addCriterion("bikeDes >=", value, "bikedes");
            return (Criteria) this;
        }

        public Criteria andBikedesLessThan(String value) {
            addCriterion("bikeDes <", value, "bikedes");
            return (Criteria) this;
        }

        public Criteria andBikedesLessThanOrEqualTo(String value) {
            addCriterion("bikeDes <=", value, "bikedes");
            return (Criteria) this;
        }

        public Criteria andBikedesLike(String value) {
            addCriterion("bikeDes like", value, "bikedes");
            return (Criteria) this;
        }

        public Criteria andBikedesNotLike(String value) {
            addCriterion("bikeDes not like", value, "bikedes");
            return (Criteria) this;
        }

        public Criteria andBikedesIn(List<String> values) {
            addCriterion("bikeDes in", values, "bikedes");
            return (Criteria) this;
        }

        public Criteria andBikedesNotIn(List<String> values) {
            addCriterion("bikeDes not in", values, "bikedes");
            return (Criteria) this;
        }

        public Criteria andBikedesBetween(String value1, String value2) {
            addCriterion("bikeDes between", value1, value2, "bikedes");
            return (Criteria) this;
        }

        public Criteria andBikedesNotBetween(String value1, String value2) {
            addCriterion("bikeDes not between", value1, value2, "bikedes");
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