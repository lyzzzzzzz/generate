package com.lyz.makeupMall.domain;

import java.util.ArrayList;
import java.util.List;

public class UserCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserCriteria() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserLoginpwdIsNull() {
            addCriterion("user_loginpwd is null");
            return (Criteria) this;
        }

        public Criteria andUserLoginpwdIsNotNull() {
            addCriterion("user_loginpwd is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoginpwdEqualTo(String value) {
            addCriterion("user_loginpwd =", value, "userLoginpwd");
            return (Criteria) this;
        }

        public Criteria andUserLoginpwdNotEqualTo(String value) {
            addCriterion("user_loginpwd <>", value, "userLoginpwd");
            return (Criteria) this;
        }

        public Criteria andUserLoginpwdGreaterThan(String value) {
            addCriterion("user_loginpwd >", value, "userLoginpwd");
            return (Criteria) this;
        }

        public Criteria andUserLoginpwdGreaterThanOrEqualTo(String value) {
            addCriterion("user_loginpwd >=", value, "userLoginpwd");
            return (Criteria) this;
        }

        public Criteria andUserLoginpwdLessThan(String value) {
            addCriterion("user_loginpwd <", value, "userLoginpwd");
            return (Criteria) this;
        }

        public Criteria andUserLoginpwdLessThanOrEqualTo(String value) {
            addCriterion("user_loginpwd <=", value, "userLoginpwd");
            return (Criteria) this;
        }

        public Criteria andUserLoginpwdLike(String value) {
            addCriterion("user_loginpwd like", value, "userLoginpwd");
            return (Criteria) this;
        }

        public Criteria andUserLoginpwdNotLike(String value) {
            addCriterion("user_loginpwd not like", value, "userLoginpwd");
            return (Criteria) this;
        }

        public Criteria andUserLoginpwdIn(List<String> values) {
            addCriterion("user_loginpwd in", values, "userLoginpwd");
            return (Criteria) this;
        }

        public Criteria andUserLoginpwdNotIn(List<String> values) {
            addCriterion("user_loginpwd not in", values, "userLoginpwd");
            return (Criteria) this;
        }

        public Criteria andUserLoginpwdBetween(String value1, String value2) {
            addCriterion("user_loginpwd between", value1, value2, "userLoginpwd");
            return (Criteria) this;
        }

        public Criteria andUserLoginpwdNotBetween(String value1, String value2) {
            addCriterion("user_loginpwd not between", value1, value2, "userLoginpwd");
            return (Criteria) this;
        }

        public Criteria andUserPaypwdIsNull() {
            addCriterion("user_paypwd is null");
            return (Criteria) this;
        }

        public Criteria andUserPaypwdIsNotNull() {
            addCriterion("user_paypwd is not null");
            return (Criteria) this;
        }

        public Criteria andUserPaypwdEqualTo(String value) {
            addCriterion("user_paypwd =", value, "userPaypwd");
            return (Criteria) this;
        }

        public Criteria andUserPaypwdNotEqualTo(String value) {
            addCriterion("user_paypwd <>", value, "userPaypwd");
            return (Criteria) this;
        }

        public Criteria andUserPaypwdGreaterThan(String value) {
            addCriterion("user_paypwd >", value, "userPaypwd");
            return (Criteria) this;
        }

        public Criteria andUserPaypwdGreaterThanOrEqualTo(String value) {
            addCriterion("user_paypwd >=", value, "userPaypwd");
            return (Criteria) this;
        }

        public Criteria andUserPaypwdLessThan(String value) {
            addCriterion("user_paypwd <", value, "userPaypwd");
            return (Criteria) this;
        }

        public Criteria andUserPaypwdLessThanOrEqualTo(String value) {
            addCriterion("user_paypwd <=", value, "userPaypwd");
            return (Criteria) this;
        }

        public Criteria andUserPaypwdLike(String value) {
            addCriterion("user_paypwd like", value, "userPaypwd");
            return (Criteria) this;
        }

        public Criteria andUserPaypwdNotLike(String value) {
            addCriterion("user_paypwd not like", value, "userPaypwd");
            return (Criteria) this;
        }

        public Criteria andUserPaypwdIn(List<String> values) {
            addCriterion("user_paypwd in", values, "userPaypwd");
            return (Criteria) this;
        }

        public Criteria andUserPaypwdNotIn(List<String> values) {
            addCriterion("user_paypwd not in", values, "userPaypwd");
            return (Criteria) this;
        }

        public Criteria andUserPaypwdBetween(String value1, String value2) {
            addCriterion("user_paypwd between", value1, value2, "userPaypwd");
            return (Criteria) this;
        }

        public Criteria andUserPaypwdNotBetween(String value1, String value2) {
            addCriterion("user_paypwd not between", value1, value2, "userPaypwd");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNull() {
            addCriterion("user_address is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNotNull() {
            addCriterion("user_address is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressEqualTo(String value) {
            addCriterion("user_address =", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotEqualTo(String value) {
            addCriterion("user_address <>", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThan(String value) {
            addCriterion("user_address >", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThanOrEqualTo(String value) {
            addCriterion("user_address >=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThan(String value) {
            addCriterion("user_address <", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThanOrEqualTo(String value) {
            addCriterion("user_address <=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLike(String value) {
            addCriterion("user_address like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotLike(String value) {
            addCriterion("user_address not like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressIn(List<String> values) {
            addCriterion("user_address in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotIn(List<String> values) {
            addCriterion("user_address not in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressBetween(String value1, String value2) {
            addCriterion("user_address between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotBetween(String value1, String value2) {
            addCriterion("user_address not between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLikeInsensitive(String value) {
            addCriterion("upper(user_phone) like", value.toUpperCase(), "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserLoginpwdLikeInsensitive(String value) {
            addCriterion("upper(user_loginpwd) like", value.toUpperCase(), "userLoginpwd");
            return (Criteria) this;
        }

        public Criteria andUserPaypwdLikeInsensitive(String value) {
            addCriterion("upper(user_paypwd) like", value.toUpperCase(), "userPaypwd");
            return (Criteria) this;
        }

        public Criteria andUserAddressLikeInsensitive(String value) {
            addCriterion("upper(user_address) like", value.toUpperCase(), "userAddress");
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