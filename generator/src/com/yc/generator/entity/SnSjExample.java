package com.yc.generator.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SnSjExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SnSjExample() {
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

        public Criteria andCommodityNameIsNull() {
            addCriterion("commodity_name is null");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIsNotNull() {
            addCriterion("commodity_name is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityNameEqualTo(String value) {
            addCriterion("commodity_name =", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotEqualTo(String value) {
            addCriterion("commodity_name <>", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameGreaterThan(String value) {
            addCriterion("commodity_name >", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_name >=", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLessThan(String value) {
            addCriterion("commodity_name <", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLessThanOrEqualTo(String value) {
            addCriterion("commodity_name <=", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLike(String value) {
            addCriterion("commodity_name like", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotLike(String value) {
            addCriterion("commodity_name not like", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIn(List<String> values) {
            addCriterion("commodity_name in", values, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotIn(List<String> values) {
            addCriterion("commodity_name not in", values, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameBetween(String value1, String value2) {
            addCriterion("commodity_name between", value1, value2, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotBetween(String value1, String value2) {
            addCriterion("commodity_name not between", value1, value2, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceIsNull() {
            addCriterion("commodity_price is null");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceIsNotNull() {
            addCriterion("commodity_price is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceEqualTo(String value) {
            addCriterion("commodity_price =", value, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceNotEqualTo(String value) {
            addCriterion("commodity_price <>", value, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceGreaterThan(String value) {
            addCriterion("commodity_price >", value, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_price >=", value, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceLessThan(String value) {
            addCriterion("commodity_price <", value, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceLessThanOrEqualTo(String value) {
            addCriterion("commodity_price <=", value, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceLike(String value) {
            addCriterion("commodity_price like", value, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceNotLike(String value) {
            addCriterion("commodity_price not like", value, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceIn(List<String> values) {
            addCriterion("commodity_price in", values, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceNotIn(List<String> values) {
            addCriterion("commodity_price not in", values, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceBetween(String value1, String value2) {
            addCriterion("commodity_price between", value1, value2, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceNotBetween(String value1, String value2) {
            addCriterion("commodity_price not between", value1, value2, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityUrlIsNull() {
            addCriterion("commodity_url is null");
            return (Criteria) this;
        }

        public Criteria andCommodityUrlIsNotNull() {
            addCriterion("commodity_url is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityUrlEqualTo(String value) {
            addCriterion("commodity_url =", value, "commodityUrl");
            return (Criteria) this;
        }

        public Criteria andCommodityUrlNotEqualTo(String value) {
            addCriterion("commodity_url <>", value, "commodityUrl");
            return (Criteria) this;
        }

        public Criteria andCommodityUrlGreaterThan(String value) {
            addCriterion("commodity_url >", value, "commodityUrl");
            return (Criteria) this;
        }

        public Criteria andCommodityUrlGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_url >=", value, "commodityUrl");
            return (Criteria) this;
        }

        public Criteria andCommodityUrlLessThan(String value) {
            addCriterion("commodity_url <", value, "commodityUrl");
            return (Criteria) this;
        }

        public Criteria andCommodityUrlLessThanOrEqualTo(String value) {
            addCriterion("commodity_url <=", value, "commodityUrl");
            return (Criteria) this;
        }

        public Criteria andCommodityUrlLike(String value) {
            addCriterion("commodity_url like", value, "commodityUrl");
            return (Criteria) this;
        }

        public Criteria andCommodityUrlNotLike(String value) {
            addCriterion("commodity_url not like", value, "commodityUrl");
            return (Criteria) this;
        }

        public Criteria andCommodityUrlIn(List<String> values) {
            addCriterion("commodity_url in", values, "commodityUrl");
            return (Criteria) this;
        }

        public Criteria andCommodityUrlNotIn(List<String> values) {
            addCriterion("commodity_url not in", values, "commodityUrl");
            return (Criteria) this;
        }

        public Criteria andCommodityUrlBetween(String value1, String value2) {
            addCriterion("commodity_url between", value1, value2, "commodityUrl");
            return (Criteria) this;
        }

        public Criteria andCommodityUrlNotBetween(String value1, String value2) {
            addCriterion("commodity_url not between", value1, value2, "commodityUrl");
            return (Criteria) this;
        }

        public Criteria andCommodityShopIsNull() {
            addCriterion("commodity_shop is null");
            return (Criteria) this;
        }

        public Criteria andCommodityShopIsNotNull() {
            addCriterion("commodity_shop is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityShopEqualTo(String value) {
            addCriterion("commodity_shop =", value, "commodityShop");
            return (Criteria) this;
        }

        public Criteria andCommodityShopNotEqualTo(String value) {
            addCriterion("commodity_shop <>", value, "commodityShop");
            return (Criteria) this;
        }

        public Criteria andCommodityShopGreaterThan(String value) {
            addCriterion("commodity_shop >", value, "commodityShop");
            return (Criteria) this;
        }

        public Criteria andCommodityShopGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_shop >=", value, "commodityShop");
            return (Criteria) this;
        }

        public Criteria andCommodityShopLessThan(String value) {
            addCriterion("commodity_shop <", value, "commodityShop");
            return (Criteria) this;
        }

        public Criteria andCommodityShopLessThanOrEqualTo(String value) {
            addCriterion("commodity_shop <=", value, "commodityShop");
            return (Criteria) this;
        }

        public Criteria andCommodityShopLike(String value) {
            addCriterion("commodity_shop like", value, "commodityShop");
            return (Criteria) this;
        }

        public Criteria andCommodityShopNotLike(String value) {
            addCriterion("commodity_shop not like", value, "commodityShop");
            return (Criteria) this;
        }

        public Criteria andCommodityShopIn(List<String> values) {
            addCriterion("commodity_shop in", values, "commodityShop");
            return (Criteria) this;
        }

        public Criteria andCommodityShopNotIn(List<String> values) {
            addCriterion("commodity_shop not in", values, "commodityShop");
            return (Criteria) this;
        }

        public Criteria andCommodityShopBetween(String value1, String value2) {
            addCriterion("commodity_shop between", value1, value2, "commodityShop");
            return (Criteria) this;
        }

        public Criteria andCommodityShopNotBetween(String value1, String value2) {
            addCriterion("commodity_shop not between", value1, value2, "commodityShop");
            return (Criteria) this;
        }

        public Criteria andCommodityImgUrlIsNull() {
            addCriterion("commodity_img_url is null");
            return (Criteria) this;
        }

        public Criteria andCommodityImgUrlIsNotNull() {
            addCriterion("commodity_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityImgUrlEqualTo(String value) {
            addCriterion("commodity_img_url =", value, "commodityImgUrl");
            return (Criteria) this;
        }

        public Criteria andCommodityImgUrlNotEqualTo(String value) {
            addCriterion("commodity_img_url <>", value, "commodityImgUrl");
            return (Criteria) this;
        }

        public Criteria andCommodityImgUrlGreaterThan(String value) {
            addCriterion("commodity_img_url >", value, "commodityImgUrl");
            return (Criteria) this;
        }

        public Criteria andCommodityImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_img_url >=", value, "commodityImgUrl");
            return (Criteria) this;
        }

        public Criteria andCommodityImgUrlLessThan(String value) {
            addCriterion("commodity_img_url <", value, "commodityImgUrl");
            return (Criteria) this;
        }

        public Criteria andCommodityImgUrlLessThanOrEqualTo(String value) {
            addCriterion("commodity_img_url <=", value, "commodityImgUrl");
            return (Criteria) this;
        }

        public Criteria andCommodityImgUrlLike(String value) {
            addCriterion("commodity_img_url like", value, "commodityImgUrl");
            return (Criteria) this;
        }

        public Criteria andCommodityImgUrlNotLike(String value) {
            addCriterion("commodity_img_url not like", value, "commodityImgUrl");
            return (Criteria) this;
        }

        public Criteria andCommodityImgUrlIn(List<String> values) {
            addCriterion("commodity_img_url in", values, "commodityImgUrl");
            return (Criteria) this;
        }

        public Criteria andCommodityImgUrlNotIn(List<String> values) {
            addCriterion("commodity_img_url not in", values, "commodityImgUrl");
            return (Criteria) this;
        }

        public Criteria andCommodityImgUrlBetween(String value1, String value2) {
            addCriterion("commodity_img_url between", value1, value2, "commodityImgUrl");
            return (Criteria) this;
        }

        public Criteria andCommodityImgUrlNotBetween(String value1, String value2) {
            addCriterion("commodity_img_url not between", value1, value2, "commodityImgUrl");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
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