package xyz.redhawk.generator.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class cr_area_midExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public cr_area_midExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPatient_idIsNull() {
            addCriterion("patient_id is null");
            return (Criteria) this;
        }

        public Criteria andPatient_idIsNotNull() {
            addCriterion("patient_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatient_idEqualTo(String value) {
            addCriterion("patient_id =", value, "patient_id");
            return (Criteria) this;
        }

        public Criteria andPatient_idNotEqualTo(String value) {
            addCriterion("patient_id <>", value, "patient_id");
            return (Criteria) this;
        }

        public Criteria andPatient_idGreaterThan(String value) {
            addCriterion("patient_id >", value, "patient_id");
            return (Criteria) this;
        }

        public Criteria andPatient_idGreaterThanOrEqualTo(String value) {
            addCriterion("patient_id >=", value, "patient_id");
            return (Criteria) this;
        }

        public Criteria andPatient_idLessThan(String value) {
            addCriterion("patient_id <", value, "patient_id");
            return (Criteria) this;
        }

        public Criteria andPatient_idLessThanOrEqualTo(String value) {
            addCriterion("patient_id <=", value, "patient_id");
            return (Criteria) this;
        }

        public Criteria andPatient_idLike(String value) {
            addCriterion("patient_id like", value, "patient_id");
            return (Criteria) this;
        }

        public Criteria andPatient_idNotLike(String value) {
            addCriterion("patient_id not like", value, "patient_id");
            return (Criteria) this;
        }

        public Criteria andPatient_idIn(List<String> values) {
            addCriterion("patient_id in", values, "patient_id");
            return (Criteria) this;
        }

        public Criteria andPatient_idNotIn(List<String> values) {
            addCriterion("patient_id not in", values, "patient_id");
            return (Criteria) this;
        }

        public Criteria andPatient_idBetween(String value1, String value2) {
            addCriterion("patient_id between", value1, value2, "patient_id");
            return (Criteria) this;
        }

        public Criteria andPatient_idNotBetween(String value1, String value2) {
            addCriterion("patient_id not between", value1, value2, "patient_id");
            return (Criteria) this;
        }

        public Criteria andProvince_idIsNull() {
            addCriterion("province_id is null");
            return (Criteria) this;
        }

        public Criteria andProvince_idIsNotNull() {
            addCriterion("province_id is not null");
            return (Criteria) this;
        }

        public Criteria andProvince_idEqualTo(Long value) {
            addCriterion("province_id =", value, "province_id");
            return (Criteria) this;
        }

        public Criteria andProvince_idNotEqualTo(Long value) {
            addCriterion("province_id <>", value, "province_id");
            return (Criteria) this;
        }

        public Criteria andProvince_idGreaterThan(Long value) {
            addCriterion("province_id >", value, "province_id");
            return (Criteria) this;
        }

        public Criteria andProvince_idGreaterThanOrEqualTo(Long value) {
            addCriterion("province_id >=", value, "province_id");
            return (Criteria) this;
        }

        public Criteria andProvince_idLessThan(Long value) {
            addCriterion("province_id <", value, "province_id");
            return (Criteria) this;
        }

        public Criteria andProvince_idLessThanOrEqualTo(Long value) {
            addCriterion("province_id <=", value, "province_id");
            return (Criteria) this;
        }

        public Criteria andProvince_idIn(List<Long> values) {
            addCriterion("province_id in", values, "province_id");
            return (Criteria) this;
        }

        public Criteria andProvince_idNotIn(List<Long> values) {
            addCriterion("province_id not in", values, "province_id");
            return (Criteria) this;
        }

        public Criteria andProvince_idBetween(Long value1, Long value2) {
            addCriterion("province_id between", value1, value2, "province_id");
            return (Criteria) this;
        }

        public Criteria andProvince_idNotBetween(Long value1, Long value2) {
            addCriterion("province_id not between", value1, value2, "province_id");
            return (Criteria) this;
        }

        public Criteria andCity_idIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCity_idIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCity_idEqualTo(Long value) {
            addCriterion("city_id =", value, "city_id");
            return (Criteria) this;
        }

        public Criteria andCity_idNotEqualTo(Long value) {
            addCriterion("city_id <>", value, "city_id");
            return (Criteria) this;
        }

        public Criteria andCity_idGreaterThan(Long value) {
            addCriterion("city_id >", value, "city_id");
            return (Criteria) this;
        }

        public Criteria andCity_idGreaterThanOrEqualTo(Long value) {
            addCriterion("city_id >=", value, "city_id");
            return (Criteria) this;
        }

        public Criteria andCity_idLessThan(Long value) {
            addCriterion("city_id <", value, "city_id");
            return (Criteria) this;
        }

        public Criteria andCity_idLessThanOrEqualTo(Long value) {
            addCriterion("city_id <=", value, "city_id");
            return (Criteria) this;
        }

        public Criteria andCity_idIn(List<Long> values) {
            addCriterion("city_id in", values, "city_id");
            return (Criteria) this;
        }

        public Criteria andCity_idNotIn(List<Long> values) {
            addCriterion("city_id not in", values, "city_id");
            return (Criteria) this;
        }

        public Criteria andCity_idBetween(Long value1, Long value2) {
            addCriterion("city_id between", value1, value2, "city_id");
            return (Criteria) this;
        }

        public Criteria andCity_idNotBetween(Long value1, Long value2) {
            addCriterion("city_id not between", value1, value2, "city_id");
            return (Criteria) this;
        }

        public Criteria andCounty_idIsNull() {
            addCriterion("county_id is null");
            return (Criteria) this;
        }

        public Criteria andCounty_idIsNotNull() {
            addCriterion("county_id is not null");
            return (Criteria) this;
        }

        public Criteria andCounty_idEqualTo(Long value) {
            addCriterion("county_id =", value, "county_id");
            return (Criteria) this;
        }

        public Criteria andCounty_idNotEqualTo(Long value) {
            addCriterion("county_id <>", value, "county_id");
            return (Criteria) this;
        }

        public Criteria andCounty_idGreaterThan(Long value) {
            addCriterion("county_id >", value, "county_id");
            return (Criteria) this;
        }

        public Criteria andCounty_idGreaterThanOrEqualTo(Long value) {
            addCriterion("county_id >=", value, "county_id");
            return (Criteria) this;
        }

        public Criteria andCounty_idLessThan(Long value) {
            addCriterion("county_id <", value, "county_id");
            return (Criteria) this;
        }

        public Criteria andCounty_idLessThanOrEqualTo(Long value) {
            addCriterion("county_id <=", value, "county_id");
            return (Criteria) this;
        }

        public Criteria andCounty_idIn(List<Long> values) {
            addCriterion("county_id in", values, "county_id");
            return (Criteria) this;
        }

        public Criteria andCounty_idNotIn(List<Long> values) {
            addCriterion("county_id not in", values, "county_id");
            return (Criteria) this;
        }

        public Criteria andCounty_idBetween(Long value1, Long value2) {
            addCriterion("county_id between", value1, value2, "county_id");
            return (Criteria) this;
        }

        public Criteria andCounty_idNotBetween(Long value1, Long value2) {
            addCriterion("county_id not between", value1, value2, "county_id");
            return (Criteria) this;
        }

        public Criteria andTown_idIsNull() {
            addCriterion("town_id is null");
            return (Criteria) this;
        }

        public Criteria andTown_idIsNotNull() {
            addCriterion("town_id is not null");
            return (Criteria) this;
        }

        public Criteria andTown_idEqualTo(Long value) {
            addCriterion("town_id =", value, "town_id");
            return (Criteria) this;
        }

        public Criteria andTown_idNotEqualTo(Long value) {
            addCriterion("town_id <>", value, "town_id");
            return (Criteria) this;
        }

        public Criteria andTown_idGreaterThan(Long value) {
            addCriterion("town_id >", value, "town_id");
            return (Criteria) this;
        }

        public Criteria andTown_idGreaterThanOrEqualTo(Long value) {
            addCriterion("town_id >=", value, "town_id");
            return (Criteria) this;
        }

        public Criteria andTown_idLessThan(Long value) {
            addCriterion("town_id <", value, "town_id");
            return (Criteria) this;
        }

        public Criteria andTown_idLessThanOrEqualTo(Long value) {
            addCriterion("town_id <=", value, "town_id");
            return (Criteria) this;
        }

        public Criteria andTown_idIn(List<Long> values) {
            addCriterion("town_id in", values, "town_id");
            return (Criteria) this;
        }

        public Criteria andTown_idNotIn(List<Long> values) {
            addCriterion("town_id not in", values, "town_id");
            return (Criteria) this;
        }

        public Criteria andTown_idBetween(Long value1, Long value2) {
            addCriterion("town_id between", value1, value2, "town_id");
            return (Criteria) this;
        }

        public Criteria andTown_idNotBetween(Long value1, Long value2) {
            addCriterion("town_id not between", value1, value2, "town_id");
            return (Criteria) this;
        }

        public Criteria andOrg_idIsNull() {
            addCriterion("org_id is null");
            return (Criteria) this;
        }

        public Criteria andOrg_idIsNotNull() {
            addCriterion("org_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrg_idEqualTo(String value) {
            addCriterion("org_id =", value, "org_id");
            return (Criteria) this;
        }

        public Criteria andOrg_idNotEqualTo(String value) {
            addCriterion("org_id <>", value, "org_id");
            return (Criteria) this;
        }

        public Criteria andOrg_idGreaterThan(String value) {
            addCriterion("org_id >", value, "org_id");
            return (Criteria) this;
        }

        public Criteria andOrg_idGreaterThanOrEqualTo(String value) {
            addCriterion("org_id >=", value, "org_id");
            return (Criteria) this;
        }

        public Criteria andOrg_idLessThan(String value) {
            addCriterion("org_id <", value, "org_id");
            return (Criteria) this;
        }

        public Criteria andOrg_idLessThanOrEqualTo(String value) {
            addCriterion("org_id <=", value, "org_id");
            return (Criteria) this;
        }

        public Criteria andOrg_idLike(String value) {
            addCriterion("org_id like", value, "org_id");
            return (Criteria) this;
        }

        public Criteria andOrg_idNotLike(String value) {
            addCriterion("org_id not like", value, "org_id");
            return (Criteria) this;
        }

        public Criteria andOrg_idIn(List<String> values) {
            addCriterion("org_id in", values, "org_id");
            return (Criteria) this;
        }

        public Criteria andOrg_idNotIn(List<String> values) {
            addCriterion("org_id not in", values, "org_id");
            return (Criteria) this;
        }

        public Criteria andOrg_idBetween(String value1, String value2) {
            addCriterion("org_id between", value1, value2, "org_id");
            return (Criteria) this;
        }

        public Criteria andOrg_idNotBetween(String value1, String value2) {
            addCriterion("org_id not between", value1, value2, "org_id");
            return (Criteria) this;
        }

        public Criteria andCreate_byIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreate_byIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_byEqualTo(String value) {
            addCriterion("create_by =", value, "create_by");
            return (Criteria) this;
        }

        public Criteria andCreate_byNotEqualTo(String value) {
            addCriterion("create_by <>", value, "create_by");
            return (Criteria) this;
        }

        public Criteria andCreate_byGreaterThan(String value) {
            addCriterion("create_by >", value, "create_by");
            return (Criteria) this;
        }

        public Criteria andCreate_byGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "create_by");
            return (Criteria) this;
        }

        public Criteria andCreate_byLessThan(String value) {
            addCriterion("create_by <", value, "create_by");
            return (Criteria) this;
        }

        public Criteria andCreate_byLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "create_by");
            return (Criteria) this;
        }

        public Criteria andCreate_byLike(String value) {
            addCriterion("create_by like", value, "create_by");
            return (Criteria) this;
        }

        public Criteria andCreate_byNotLike(String value) {
            addCriterion("create_by not like", value, "create_by");
            return (Criteria) this;
        }

        public Criteria andCreate_byIn(List<String> values) {
            addCriterion("create_by in", values, "create_by");
            return (Criteria) this;
        }

        public Criteria andCreate_byNotIn(List<String> values) {
            addCriterion("create_by not in", values, "create_by");
            return (Criteria) this;
        }

        public Criteria andCreate_byBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "create_by");
            return (Criteria) this;
        }

        public Criteria andCreate_byNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "create_by");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeEqualTo(Date value) {
            addCriterion("create_time =", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThan(Date value) {
            addCriterion("create_time >", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThan(Date value) {
            addCriterion("create_time <", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIn(List<Date> values) {
            addCriterion("create_time in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_byIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdate_byIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdate_byEqualTo(String value) {
            addCriterion("update_by =", value, "update_by");
            return (Criteria) this;
        }

        public Criteria andUpdate_byNotEqualTo(String value) {
            addCriterion("update_by <>", value, "update_by");
            return (Criteria) this;
        }

        public Criteria andUpdate_byGreaterThan(String value) {
            addCriterion("update_by >", value, "update_by");
            return (Criteria) this;
        }

        public Criteria andUpdate_byGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "update_by");
            return (Criteria) this;
        }

        public Criteria andUpdate_byLessThan(String value) {
            addCriterion("update_by <", value, "update_by");
            return (Criteria) this;
        }

        public Criteria andUpdate_byLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "update_by");
            return (Criteria) this;
        }

        public Criteria andUpdate_byLike(String value) {
            addCriterion("update_by like", value, "update_by");
            return (Criteria) this;
        }

        public Criteria andUpdate_byNotLike(String value) {
            addCriterion("update_by not like", value, "update_by");
            return (Criteria) this;
        }

        public Criteria andUpdate_byIn(List<String> values) {
            addCriterion("update_by in", values, "update_by");
            return (Criteria) this;
        }

        public Criteria andUpdate_byNotIn(List<String> values) {
            addCriterion("update_by not in", values, "update_by");
            return (Criteria) this;
        }

        public Criteria andUpdate_byBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "update_by");
            return (Criteria) this;
        }

        public Criteria andUpdate_byNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "update_by");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeEqualTo(Date value) {
            addCriterion("update_time =", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeGreaterThan(Date value) {
            addCriterion("update_time >", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeLessThan(Date value) {
            addCriterion("update_time <", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeIn(List<Date> values) {
            addCriterion("update_time in", values, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "update_time");
            return (Criteria) this;
        }

        public Criteria andDel_flagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDel_flagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDel_flagEqualTo(Byte value) {
            addCriterion("del_flag =", value, "del_flag");
            return (Criteria) this;
        }

        public Criteria andDel_flagNotEqualTo(Byte value) {
            addCriterion("del_flag <>", value, "del_flag");
            return (Criteria) this;
        }

        public Criteria andDel_flagGreaterThan(Byte value) {
            addCriterion("del_flag >", value, "del_flag");
            return (Criteria) this;
        }

        public Criteria andDel_flagGreaterThanOrEqualTo(Byte value) {
            addCriterion("del_flag >=", value, "del_flag");
            return (Criteria) this;
        }

        public Criteria andDel_flagLessThan(Byte value) {
            addCriterion("del_flag <", value, "del_flag");
            return (Criteria) this;
        }

        public Criteria andDel_flagLessThanOrEqualTo(Byte value) {
            addCriterion("del_flag <=", value, "del_flag");
            return (Criteria) this;
        }

        public Criteria andDel_flagIn(List<Byte> values) {
            addCriterion("del_flag in", values, "del_flag");
            return (Criteria) this;
        }

        public Criteria andDel_flagNotIn(List<Byte> values) {
            addCriterion("del_flag not in", values, "del_flag");
            return (Criteria) this;
        }

        public Criteria andDel_flagBetween(Byte value1, Byte value2) {
            addCriterion("del_flag between", value1, value2, "del_flag");
            return (Criteria) this;
        }

        public Criteria andDel_flagNotBetween(Byte value1, Byte value2) {
            addCriterion("del_flag not between", value1, value2, "del_flag");
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