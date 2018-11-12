package cn.edu.swpu.met.stuteam.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdertableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdertableExample() {
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

        public Criteria andStarttimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("startTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("startTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("startTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("startTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("startTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("startTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("startTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("startTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("startTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("startTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andTabletypeIsNull() {
            addCriterion("tableType is null");
            return (Criteria) this;
        }

        public Criteria andTabletypeIsNotNull() {
            addCriterion("tableType is not null");
            return (Criteria) this;
        }

        public Criteria andTabletypeEqualTo(Integer value) {
            addCriterion("tableType =", value, "tabletype");
            return (Criteria) this;
        }

        public Criteria andTabletypeNotEqualTo(Integer value) {
            addCriterion("tableType <>", value, "tabletype");
            return (Criteria) this;
        }

        public Criteria andTabletypeGreaterThan(Integer value) {
            addCriterion("tableType >", value, "tabletype");
            return (Criteria) this;
        }

        public Criteria andTabletypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("tableType >=", value, "tabletype");
            return (Criteria) this;
        }

        public Criteria andTabletypeLessThan(Integer value) {
            addCriterion("tableType <", value, "tabletype");
            return (Criteria) this;
        }

        public Criteria andTabletypeLessThanOrEqualTo(Integer value) {
            addCriterion("tableType <=", value, "tabletype");
            return (Criteria) this;
        }

        public Criteria andTabletypeIn(List<Integer> values) {
            addCriterion("tableType in", values, "tabletype");
            return (Criteria) this;
        }

        public Criteria andTabletypeNotIn(List<Integer> values) {
            addCriterion("tableType not in", values, "tabletype");
            return (Criteria) this;
        }

        public Criteria andTabletypeBetween(Integer value1, Integer value2) {
            addCriterion("tableType between", value1, value2, "tabletype");
            return (Criteria) this;
        }

        public Criteria andTabletypeNotBetween(Integer value1, Integer value2) {
            addCriterion("tableType not between", value1, value2, "tabletype");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNull() {
            addCriterion("userType is null");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNotNull() {
            addCriterion("userType is not null");
            return (Criteria) this;
        }

        public Criteria andUsertypeEqualTo(Integer value) {
            addCriterion("userType =", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotEqualTo(Integer value) {
            addCriterion("userType <>", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThan(Integer value) {
            addCriterion("userType >", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("userType >=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThan(Integer value) {
            addCriterion("userType <", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThanOrEqualTo(Integer value) {
            addCriterion("userType <=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeIn(List<Integer> values) {
            addCriterion("userType in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotIn(List<Integer> values) {
            addCriterion("userType not in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeBetween(Integer value1, Integer value2) {
            addCriterion("userType between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotBetween(Integer value1, Integer value2) {
            addCriterion("userType not between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andAppointmenttimeIsNull() {
            addCriterion("appointmentTime is null");
            return (Criteria) this;
        }

        public Criteria andAppointmenttimeIsNotNull() {
            addCriterion("appointmentTime is not null");
            return (Criteria) this;
        }

        public Criteria andAppointmenttimeEqualTo(Date value) {
            addCriterion("appointmentTime =", value, "appointmenttime");
            return (Criteria) this;
        }

        public Criteria andAppointmenttimeNotEqualTo(Date value) {
            addCriterion("appointmentTime <>", value, "appointmenttime");
            return (Criteria) this;
        }

        public Criteria andAppointmenttimeGreaterThan(Date value) {
            addCriterion("appointmentTime >", value, "appointmenttime");
            return (Criteria) this;
        }

        public Criteria andAppointmenttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("appointmentTime >=", value, "appointmenttime");
            return (Criteria) this;
        }

        public Criteria andAppointmenttimeLessThan(Date value) {
            addCriterion("appointmentTime <", value, "appointmenttime");
            return (Criteria) this;
        }

        public Criteria andAppointmenttimeLessThanOrEqualTo(Date value) {
            addCriterion("appointmentTime <=", value, "appointmenttime");
            return (Criteria) this;
        }

        public Criteria andAppointmenttimeIn(List<Date> values) {
            addCriterion("appointmentTime in", values, "appointmenttime");
            return (Criteria) this;
        }

        public Criteria andAppointmenttimeNotIn(List<Date> values) {
            addCriterion("appointmentTime not in", values, "appointmenttime");
            return (Criteria) this;
        }

        public Criteria andAppointmenttimeBetween(Date value1, Date value2) {
            addCriterion("appointmentTime between", value1, value2, "appointmenttime");
            return (Criteria) this;
        }

        public Criteria andAppointmenttimeNotBetween(Date value1, Date value2) {
            addCriterion("appointmentTime not between", value1, value2, "appointmenttime");
            return (Criteria) this;
        }

        public Criteria andUserphoneIsNull() {
            addCriterion("userPhone is null");
            return (Criteria) this;
        }

        public Criteria andUserphoneIsNotNull() {
            addCriterion("userPhone is not null");
            return (Criteria) this;
        }

        public Criteria andUserphoneEqualTo(String value) {
            addCriterion("userPhone =", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotEqualTo(String value) {
            addCriterion("userPhone <>", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneGreaterThan(String value) {
            addCriterion("userPhone >", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneGreaterThanOrEqualTo(String value) {
            addCriterion("userPhone >=", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLessThan(String value) {
            addCriterion("userPhone <", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLessThanOrEqualTo(String value) {
            addCriterion("userPhone <=", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLike(String value) {
            addCriterion("userPhone like", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotLike(String value) {
            addCriterion("userPhone not like", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneIn(List<String> values) {
            addCriterion("userPhone in", values, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotIn(List<String> values) {
            addCriterion("userPhone not in", values, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneBetween(String value1, String value2) {
            addCriterion("userPhone between", value1, value2, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotBetween(String value1, String value2) {
            addCriterion("userPhone not between", value1, value2, "userphone");
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

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andStartnameIsNull() {
            addCriterion("startname is null");
            return (Criteria) this;
        }

        public Criteria andStartnameIsNotNull() {
            addCriterion("startname is not null");
            return (Criteria) this;
        }

        public Criteria andStartnameEqualTo(String value) {
            addCriterion("startname =", value, "startname");
            return (Criteria) this;
        }

        public Criteria andStartnameNotEqualTo(String value) {
            addCriterion("startname <>", value, "startname");
            return (Criteria) this;
        }

        public Criteria andStartnameGreaterThan(String value) {
            addCriterion("startname >", value, "startname");
            return (Criteria) this;
        }

        public Criteria andStartnameGreaterThanOrEqualTo(String value) {
            addCriterion("startname >=", value, "startname");
            return (Criteria) this;
        }

        public Criteria andStartnameLessThan(String value) {
            addCriterion("startname <", value, "startname");
            return (Criteria) this;
        }

        public Criteria andStartnameLessThanOrEqualTo(String value) {
            addCriterion("startname <=", value, "startname");
            return (Criteria) this;
        }

        public Criteria andStartnameLike(String value) {
            addCriterion("startname like", value, "startname");
            return (Criteria) this;
        }

        public Criteria andStartnameNotLike(String value) {
            addCriterion("startname not like", value, "startname");
            return (Criteria) this;
        }

        public Criteria andStartnameIn(List<String> values) {
            addCriterion("startname in", values, "startname");
            return (Criteria) this;
        }

        public Criteria andStartnameNotIn(List<String> values) {
            addCriterion("startname not in", values, "startname");
            return (Criteria) this;
        }

        public Criteria andStartnameBetween(String value1, String value2) {
            addCriterion("startname between", value1, value2, "startname");
            return (Criteria) this;
        }

        public Criteria andStartnameNotBetween(String value1, String value2) {
            addCriterion("startname not between", value1, value2, "startname");
            return (Criteria) this;
        }

        public Criteria andStartnamestringIsNull() {
            addCriterion("startNameString is null");
            return (Criteria) this;
        }

        public Criteria andStartnamestringIsNotNull() {
            addCriterion("startNameString is not null");
            return (Criteria) this;
        }

        public Criteria andStartnamestringEqualTo(String value) {
            addCriterion("startNameString =", value, "startnamestring");
            return (Criteria) this;
        }

        public Criteria andStartnamestringNotEqualTo(String value) {
            addCriterion("startNameString <>", value, "startnamestring");
            return (Criteria) this;
        }

        public Criteria andStartnamestringGreaterThan(String value) {
            addCriterion("startNameString >", value, "startnamestring");
            return (Criteria) this;
        }

        public Criteria andStartnamestringGreaterThanOrEqualTo(String value) {
            addCriterion("startNameString >=", value, "startnamestring");
            return (Criteria) this;
        }

        public Criteria andStartnamestringLessThan(String value) {
            addCriterion("startNameString <", value, "startnamestring");
            return (Criteria) this;
        }

        public Criteria andStartnamestringLessThanOrEqualTo(String value) {
            addCriterion("startNameString <=", value, "startnamestring");
            return (Criteria) this;
        }

        public Criteria andStartnamestringLike(String value) {
            addCriterion("startNameString like", value, "startnamestring");
            return (Criteria) this;
        }

        public Criteria andStartnamestringNotLike(String value) {
            addCriterion("startNameString not like", value, "startnamestring");
            return (Criteria) this;
        }

        public Criteria andStartnamestringIn(List<String> values) {
            addCriterion("startNameString in", values, "startnamestring");
            return (Criteria) this;
        }

        public Criteria andStartnamestringNotIn(List<String> values) {
            addCriterion("startNameString not in", values, "startnamestring");
            return (Criteria) this;
        }

        public Criteria andStartnamestringBetween(String value1, String value2) {
            addCriterion("startNameString between", value1, value2, "startnamestring");
            return (Criteria) this;
        }

        public Criteria andStartnamestringNotBetween(String value1, String value2) {
            addCriterion("startNameString not between", value1, value2, "startnamestring");
            return (Criteria) this;
        }

        public Criteria andEndnameIsNull() {
            addCriterion("endName is null");
            return (Criteria) this;
        }

        public Criteria andEndnameIsNotNull() {
            addCriterion("endName is not null");
            return (Criteria) this;
        }

        public Criteria andEndnameEqualTo(String value) {
            addCriterion("endName =", value, "endname");
            return (Criteria) this;
        }

        public Criteria andEndnameNotEqualTo(String value) {
            addCriterion("endName <>", value, "endname");
            return (Criteria) this;
        }

        public Criteria andEndnameGreaterThan(String value) {
            addCriterion("endName >", value, "endname");
            return (Criteria) this;
        }

        public Criteria andEndnameGreaterThanOrEqualTo(String value) {
            addCriterion("endName >=", value, "endname");
            return (Criteria) this;
        }

        public Criteria andEndnameLessThan(String value) {
            addCriterion("endName <", value, "endname");
            return (Criteria) this;
        }

        public Criteria andEndnameLessThanOrEqualTo(String value) {
            addCriterion("endName <=", value, "endname");
            return (Criteria) this;
        }

        public Criteria andEndnameLike(String value) {
            addCriterion("endName like", value, "endname");
            return (Criteria) this;
        }

        public Criteria andEndnameNotLike(String value) {
            addCriterion("endName not like", value, "endname");
            return (Criteria) this;
        }

        public Criteria andEndnameIn(List<String> values) {
            addCriterion("endName in", values, "endname");
            return (Criteria) this;
        }

        public Criteria andEndnameNotIn(List<String> values) {
            addCriterion("endName not in", values, "endname");
            return (Criteria) this;
        }

        public Criteria andEndnameBetween(String value1, String value2) {
            addCriterion("endName between", value1, value2, "endname");
            return (Criteria) this;
        }

        public Criteria andEndnameNotBetween(String value1, String value2) {
            addCriterion("endName not between", value1, value2, "endname");
            return (Criteria) this;
        }

        public Criteria andChudanrenIsNull() {
            addCriterion("chudanren is null");
            return (Criteria) this;
        }

        public Criteria andChudanrenIsNotNull() {
            addCriterion("chudanren is not null");
            return (Criteria) this;
        }

        public Criteria andChudanrenEqualTo(String value) {
            addCriterion("chudanren =", value, "chudanren");
            return (Criteria) this;
        }

        public Criteria andChudanrenNotEqualTo(String value) {
            addCriterion("chudanren <>", value, "chudanren");
            return (Criteria) this;
        }

        public Criteria andChudanrenGreaterThan(String value) {
            addCriterion("chudanren >", value, "chudanren");
            return (Criteria) this;
        }

        public Criteria andChudanrenGreaterThanOrEqualTo(String value) {
            addCriterion("chudanren >=", value, "chudanren");
            return (Criteria) this;
        }

        public Criteria andChudanrenLessThan(String value) {
            addCriterion("chudanren <", value, "chudanren");
            return (Criteria) this;
        }

        public Criteria andChudanrenLessThanOrEqualTo(String value) {
            addCriterion("chudanren <=", value, "chudanren");
            return (Criteria) this;
        }

        public Criteria andChudanrenLike(String value) {
            addCriterion("chudanren like", value, "chudanren");
            return (Criteria) this;
        }

        public Criteria andChudanrenNotLike(String value) {
            addCriterion("chudanren not like", value, "chudanren");
            return (Criteria) this;
        }

        public Criteria andChudanrenIn(List<String> values) {
            addCriterion("chudanren in", values, "chudanren");
            return (Criteria) this;
        }

        public Criteria andChudanrenNotIn(List<String> values) {
            addCriterion("chudanren not in", values, "chudanren");
            return (Criteria) this;
        }

        public Criteria andChudanrenBetween(String value1, String value2) {
            addCriterion("chudanren between", value1, value2, "chudanren");
            return (Criteria) this;
        }

        public Criteria andChudanrenNotBetween(String value1, String value2) {
            addCriterion("chudanren not between", value1, value2, "chudanren");
            return (Criteria) this;
        }

        public Criteria andChudannameIsNull() {
            addCriterion("chudanname is null");
            return (Criteria) this;
        }

        public Criteria andChudannameIsNotNull() {
            addCriterion("chudanname is not null");
            return (Criteria) this;
        }

        public Criteria andChudannameEqualTo(String value) {
            addCriterion("chudanname =", value, "chudanname");
            return (Criteria) this;
        }

        public Criteria andChudannameNotEqualTo(String value) {
            addCriterion("chudanname <>", value, "chudanname");
            return (Criteria) this;
        }

        public Criteria andChudannameGreaterThan(String value) {
            addCriterion("chudanname >", value, "chudanname");
            return (Criteria) this;
        }

        public Criteria andChudannameGreaterThanOrEqualTo(String value) {
            addCriterion("chudanname >=", value, "chudanname");
            return (Criteria) this;
        }

        public Criteria andChudannameLessThan(String value) {
            addCriterion("chudanname <", value, "chudanname");
            return (Criteria) this;
        }

        public Criteria andChudannameLessThanOrEqualTo(String value) {
            addCriterion("chudanname <=", value, "chudanname");
            return (Criteria) this;
        }

        public Criteria andChudannameLike(String value) {
            addCriterion("chudanname like", value, "chudanname");
            return (Criteria) this;
        }

        public Criteria andChudannameNotLike(String value) {
            addCriterion("chudanname not like", value, "chudanname");
            return (Criteria) this;
        }

        public Criteria andChudannameIn(List<String> values) {
            addCriterion("chudanname in", values, "chudanname");
            return (Criteria) this;
        }

        public Criteria andChudannameNotIn(List<String> values) {
            addCriterion("chudanname not in", values, "chudanname");
            return (Criteria) this;
        }

        public Criteria andChudannameBetween(String value1, String value2) {
            addCriterion("chudanname between", value1, value2, "chudanname");
            return (Criteria) this;
        }

        public Criteria andChudannameNotBetween(String value1, String value2) {
            addCriterion("chudanname not between", value1, value2, "chudanname");
            return (Criteria) this;
        }

        public Criteria andChudandateIsNull() {
            addCriterion("chudandate is null");
            return (Criteria) this;
        }

        public Criteria andChudandateIsNotNull() {
            addCriterion("chudandate is not null");
            return (Criteria) this;
        }

        public Criteria andChudandateEqualTo(Date value) {
            addCriterion("chudandate =", value, "chudandate");
            return (Criteria) this;
        }

        public Criteria andChudandateNotEqualTo(Date value) {
            addCriterion("chudandate <>", value, "chudandate");
            return (Criteria) this;
        }

        public Criteria andChudandateGreaterThan(Date value) {
            addCriterion("chudandate >", value, "chudandate");
            return (Criteria) this;
        }

        public Criteria andChudandateGreaterThanOrEqualTo(Date value) {
            addCriterion("chudandate >=", value, "chudandate");
            return (Criteria) this;
        }

        public Criteria andChudandateLessThan(Date value) {
            addCriterion("chudandate <", value, "chudandate");
            return (Criteria) this;
        }

        public Criteria andChudandateLessThanOrEqualTo(Date value) {
            addCriterion("chudandate <=", value, "chudandate");
            return (Criteria) this;
        }

        public Criteria andChudandateIn(List<Date> values) {
            addCriterion("chudandate in", values, "chudandate");
            return (Criteria) this;
        }

        public Criteria andChudandateNotIn(List<Date> values) {
            addCriterion("chudandate not in", values, "chudandate");
            return (Criteria) this;
        }

        public Criteria andChudandateBetween(Date value1, Date value2) {
            addCriterion("chudandate between", value1, value2, "chudandate");
            return (Criteria) this;
        }

        public Criteria andChudandateNotBetween(Date value1, Date value2) {
            addCriterion("chudandate not between", value1, value2, "chudandate");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endTime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andSolveIsNull() {
            addCriterion("solve is null");
            return (Criteria) this;
        }

        public Criteria andSolveIsNotNull() {
            addCriterion("solve is not null");
            return (Criteria) this;
        }

        public Criteria andSolveEqualTo(String value) {
            addCriterion("solve =", value, "solve");
            return (Criteria) this;
        }

        public Criteria andSolveNotEqualTo(String value) {
            addCriterion("solve <>", value, "solve");
            return (Criteria) this;
        }

        public Criteria andSolveGreaterThan(String value) {
            addCriterion("solve >", value, "solve");
            return (Criteria) this;
        }

        public Criteria andSolveGreaterThanOrEqualTo(String value) {
            addCriterion("solve >=", value, "solve");
            return (Criteria) this;
        }

        public Criteria andSolveLessThan(String value) {
            addCriterion("solve <", value, "solve");
            return (Criteria) this;
        }

        public Criteria andSolveLessThanOrEqualTo(String value) {
            addCriterion("solve <=", value, "solve");
            return (Criteria) this;
        }

        public Criteria andSolveLike(String value) {
            addCriterion("solve like", value, "solve");
            return (Criteria) this;
        }

        public Criteria andSolveNotLike(String value) {
            addCriterion("solve not like", value, "solve");
            return (Criteria) this;
        }

        public Criteria andSolveIn(List<String> values) {
            addCriterion("solve in", values, "solve");
            return (Criteria) this;
        }

        public Criteria andSolveNotIn(List<String> values) {
            addCriterion("solve not in", values, "solve");
            return (Criteria) this;
        }

        public Criteria andSolveBetween(String value1, String value2) {
            addCriterion("solve between", value1, value2, "solve");
            return (Criteria) this;
        }

        public Criteria andSolveNotBetween(String value1, String value2) {
            addCriterion("solve not between", value1, value2, "solve");
            return (Criteria) this;
        }

        public Criteria andDuankouIsNull() {
            addCriterion("duankou is null");
            return (Criteria) this;
        }

        public Criteria andDuankouIsNotNull() {
            addCriterion("duankou is not null");
            return (Criteria) this;
        }

        public Criteria andDuankouEqualTo(Integer value) {
            addCriterion("duankou =", value, "duankou");
            return (Criteria) this;
        }

        public Criteria andDuankouNotEqualTo(Integer value) {
            addCriterion("duankou <>", value, "duankou");
            return (Criteria) this;
        }

        public Criteria andDuankouGreaterThan(Integer value) {
            addCriterion("duankou >", value, "duankou");
            return (Criteria) this;
        }

        public Criteria andDuankouGreaterThanOrEqualTo(Integer value) {
            addCriterion("duankou >=", value, "duankou");
            return (Criteria) this;
        }

        public Criteria andDuankouLessThan(Integer value) {
            addCriterion("duankou <", value, "duankou");
            return (Criteria) this;
        }

        public Criteria andDuankouLessThanOrEqualTo(Integer value) {
            addCriterion("duankou <=", value, "duankou");
            return (Criteria) this;
        }

        public Criteria andDuankouIn(List<Integer> values) {
            addCriterion("duankou in", values, "duankou");
            return (Criteria) this;
        }

        public Criteria andDuankouNotIn(List<Integer> values) {
            addCriterion("duankou not in", values, "duankou");
            return (Criteria) this;
        }

        public Criteria andDuankouBetween(Integer value1, Integer value2) {
            addCriterion("duankou between", value1, value2, "duankou");
            return (Criteria) this;
        }

        public Criteria andDuankouNotBetween(Integer value1, Integer value2) {
            addCriterion("duankou not between", value1, value2, "duankou");
            return (Criteria) this;
        }

        public Criteria andMianbanIsNull() {
            addCriterion("mianban is null");
            return (Criteria) this;
        }

        public Criteria andMianbanIsNotNull() {
            addCriterion("mianban is not null");
            return (Criteria) this;
        }

        public Criteria andMianbanEqualTo(Integer value) {
            addCriterion("mianban =", value, "mianban");
            return (Criteria) this;
        }

        public Criteria andMianbanNotEqualTo(Integer value) {
            addCriterion("mianban <>", value, "mianban");
            return (Criteria) this;
        }

        public Criteria andMianbanGreaterThan(Integer value) {
            addCriterion("mianban >", value, "mianban");
            return (Criteria) this;
        }

        public Criteria andMianbanGreaterThanOrEqualTo(Integer value) {
            addCriterion("mianban >=", value, "mianban");
            return (Criteria) this;
        }

        public Criteria andMianbanLessThan(Integer value) {
            addCriterion("mianban <", value, "mianban");
            return (Criteria) this;
        }

        public Criteria andMianbanLessThanOrEqualTo(Integer value) {
            addCriterion("mianban <=", value, "mianban");
            return (Criteria) this;
        }

        public Criteria andMianbanIn(List<Integer> values) {
            addCriterion("mianban in", values, "mianban");
            return (Criteria) this;
        }

        public Criteria andMianbanNotIn(List<Integer> values) {
            addCriterion("mianban not in", values, "mianban");
            return (Criteria) this;
        }

        public Criteria andMianbanBetween(Integer value1, Integer value2) {
            addCriterion("mianban between", value1, value2, "mianban");
            return (Criteria) this;
        }

        public Criteria andMianbanNotBetween(Integer value1, Integer value2) {
            addCriterion("mianban not between", value1, value2, "mianban");
            return (Criteria) this;
        }

        public Criteria andShuijingtouIsNull() {
            addCriterion("shuijingtou is null");
            return (Criteria) this;
        }

        public Criteria andShuijingtouIsNotNull() {
            addCriterion("shuijingtou is not null");
            return (Criteria) this;
        }

        public Criteria andShuijingtouEqualTo(Integer value) {
            addCriterion("shuijingtou =", value, "shuijingtou");
            return (Criteria) this;
        }

        public Criteria andShuijingtouNotEqualTo(Integer value) {
            addCriterion("shuijingtou <>", value, "shuijingtou");
            return (Criteria) this;
        }

        public Criteria andShuijingtouGreaterThan(Integer value) {
            addCriterion("shuijingtou >", value, "shuijingtou");
            return (Criteria) this;
        }

        public Criteria andShuijingtouGreaterThanOrEqualTo(Integer value) {
            addCriterion("shuijingtou >=", value, "shuijingtou");
            return (Criteria) this;
        }

        public Criteria andShuijingtouLessThan(Integer value) {
            addCriterion("shuijingtou <", value, "shuijingtou");
            return (Criteria) this;
        }

        public Criteria andShuijingtouLessThanOrEqualTo(Integer value) {
            addCriterion("shuijingtou <=", value, "shuijingtou");
            return (Criteria) this;
        }

        public Criteria andShuijingtouIn(List<Integer> values) {
            addCriterion("shuijingtou in", values, "shuijingtou");
            return (Criteria) this;
        }

        public Criteria andShuijingtouNotIn(List<Integer> values) {
            addCriterion("shuijingtou not in", values, "shuijingtou");
            return (Criteria) this;
        }

        public Criteria andShuijingtouBetween(Integer value1, Integer value2) {
            addCriterion("shuijingtou between", value1, value2, "shuijingtou");
            return (Criteria) this;
        }

        public Criteria andShuijingtouNotBetween(Integer value1, Integer value2) {
            addCriterion("shuijingtou not between", value1, value2, "shuijingtou");
            return (Criteria) this;
        }

        public Criteria andWangxianIsNull() {
            addCriterion("wangxian is null");
            return (Criteria) this;
        }

        public Criteria andWangxianIsNotNull() {
            addCriterion("wangxian is not null");
            return (Criteria) this;
        }

        public Criteria andWangxianEqualTo(Integer value) {
            addCriterion("wangxian =", value, "wangxian");
            return (Criteria) this;
        }

        public Criteria andWangxianNotEqualTo(Integer value) {
            addCriterion("wangxian <>", value, "wangxian");
            return (Criteria) this;
        }

        public Criteria andWangxianGreaterThan(Integer value) {
            addCriterion("wangxian >", value, "wangxian");
            return (Criteria) this;
        }

        public Criteria andWangxianGreaterThanOrEqualTo(Integer value) {
            addCriterion("wangxian >=", value, "wangxian");
            return (Criteria) this;
        }

        public Criteria andWangxianLessThan(Integer value) {
            addCriterion("wangxian <", value, "wangxian");
            return (Criteria) this;
        }

        public Criteria andWangxianLessThanOrEqualTo(Integer value) {
            addCriterion("wangxian <=", value, "wangxian");
            return (Criteria) this;
        }

        public Criteria andWangxianIn(List<Integer> values) {
            addCriterion("wangxian in", values, "wangxian");
            return (Criteria) this;
        }

        public Criteria andWangxianNotIn(List<Integer> values) {
            addCriterion("wangxian not in", values, "wangxian");
            return (Criteria) this;
        }

        public Criteria andWangxianBetween(Integer value1, Integer value2) {
            addCriterion("wangxian between", value1, value2, "wangxian");
            return (Criteria) this;
        }

        public Criteria andWangxianNotBetween(Integer value1, Integer value2) {
            addCriterion("wangxian not between", value1, value2, "wangxian");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andChangedateIsNull() {
            addCriterion("changeDate is null");
            return (Criteria) this;
        }

        public Criteria andChangedateIsNotNull() {
            addCriterion("changeDate is not null");
            return (Criteria) this;
        }

        public Criteria andChangedateEqualTo(Date value) {
            addCriterion("changeDate =", value, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateNotEqualTo(Date value) {
            addCriterion("changeDate <>", value, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateGreaterThan(Date value) {
            addCriterion("changeDate >", value, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateGreaterThanOrEqualTo(Date value) {
            addCriterion("changeDate >=", value, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateLessThan(Date value) {
            addCriterion("changeDate <", value, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateLessThanOrEqualTo(Date value) {
            addCriterion("changeDate <=", value, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateIn(List<Date> values) {
            addCriterion("changeDate in", values, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateNotIn(List<Date> values) {
            addCriterion("changeDate not in", values, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateBetween(Date value1, Date value2) {
            addCriterion("changeDate between", value1, value2, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateNotBetween(Date value1, Date value2) {
            addCriterion("changeDate not between", value1, value2, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangebyIsNull() {
            addCriterion("changeBy is null");
            return (Criteria) this;
        }

        public Criteria andChangebyIsNotNull() {
            addCriterion("changeBy is not null");
            return (Criteria) this;
        }

        public Criteria andChangebyEqualTo(String value) {
            addCriterion("changeBy =", value, "changeby");
            return (Criteria) this;
        }

        public Criteria andChangebyNotEqualTo(String value) {
            addCriterion("changeBy <>", value, "changeby");
            return (Criteria) this;
        }

        public Criteria andChangebyGreaterThan(String value) {
            addCriterion("changeBy >", value, "changeby");
            return (Criteria) this;
        }

        public Criteria andChangebyGreaterThanOrEqualTo(String value) {
            addCriterion("changeBy >=", value, "changeby");
            return (Criteria) this;
        }

        public Criteria andChangebyLessThan(String value) {
            addCriterion("changeBy <", value, "changeby");
            return (Criteria) this;
        }

        public Criteria andChangebyLessThanOrEqualTo(String value) {
            addCriterion("changeBy <=", value, "changeby");
            return (Criteria) this;
        }

        public Criteria andChangebyLike(String value) {
            addCriterion("changeBy like", value, "changeby");
            return (Criteria) this;
        }

        public Criteria andChangebyNotLike(String value) {
            addCriterion("changeBy not like", value, "changeby");
            return (Criteria) this;
        }

        public Criteria andChangebyIn(List<String> values) {
            addCriterion("changeBy in", values, "changeby");
            return (Criteria) this;
        }

        public Criteria andChangebyNotIn(List<String> values) {
            addCriterion("changeBy not in", values, "changeby");
            return (Criteria) this;
        }

        public Criteria andChangebyBetween(String value1, String value2) {
            addCriterion("changeBy between", value1, value2, "changeby");
            return (Criteria) this;
        }

        public Criteria andChangebyNotBetween(String value1, String value2) {
            addCriterion("changeBy not between", value1, value2, "changeby");
            return (Criteria) this;
        }

        public Criteria andChangenamestringIsNull() {
            addCriterion("changeNameString is null");
            return (Criteria) this;
        }

        public Criteria andChangenamestringIsNotNull() {
            addCriterion("changeNameString is not null");
            return (Criteria) this;
        }

        public Criteria andChangenamestringEqualTo(String value) {
            addCriterion("changeNameString =", value, "changenamestring");
            return (Criteria) this;
        }

        public Criteria andChangenamestringNotEqualTo(String value) {
            addCriterion("changeNameString <>", value, "changenamestring");
            return (Criteria) this;
        }

        public Criteria andChangenamestringGreaterThan(String value) {
            addCriterion("changeNameString >", value, "changenamestring");
            return (Criteria) this;
        }

        public Criteria andChangenamestringGreaterThanOrEqualTo(String value) {
            addCriterion("changeNameString >=", value, "changenamestring");
            return (Criteria) this;
        }

        public Criteria andChangenamestringLessThan(String value) {
            addCriterion("changeNameString <", value, "changenamestring");
            return (Criteria) this;
        }

        public Criteria andChangenamestringLessThanOrEqualTo(String value) {
            addCriterion("changeNameString <=", value, "changenamestring");
            return (Criteria) this;
        }

        public Criteria andChangenamestringLike(String value) {
            addCriterion("changeNameString like", value, "changenamestring");
            return (Criteria) this;
        }

        public Criteria andChangenamestringNotLike(String value) {
            addCriterion("changeNameString not like", value, "changenamestring");
            return (Criteria) this;
        }

        public Criteria andChangenamestringIn(List<String> values) {
            addCriterion("changeNameString in", values, "changenamestring");
            return (Criteria) this;
        }

        public Criteria andChangenamestringNotIn(List<String> values) {
            addCriterion("changeNameString not in", values, "changenamestring");
            return (Criteria) this;
        }

        public Criteria andChangenamestringBetween(String value1, String value2) {
            addCriterion("changeNameString between", value1, value2, "changenamestring");
            return (Criteria) this;
        }

        public Criteria andChangenamestringNotBetween(String value1, String value2) {
            addCriterion("changeNameString not between", value1, value2, "changenamestring");
            return (Criteria) this;
        }

        public Criteria andRecordmanIsNull() {
            addCriterion("recordMan is null");
            return (Criteria) this;
        }

        public Criteria andRecordmanIsNotNull() {
            addCriterion("recordMan is not null");
            return (Criteria) this;
        }

        public Criteria andRecordmanEqualTo(String value) {
            addCriterion("recordMan =", value, "recordman");
            return (Criteria) this;
        }

        public Criteria andRecordmanNotEqualTo(String value) {
            addCriterion("recordMan <>", value, "recordman");
            return (Criteria) this;
        }

        public Criteria andRecordmanGreaterThan(String value) {
            addCriterion("recordMan >", value, "recordman");
            return (Criteria) this;
        }

        public Criteria andRecordmanGreaterThanOrEqualTo(String value) {
            addCriterion("recordMan >=", value, "recordman");
            return (Criteria) this;
        }

        public Criteria andRecordmanLessThan(String value) {
            addCriterion("recordMan <", value, "recordman");
            return (Criteria) this;
        }

        public Criteria andRecordmanLessThanOrEqualTo(String value) {
            addCriterion("recordMan <=", value, "recordman");
            return (Criteria) this;
        }

        public Criteria andRecordmanLike(String value) {
            addCriterion("recordMan like", value, "recordman");
            return (Criteria) this;
        }

        public Criteria andRecordmanNotLike(String value) {
            addCriterion("recordMan not like", value, "recordman");
            return (Criteria) this;
        }

        public Criteria andRecordmanIn(List<String> values) {
            addCriterion("recordMan in", values, "recordman");
            return (Criteria) this;
        }

        public Criteria andRecordmanNotIn(List<String> values) {
            addCriterion("recordMan not in", values, "recordman");
            return (Criteria) this;
        }

        public Criteria andRecordmanBetween(String value1, String value2) {
            addCriterion("recordMan between", value1, value2, "recordman");
            return (Criteria) this;
        }

        public Criteria andRecordmanNotBetween(String value1, String value2) {
            addCriterion("recordMan not between", value1, value2, "recordman");
            return (Criteria) this;
        }

        public Criteria andRecordnameIsNull() {
            addCriterion("recordName is null");
            return (Criteria) this;
        }

        public Criteria andRecordnameIsNotNull() {
            addCriterion("recordName is not null");
            return (Criteria) this;
        }

        public Criteria andRecordnameEqualTo(String value) {
            addCriterion("recordName =", value, "recordname");
            return (Criteria) this;
        }

        public Criteria andRecordnameNotEqualTo(String value) {
            addCriterion("recordName <>", value, "recordname");
            return (Criteria) this;
        }

        public Criteria andRecordnameGreaterThan(String value) {
            addCriterion("recordName >", value, "recordname");
            return (Criteria) this;
        }

        public Criteria andRecordnameGreaterThanOrEqualTo(String value) {
            addCriterion("recordName >=", value, "recordname");
            return (Criteria) this;
        }

        public Criteria andRecordnameLessThan(String value) {
            addCriterion("recordName <", value, "recordname");
            return (Criteria) this;
        }

        public Criteria andRecordnameLessThanOrEqualTo(String value) {
            addCriterion("recordName <=", value, "recordname");
            return (Criteria) this;
        }

        public Criteria andRecordnameLike(String value) {
            addCriterion("recordName like", value, "recordname");
            return (Criteria) this;
        }

        public Criteria andRecordnameNotLike(String value) {
            addCriterion("recordName not like", value, "recordname");
            return (Criteria) this;
        }

        public Criteria andRecordnameIn(List<String> values) {
            addCriterion("recordName in", values, "recordname");
            return (Criteria) this;
        }

        public Criteria andRecordnameNotIn(List<String> values) {
            addCriterion("recordName not in", values, "recordname");
            return (Criteria) this;
        }

        public Criteria andRecordnameBetween(String value1, String value2) {
            addCriterion("recordName between", value1, value2, "recordname");
            return (Criteria) this;
        }

        public Criteria andRecordnameNotBetween(String value1, String value2) {
            addCriterion("recordName not between", value1, value2, "recordname");
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