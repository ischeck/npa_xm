package com.zkpt.data.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class GasUserBehavior implements Serializable {
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * mid_gas_user_behavior.ID
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * mid_gas_user_behavior.OPERTION_ID
     *
     * @mbggenerated
     */
    private Integer opertionId;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * mid_gas_user_behavior.BANK_DEVICE_ID
     *
     * @mbggenerated
     */
    private Integer bankDeviceId;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * mid_gas_user_behavior.USER_NO
     *
     * @mbggenerated
     */
    private String userNo;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * mid_gas_user_behavior.VALUE1
     *
     * @mbggenerated
     */
    private BigDecimal value1;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * mid_gas_user_behavior.VALUE2
     *
     * @mbggenerated
     */
    private BigDecimal value2;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * mid_gas_user_behavior.VALUE3
     *
     * @mbggenerated
     */
    private String value3;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * mid_gas_user_behavior.CREATE_BY
     *
     * @mbggenerated
     */
    private String createBy;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * mid_gas_user_behavior.CREATE_DATE
     *
     * @mbggenerated
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * mid_gas_user_behavior.UPDATE_BY
     *
     * @mbggenerated
     */
    private String updateBy;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * mid_gas_user_behavior.UPDATE_DATE
     *
     * @mbggenerated
     */
    private Date updateDate;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * mid_gas_user_behavior.DELFLAG
     *
     * @mbggenerated
     */
    private Short delflag;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * mid_gas_user_behavior.DEL_DATE
     *
     * @mbggenerated
     */
    private Date delDate;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table
     * mid_gas_user_behavior
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database
     * column mid_gas_user_behavior.ID
     *
     * @return the value of mid_gas_user_behavior.ID
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * mid_gas_user_behavior.ID
     *
     * @param id the value for mid_gas_user_behavior.ID
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database
     * column mid_gas_user_behavior.OPERTION_ID
     *
     * @return the value of mid_gas_user_behavior.OPERTION_ID
     *
     * @mbggenerated
     */
    public Integer getOpertionId() {
        return opertionId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * mid_gas_user_behavior.OPERTION_ID
     *
     * @param opertionId the value for mid_gas_user_behavior.OPERTION_ID
     *
     * @mbggenerated
     */
    public void setOpertionId(Integer opertionId) {
        this.opertionId = opertionId;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database
     * column mid_gas_user_behavior.BANK_DEVICE_ID
     *
     * @return the value of mid_gas_user_behavior.BANK_DEVICE_ID
     *
     * @mbggenerated
     */
    public Integer getBankDeviceId() {
        return bankDeviceId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * mid_gas_user_behavior.BANK_DEVICE_ID
     *
     * @param bankDeviceId the value for mid_gas_user_behavior.BANK_DEVICE_ID
     *
     * @mbggenerated
     */
    public void setBankDeviceId(Integer bankDeviceId) {
        this.bankDeviceId = bankDeviceId;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database
     * column mid_gas_user_behavior.USER_NO
     *
     * @return the value of mid_gas_user_behavior.USER_NO
     *
     * @mbggenerated
     */
    public String getUserNo() {
        return userNo;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * mid_gas_user_behavior.USER_NO
     *
     * @param userNo the value for mid_gas_user_behavior.USER_NO
     *
     * @mbggenerated
     */
    public void setUserNo(String userNo) {
        this.userNo = userNo == null ? null : userNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database
     * column mid_gas_user_behavior.VALUE1
     *
     * @return the value of mid_gas_user_behavior.VALUE1
     *
     * @mbggenerated
     */
    public BigDecimal getValue1() {
        return value1;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * mid_gas_user_behavior.VALUE1
     *
     * @param value1 the value for mid_gas_user_behavior.VALUE1
     *
     * @mbggenerated
     */
    public void setValue1(BigDecimal value1) {
        this.value1 = value1;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database
     * column mid_gas_user_behavior.VALUE2
     *
     * @return the value of mid_gas_user_behavior.VALUE2
     *
     * @mbggenerated
     */
    public BigDecimal getValue2() {
        return value2;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * mid_gas_user_behavior.VALUE2
     *
     * @param value2 the value for mid_gas_user_behavior.VALUE2
     *
     * @mbggenerated
     */
    public void setValue2(BigDecimal value2) {
        this.value2 = value2;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database
     * column mid_gas_user_behavior.VALUE3
     *
     * @return the value of mid_gas_user_behavior.VALUE3
     *
     * @mbggenerated
     */
    public String getValue3() {
        return value3;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * mid_gas_user_behavior.VALUE3
     *
     * @param value3 the value for mid_gas_user_behavior.VALUE3
     *
     * @mbggenerated
     */
    public void setValue3(String value3) {
        this.value3 = value3 == null ? null : value3.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database
     * column mid_gas_user_behavior.CREATE_BY
     *
     * @return the value of mid_gas_user_behavior.CREATE_BY
     *
     * @mbggenerated
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * mid_gas_user_behavior.CREATE_BY
     *
     * @param createBy the value for mid_gas_user_behavior.CREATE_BY
     *
     * @mbggenerated
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database
     * column mid_gas_user_behavior.CREATE_DATE
     *
     * @return the value of mid_gas_user_behavior.CREATE_DATE
     *
     * @mbggenerated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * mid_gas_user_behavior.CREATE_DATE
     *
     * @param createDate the value for mid_gas_user_behavior.CREATE_DATE
     *
     * @mbggenerated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database
     * column mid_gas_user_behavior.UPDATE_BY
     *
     * @return the value of mid_gas_user_behavior.UPDATE_BY
     *
     * @mbggenerated
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * mid_gas_user_behavior.UPDATE_BY
     *
     * @param updateBy the value for mid_gas_user_behavior.UPDATE_BY
     *
     * @mbggenerated
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database
     * column mid_gas_user_behavior.UPDATE_DATE
     *
     * @return the value of mid_gas_user_behavior.UPDATE_DATE
     *
     * @mbggenerated
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * mid_gas_user_behavior.UPDATE_DATE
     *
     * @param updateDate the value for mid_gas_user_behavior.UPDATE_DATE
     *
     * @mbggenerated
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database
     * column mid_gas_user_behavior.DELFLAG
     *
     * @return the value of mid_gas_user_behavior.DELFLAG
     *
     * @mbggenerated
     */
    public Short getDelflag() {
        return delflag;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * mid_gas_user_behavior.DELFLAG
     *
     * @param delflag the value for mid_gas_user_behavior.DELFLAG
     *
     * @mbggenerated
     */
    public void setDelflag(Short delflag) {
        this.delflag = delflag;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database
     * column mid_gas_user_behavior.DEL_DATE
     *
     * @return the value of mid_gas_user_behavior.DEL_DATE
     *
     * @mbggenerated
     */
    public Date getDelDate() {
        return delDate;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column
     * mid_gas_user_behavior.DEL_DATE
     *
     * @param delDate the value for mid_gas_user_behavior.DEL_DATE
     *
     * @mbggenerated
     */
    public void setDelDate(Date delDate) {
        this.delDate = delDate;
    }
}