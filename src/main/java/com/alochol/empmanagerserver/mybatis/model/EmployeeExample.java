package com.alochol.empmanagerserver.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeExample() {
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

        public Criteria andEmp_nameIsNull() {
            addCriterion("emp_name is null");
            return (Criteria) this;
        }

        public Criteria andEmp_nameIsNotNull() {
            addCriterion("emp_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmp_nameEqualTo(String value) {
            addCriterion("emp_name =", value, "emp_name");
            return (Criteria) this;
        }

        public Criteria andEmp_nameNotEqualTo(String value) {
            addCriterion("emp_name <>", value, "emp_name");
            return (Criteria) this;
        }

        public Criteria andEmp_nameGreaterThan(String value) {
            addCriterion("emp_name >", value, "emp_name");
            return (Criteria) this;
        }

        public Criteria andEmp_nameGreaterThanOrEqualTo(String value) {
            addCriterion("emp_name >=", value, "emp_name");
            return (Criteria) this;
        }

        public Criteria andEmp_nameLessThan(String value) {
            addCriterion("emp_name <", value, "emp_name");
            return (Criteria) this;
        }

        public Criteria andEmp_nameLessThanOrEqualTo(String value) {
            addCriterion("emp_name <=", value, "emp_name");
            return (Criteria) this;
        }

        public Criteria andEmp_nameLike(String value) {
            addCriterion("emp_name like", value, "emp_name");
            return (Criteria) this;
        }

        public Criteria andEmp_nameNotLike(String value) {
            addCriterion("emp_name not like", value, "emp_name");
            return (Criteria) this;
        }

        public Criteria andEmp_nameIn(List<String> values) {
            addCriterion("emp_name in", values, "emp_name");
            return (Criteria) this;
        }

        public Criteria andEmp_nameNotIn(List<String> values) {
            addCriterion("emp_name not in", values, "emp_name");
            return (Criteria) this;
        }

        public Criteria andEmp_nameBetween(String value1, String value2) {
            addCriterion("emp_name between", value1, value2, "emp_name");
            return (Criteria) this;
        }

        public Criteria andEmp_nameNotBetween(String value1, String value2) {
            addCriterion("emp_name not between", value1, value2, "emp_name");
            return (Criteria) this;
        }

        public Criteria andEmp_genderIsNull() {
            addCriterion("emp_gender is null");
            return (Criteria) this;
        }

        public Criteria andEmp_genderIsNotNull() {
            addCriterion("emp_gender is not null");
            return (Criteria) this;
        }

        public Criteria andEmp_genderEqualTo(Byte value) {
            addCriterion("emp_gender =", value, "emp_gender");
            return (Criteria) this;
        }

        public Criteria andEmp_genderNotEqualTo(Byte value) {
            addCriterion("emp_gender <>", value, "emp_gender");
            return (Criteria) this;
        }

        public Criteria andEmp_genderGreaterThan(Byte value) {
            addCriterion("emp_gender >", value, "emp_gender");
            return (Criteria) this;
        }

        public Criteria andEmp_genderGreaterThanOrEqualTo(Byte value) {
            addCriterion("emp_gender >=", value, "emp_gender");
            return (Criteria) this;
        }

        public Criteria andEmp_genderLessThan(Byte value) {
            addCriterion("emp_gender <", value, "emp_gender");
            return (Criteria) this;
        }

        public Criteria andEmp_genderLessThanOrEqualTo(Byte value) {
            addCriterion("emp_gender <=", value, "emp_gender");
            return (Criteria) this;
        }

        public Criteria andEmp_genderIn(List<Byte> values) {
            addCriterion("emp_gender in", values, "emp_gender");
            return (Criteria) this;
        }

        public Criteria andEmp_genderNotIn(List<Byte> values) {
            addCriterion("emp_gender not in", values, "emp_gender");
            return (Criteria) this;
        }

        public Criteria andEmp_genderBetween(Byte value1, Byte value2) {
            addCriterion("emp_gender between", value1, value2, "emp_gender");
            return (Criteria) this;
        }

        public Criteria andEmp_genderNotBetween(Byte value1, Byte value2) {
            addCriterion("emp_gender not between", value1, value2, "emp_gender");
            return (Criteria) this;
        }

        public Criteria andEmp_ageIsNull() {
            addCriterion("emp_age is null");
            return (Criteria) this;
        }

        public Criteria andEmp_ageIsNotNull() {
            addCriterion("emp_age is not null");
            return (Criteria) this;
        }

        public Criteria andEmp_ageEqualTo(Integer value) {
            addCriterion("emp_age =", value, "emp_age");
            return (Criteria) this;
        }

        public Criteria andEmp_ageNotEqualTo(Integer value) {
            addCriterion("emp_age <>", value, "emp_age");
            return (Criteria) this;
        }

        public Criteria andEmp_ageGreaterThan(Integer value) {
            addCriterion("emp_age >", value, "emp_age");
            return (Criteria) this;
        }

        public Criteria andEmp_ageGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_age >=", value, "emp_age");
            return (Criteria) this;
        }

        public Criteria andEmp_ageLessThan(Integer value) {
            addCriterion("emp_age <", value, "emp_age");
            return (Criteria) this;
        }

        public Criteria andEmp_ageLessThanOrEqualTo(Integer value) {
            addCriterion("emp_age <=", value, "emp_age");
            return (Criteria) this;
        }

        public Criteria andEmp_ageIn(List<Integer> values) {
            addCriterion("emp_age in", values, "emp_age");
            return (Criteria) this;
        }

        public Criteria andEmp_ageNotIn(List<Integer> values) {
            addCriterion("emp_age not in", values, "emp_age");
            return (Criteria) this;
        }

        public Criteria andEmp_ageBetween(Integer value1, Integer value2) {
            addCriterion("emp_age between", value1, value2, "emp_age");
            return (Criteria) this;
        }

        public Criteria andEmp_ageNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_age not between", value1, value2, "emp_age");
            return (Criteria) this;
        }

        public Criteria andEmp_codeIsNull() {
            addCriterion("emp_code is null");
            return (Criteria) this;
        }

        public Criteria andEmp_codeIsNotNull() {
            addCriterion("emp_code is not null");
            return (Criteria) this;
        }

        public Criteria andEmp_codeEqualTo(String value) {
            addCriterion("emp_code =", value, "emp_code");
            return (Criteria) this;
        }

        public Criteria andEmp_codeNotEqualTo(String value) {
            addCriterion("emp_code <>", value, "emp_code");
            return (Criteria) this;
        }

        public Criteria andEmp_codeGreaterThan(String value) {
            addCriterion("emp_code >", value, "emp_code");
            return (Criteria) this;
        }

        public Criteria andEmp_codeGreaterThanOrEqualTo(String value) {
            addCriterion("emp_code >=", value, "emp_code");
            return (Criteria) this;
        }

        public Criteria andEmp_codeLessThan(String value) {
            addCriterion("emp_code <", value, "emp_code");
            return (Criteria) this;
        }

        public Criteria andEmp_codeLessThanOrEqualTo(String value) {
            addCriterion("emp_code <=", value, "emp_code");
            return (Criteria) this;
        }

        public Criteria andEmp_codeLike(String value) {
            addCriterion("emp_code like", value, "emp_code");
            return (Criteria) this;
        }

        public Criteria andEmp_codeNotLike(String value) {
            addCriterion("emp_code not like", value, "emp_code");
            return (Criteria) this;
        }

        public Criteria andEmp_codeIn(List<String> values) {
            addCriterion("emp_code in", values, "emp_code");
            return (Criteria) this;
        }

        public Criteria andEmp_codeNotIn(List<String> values) {
            addCriterion("emp_code not in", values, "emp_code");
            return (Criteria) this;
        }

        public Criteria andEmp_codeBetween(String value1, String value2) {
            addCriterion("emp_code between", value1, value2, "emp_code");
            return (Criteria) this;
        }

        public Criteria andEmp_codeNotBetween(String value1, String value2) {
            addCriterion("emp_code not between", value1, value2, "emp_code");
            return (Criteria) this;
        }

        public Criteria andEmp_salaryIsNull() {
            addCriterion("emp_salary is null");
            return (Criteria) this;
        }

        public Criteria andEmp_salaryIsNotNull() {
            addCriterion("emp_salary is not null");
            return (Criteria) this;
        }

        public Criteria andEmp_salaryEqualTo(Integer value) {
            addCriterion("emp_salary =", value, "emp_salary");
            return (Criteria) this;
        }

        public Criteria andEmp_salaryNotEqualTo(Integer value) {
            addCriterion("emp_salary <>", value, "emp_salary");
            return (Criteria) this;
        }

        public Criteria andEmp_salaryGreaterThan(Integer value) {
            addCriterion("emp_salary >", value, "emp_salary");
            return (Criteria) this;
        }

        public Criteria andEmp_salaryGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_salary >=", value, "emp_salary");
            return (Criteria) this;
        }

        public Criteria andEmp_salaryLessThan(Integer value) {
            addCriterion("emp_salary <", value, "emp_salary");
            return (Criteria) this;
        }

        public Criteria andEmp_salaryLessThanOrEqualTo(Integer value) {
            addCriterion("emp_salary <=", value, "emp_salary");
            return (Criteria) this;
        }

        public Criteria andEmp_salaryIn(List<Integer> values) {
            addCriterion("emp_salary in", values, "emp_salary");
            return (Criteria) this;
        }

        public Criteria andEmp_salaryNotIn(List<Integer> values) {
            addCriterion("emp_salary not in", values, "emp_salary");
            return (Criteria) this;
        }

        public Criteria andEmp_salaryBetween(Integer value1, Integer value2) {
            addCriterion("emp_salary between", value1, value2, "emp_salary");
            return (Criteria) this;
        }

        public Criteria andEmp_salaryNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_salary not between", value1, value2, "emp_salary");
            return (Criteria) this;
        }

        public Criteria andEmp_remarkIsNull() {
            addCriterion("emp_remark is null");
            return (Criteria) this;
        }

        public Criteria andEmp_remarkIsNotNull() {
            addCriterion("emp_remark is not null");
            return (Criteria) this;
        }

        public Criteria andEmp_remarkEqualTo(String value) {
            addCriterion("emp_remark =", value, "emp_remark");
            return (Criteria) this;
        }

        public Criteria andEmp_remarkNotEqualTo(String value) {
            addCriterion("emp_remark <>", value, "emp_remark");
            return (Criteria) this;
        }

        public Criteria andEmp_remarkGreaterThan(String value) {
            addCriterion("emp_remark >", value, "emp_remark");
            return (Criteria) this;
        }

        public Criteria andEmp_remarkGreaterThanOrEqualTo(String value) {
            addCriterion("emp_remark >=", value, "emp_remark");
            return (Criteria) this;
        }

        public Criteria andEmp_remarkLessThan(String value) {
            addCriterion("emp_remark <", value, "emp_remark");
            return (Criteria) this;
        }

        public Criteria andEmp_remarkLessThanOrEqualTo(String value) {
            addCriterion("emp_remark <=", value, "emp_remark");
            return (Criteria) this;
        }

        public Criteria andEmp_remarkLike(String value) {
            addCriterion("emp_remark like", value, "emp_remark");
            return (Criteria) this;
        }

        public Criteria andEmp_remarkNotLike(String value) {
            addCriterion("emp_remark not like", value, "emp_remark");
            return (Criteria) this;
        }

        public Criteria andEmp_remarkIn(List<String> values) {
            addCriterion("emp_remark in", values, "emp_remark");
            return (Criteria) this;
        }

        public Criteria andEmp_remarkNotIn(List<String> values) {
            addCriterion("emp_remark not in", values, "emp_remark");
            return (Criteria) this;
        }

        public Criteria andEmp_remarkBetween(String value1, String value2) {
            addCriterion("emp_remark between", value1, value2, "emp_remark");
            return (Criteria) this;
        }

        public Criteria andEmp_remarkNotBetween(String value1, String value2) {
            addCriterion("emp_remark not between", value1, value2, "emp_remark");
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