package com.alochol.empmanagerserver.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ManagerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManagerExample() {
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

        public Criteria andMgr_nameIsNull() {
            addCriterion("mgr_name is null");
            return (Criteria) this;
        }

        public Criteria andMgr_nameIsNotNull() {
            addCriterion("mgr_name is not null");
            return (Criteria) this;
        }

        public Criteria andMgr_nameEqualTo(String value) {
            addCriterion("mgr_name =", value, "mgr_name");
            return (Criteria) this;
        }

        public Criteria andMgr_nameNotEqualTo(String value) {
            addCriterion("mgr_name <>", value, "mgr_name");
            return (Criteria) this;
        }

        public Criteria andMgr_nameGreaterThan(String value) {
            addCriterion("mgr_name >", value, "mgr_name");
            return (Criteria) this;
        }

        public Criteria andMgr_nameGreaterThanOrEqualTo(String value) {
            addCriterion("mgr_name >=", value, "mgr_name");
            return (Criteria) this;
        }

        public Criteria andMgr_nameLessThan(String value) {
            addCriterion("mgr_name <", value, "mgr_name");
            return (Criteria) this;
        }

        public Criteria andMgr_nameLessThanOrEqualTo(String value) {
            addCriterion("mgr_name <=", value, "mgr_name");
            return (Criteria) this;
        }

        public Criteria andMgr_nameLike(String value) {
            addCriterion("mgr_name like", value, "mgr_name");
            return (Criteria) this;
        }

        public Criteria andMgr_nameNotLike(String value) {
            addCriterion("mgr_name not like", value, "mgr_name");
            return (Criteria) this;
        }

        public Criteria andMgr_nameIn(List<String> values) {
            addCriterion("mgr_name in", values, "mgr_name");
            return (Criteria) this;
        }

        public Criteria andMgr_nameNotIn(List<String> values) {
            addCriterion("mgr_name not in", values, "mgr_name");
            return (Criteria) this;
        }

        public Criteria andMgr_nameBetween(String value1, String value2) {
            addCriterion("mgr_name between", value1, value2, "mgr_name");
            return (Criteria) this;
        }

        public Criteria andMgr_nameNotBetween(String value1, String value2) {
            addCriterion("mgr_name not between", value1, value2, "mgr_name");
            return (Criteria) this;
        }

        public Criteria andMgr_ageIsNull() {
            addCriterion("mgr_age is null");
            return (Criteria) this;
        }

        public Criteria andMgr_ageIsNotNull() {
            addCriterion("mgr_age is not null");
            return (Criteria) this;
        }

        public Criteria andMgr_ageEqualTo(Integer value) {
            addCriterion("mgr_age =", value, "mgr_age");
            return (Criteria) this;
        }

        public Criteria andMgr_ageNotEqualTo(Integer value) {
            addCriterion("mgr_age <>", value, "mgr_age");
            return (Criteria) this;
        }

        public Criteria andMgr_ageGreaterThan(Integer value) {
            addCriterion("mgr_age >", value, "mgr_age");
            return (Criteria) this;
        }

        public Criteria andMgr_ageGreaterThanOrEqualTo(Integer value) {
            addCriterion("mgr_age >=", value, "mgr_age");
            return (Criteria) this;
        }

        public Criteria andMgr_ageLessThan(Integer value) {
            addCriterion("mgr_age <", value, "mgr_age");
            return (Criteria) this;
        }

        public Criteria andMgr_ageLessThanOrEqualTo(Integer value) {
            addCriterion("mgr_age <=", value, "mgr_age");
            return (Criteria) this;
        }

        public Criteria andMgr_ageIn(List<Integer> values) {
            addCriterion("mgr_age in", values, "mgr_age");
            return (Criteria) this;
        }

        public Criteria andMgr_ageNotIn(List<Integer> values) {
            addCriterion("mgr_age not in", values, "mgr_age");
            return (Criteria) this;
        }

        public Criteria andMgr_ageBetween(Integer value1, Integer value2) {
            addCriterion("mgr_age between", value1, value2, "mgr_age");
            return (Criteria) this;
        }

        public Criteria andMgr_ageNotBetween(Integer value1, Integer value2) {
            addCriterion("mgr_age not between", value1, value2, "mgr_age");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Byte value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Byte value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Byte value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Byte value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Byte value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Byte value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Byte> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Byte> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Byte value1, Byte value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Byte value1, Byte value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andRole_idIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRole_idIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRole_idEqualTo(Byte value) {
            addCriterion("role_id =", value, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idNotEqualTo(Byte value) {
            addCriterion("role_id <>", value, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idGreaterThan(Byte value) {
            addCriterion("role_id >", value, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idGreaterThanOrEqualTo(Byte value) {
            addCriterion("role_id >=", value, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idLessThan(Byte value) {
            addCriterion("role_id <", value, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idLessThanOrEqualTo(Byte value) {
            addCriterion("role_id <=", value, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idIn(List<Byte> values) {
            addCriterion("role_id in", values, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idNotIn(List<Byte> values) {
            addCriterion("role_id not in", values, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idBetween(Byte value1, Byte value2) {
            addCriterion("role_id between", value1, value2, "role_id");
            return (Criteria) this;
        }

        public Criteria andRole_idNotBetween(Byte value1, Byte value2) {
            addCriterion("role_id not between", value1, value2, "role_id");
            return (Criteria) this;
        }

        public Criteria andMgr_passwordIsNull() {
            addCriterion("mgr_password is null");
            return (Criteria) this;
        }

        public Criteria andMgr_passwordIsNotNull() {
            addCriterion("mgr_password is not null");
            return (Criteria) this;
        }

        public Criteria andMgr_passwordEqualTo(String value) {
            addCriterion("mgr_password =", value, "mgr_password");
            return (Criteria) this;
        }

        public Criteria andMgr_passwordNotEqualTo(String value) {
            addCriterion("mgr_password <>", value, "mgr_password");
            return (Criteria) this;
        }

        public Criteria andMgr_passwordGreaterThan(String value) {
            addCriterion("mgr_password >", value, "mgr_password");
            return (Criteria) this;
        }

        public Criteria andMgr_passwordGreaterThanOrEqualTo(String value) {
            addCriterion("mgr_password >=", value, "mgr_password");
            return (Criteria) this;
        }

        public Criteria andMgr_passwordLessThan(String value) {
            addCriterion("mgr_password <", value, "mgr_password");
            return (Criteria) this;
        }

        public Criteria andMgr_passwordLessThanOrEqualTo(String value) {
            addCriterion("mgr_password <=", value, "mgr_password");
            return (Criteria) this;
        }

        public Criteria andMgr_passwordLike(String value) {
            addCriterion("mgr_password like", value, "mgr_password");
            return (Criteria) this;
        }

        public Criteria andMgr_passwordNotLike(String value) {
            addCriterion("mgr_password not like", value, "mgr_password");
            return (Criteria) this;
        }

        public Criteria andMgr_passwordIn(List<String> values) {
            addCriterion("mgr_password in", values, "mgr_password");
            return (Criteria) this;
        }

        public Criteria andMgr_passwordNotIn(List<String> values) {
            addCriterion("mgr_password not in", values, "mgr_password");
            return (Criteria) this;
        }

        public Criteria andMgr_passwordBetween(String value1, String value2) {
            addCriterion("mgr_password between", value1, value2, "mgr_password");
            return (Criteria) this;
        }

        public Criteria andMgr_passwordNotBetween(String value1, String value2) {
            addCriterion("mgr_password not between", value1, value2, "mgr_password");
            return (Criteria) this;
        }

        public Criteria andMgr_statusIsNull() {
            addCriterion("mgr_status is null");
            return (Criteria) this;
        }

        public Criteria andMgr_statusIsNotNull() {
            addCriterion("mgr_status is not null");
            return (Criteria) this;
        }

        public Criteria andMgr_statusEqualTo(Byte value) {
            addCriterion("mgr_status =", value, "mgr_status");
            return (Criteria) this;
        }

        public Criteria andMgr_statusNotEqualTo(Byte value) {
            addCriterion("mgr_status <>", value, "mgr_status");
            return (Criteria) this;
        }

        public Criteria andMgr_statusGreaterThan(Byte value) {
            addCriterion("mgr_status >", value, "mgr_status");
            return (Criteria) this;
        }

        public Criteria andMgr_statusGreaterThanOrEqualTo(Byte value) {
            addCriterion("mgr_status >=", value, "mgr_status");
            return (Criteria) this;
        }

        public Criteria andMgr_statusLessThan(Byte value) {
            addCriterion("mgr_status <", value, "mgr_status");
            return (Criteria) this;
        }

        public Criteria andMgr_statusLessThanOrEqualTo(Byte value) {
            addCriterion("mgr_status <=", value, "mgr_status");
            return (Criteria) this;
        }

        public Criteria andMgr_statusIn(List<Byte> values) {
            addCriterion("mgr_status in", values, "mgr_status");
            return (Criteria) this;
        }

        public Criteria andMgr_statusNotIn(List<Byte> values) {
            addCriterion("mgr_status not in", values, "mgr_status");
            return (Criteria) this;
        }

        public Criteria andMgr_statusBetween(Byte value1, Byte value2) {
            addCriterion("mgr_status between", value1, value2, "mgr_status");
            return (Criteria) this;
        }

        public Criteria andMgr_statusNotBetween(Byte value1, Byte value2) {
            addCriterion("mgr_status not between", value1, value2, "mgr_status");
            return (Criteria) this;
        }

        public Criteria andMgr_remarkIsNull() {
            addCriterion("mgr_remark is null");
            return (Criteria) this;
        }

        public Criteria andMgr_remarkIsNotNull() {
            addCriterion("mgr_remark is not null");
            return (Criteria) this;
        }

        public Criteria andMgr_remarkEqualTo(String value) {
            addCriterion("mgr_remark =", value, "mgr_remark");
            return (Criteria) this;
        }

        public Criteria andMgr_remarkNotEqualTo(String value) {
            addCriterion("mgr_remark <>", value, "mgr_remark");
            return (Criteria) this;
        }

        public Criteria andMgr_remarkGreaterThan(String value) {
            addCriterion("mgr_remark >", value, "mgr_remark");
            return (Criteria) this;
        }

        public Criteria andMgr_remarkGreaterThanOrEqualTo(String value) {
            addCriterion("mgr_remark >=", value, "mgr_remark");
            return (Criteria) this;
        }

        public Criteria andMgr_remarkLessThan(String value) {
            addCriterion("mgr_remark <", value, "mgr_remark");
            return (Criteria) this;
        }

        public Criteria andMgr_remarkLessThanOrEqualTo(String value) {
            addCriterion("mgr_remark <=", value, "mgr_remark");
            return (Criteria) this;
        }

        public Criteria andMgr_remarkLike(String value) {
            addCriterion("mgr_remark like", value, "mgr_remark");
            return (Criteria) this;
        }

        public Criteria andMgr_remarkNotLike(String value) {
            addCriterion("mgr_remark not like", value, "mgr_remark");
            return (Criteria) this;
        }

        public Criteria andMgr_remarkIn(List<String> values) {
            addCriterion("mgr_remark in", values, "mgr_remark");
            return (Criteria) this;
        }

        public Criteria andMgr_remarkNotIn(List<String> values) {
            addCriterion("mgr_remark not in", values, "mgr_remark");
            return (Criteria) this;
        }

        public Criteria andMgr_remarkBetween(String value1, String value2) {
            addCriterion("mgr_remark between", value1, value2, "mgr_remark");
            return (Criteria) this;
        }

        public Criteria andMgr_remarkNotBetween(String value1, String value2) {
            addCriterion("mgr_remark not between", value1, value2, "mgr_remark");
            return (Criteria) this;
        }

        public Criteria andCreate_idIsNull() {
            addCriterion("create_id is null");
            return (Criteria) this;
        }

        public Criteria andCreate_idIsNotNull() {
            addCriterion("create_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_idEqualTo(String value) {
            addCriterion("create_id =", value, "create_id");
            return (Criteria) this;
        }

        public Criteria andCreate_idNotEqualTo(String value) {
            addCriterion("create_id <>", value, "create_id");
            return (Criteria) this;
        }

        public Criteria andCreate_idGreaterThan(String value) {
            addCriterion("create_id >", value, "create_id");
            return (Criteria) this;
        }

        public Criteria andCreate_idGreaterThanOrEqualTo(String value) {
            addCriterion("create_id >=", value, "create_id");
            return (Criteria) this;
        }

        public Criteria andCreate_idLessThan(String value) {
            addCriterion("create_id <", value, "create_id");
            return (Criteria) this;
        }

        public Criteria andCreate_idLessThanOrEqualTo(String value) {
            addCriterion("create_id <=", value, "create_id");
            return (Criteria) this;
        }

        public Criteria andCreate_idLike(String value) {
            addCriterion("create_id like", value, "create_id");
            return (Criteria) this;
        }

        public Criteria andCreate_idNotLike(String value) {
            addCriterion("create_id not like", value, "create_id");
            return (Criteria) this;
        }

        public Criteria andCreate_idIn(List<String> values) {
            addCriterion("create_id in", values, "create_id");
            return (Criteria) this;
        }

        public Criteria andCreate_idNotIn(List<String> values) {
            addCriterion("create_id not in", values, "create_id");
            return (Criteria) this;
        }

        public Criteria andCreate_idBetween(String value1, String value2) {
            addCriterion("create_id between", value1, value2, "create_id");
            return (Criteria) this;
        }

        public Criteria andCreate_idNotBetween(String value1, String value2) {
            addCriterion("create_id not between", value1, value2, "create_id");
            return (Criteria) this;
        }

        public Criteria andCreate_dateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreate_dateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_dateEqualTo(Date value) {
            addCriterion("create_date =", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateGreaterThan(Date value) {
            addCriterion("create_date >", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateLessThan(Date value) {
            addCriterion("create_date <", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateIn(List<Date> values) {
            addCriterion("create_date in", values, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "create_date");
            return (Criteria) this;
        }

        public Criteria andUpdate_dateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdate_dateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdate_dateEqualTo(Date value) {
            addCriterion("update_date =", value, "update_date");
            return (Criteria) this;
        }

        public Criteria andUpdate_dateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "update_date");
            return (Criteria) this;
        }

        public Criteria andUpdate_dateGreaterThan(Date value) {
            addCriterion("update_date >", value, "update_date");
            return (Criteria) this;
        }

        public Criteria andUpdate_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "update_date");
            return (Criteria) this;
        }

        public Criteria andUpdate_dateLessThan(Date value) {
            addCriterion("update_date <", value, "update_date");
            return (Criteria) this;
        }

        public Criteria andUpdate_dateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "update_date");
            return (Criteria) this;
        }

        public Criteria andUpdate_dateIn(List<Date> values) {
            addCriterion("update_date in", values, "update_date");
            return (Criteria) this;
        }

        public Criteria andUpdate_dateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "update_date");
            return (Criteria) this;
        }

        public Criteria andUpdate_dateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "update_date");
            return (Criteria) this;
        }

        public Criteria andUpdate_dateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "update_date");
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