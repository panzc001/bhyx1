package com.gsroot.bhyx.model;

public class OrderInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.order_id
     *
     * @mbggenerated
     */
    private String orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.user_id
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.leader_id
     *
     * @mbggenerated
     */
    private String leaderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.order_price
     *
     * @mbggenerated
     */
    private Long orderPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.order_balance
     *
     * @mbggenerated
     */
    private Long orderBalance;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.leader_balance
     *
     * @mbggenerated
     */
    private Long leaderBalance;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.order_time
     *
     * @mbggenerated
     */
    private String orderTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.pay_time
     *
     * @mbggenerated
     */
    private String payTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.order_state
     *
     * @mbggenerated
     */
    private String orderState;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.order_id
     *
     * @return the value of order_info.order_id
     *
     * @mbggenerated
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.order_id
     *
     * @param orderId the value for order_info.order_id
     *
     * @mbggenerated
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.user_id
     *
     * @return the value of order_info.user_id
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.user_id
     *
     * @param userId the value for order_info.user_id
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.leader_id
     *
     * @return the value of order_info.leader_id
     *
     * @mbggenerated
     */
    public String getLeaderId() {
        return leaderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.leader_id
     *
     * @param leaderId the value for order_info.leader_id
     *
     * @mbggenerated
     */
    public void setLeaderId(String leaderId) {
        this.leaderId = leaderId == null ? null : leaderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.order_price
     *
     * @return the value of order_info.order_price
     *
     * @mbggenerated
     */
    public Long getOrderPrice() {
        return orderPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.order_price
     *
     * @param orderPrice the value for order_info.order_price
     *
     * @mbggenerated
     */
    public void setOrderPrice(Long orderPrice) {
        this.orderPrice = orderPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.order_balance
     *
     * @return the value of order_info.order_balance
     *
     * @mbggenerated
     */
    public Long getOrderBalance() {
        return orderBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.order_balance
     *
     * @param orderBalance the value for order_info.order_balance
     *
     * @mbggenerated
     */
    public void setOrderBalance(Long orderBalance) {
        this.orderBalance = orderBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.leader_balance
     *
     * @return the value of order_info.leader_balance
     *
     * @mbggenerated
     */
    public Long getLeaderBalance() {
        return leaderBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.leader_balance
     *
     * @param leaderBalance the value for order_info.leader_balance
     *
     * @mbggenerated
     */
    public void setLeaderBalance(Long leaderBalance) {
        this.leaderBalance = leaderBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.order_time
     *
     * @return the value of order_info.order_time
     *
     * @mbggenerated
     */
    public String getOrderTime() {
        return orderTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.order_time
     *
     * @param orderTime the value for order_info.order_time
     *
     * @mbggenerated
     */
    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime == null ? null : orderTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.pay_time
     *
     * @return the value of order_info.pay_time
     *
     * @mbggenerated
     */
    public String getPayTime() {
        return payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.pay_time
     *
     * @param payTime the value for order_info.pay_time
     *
     * @mbggenerated
     */
    public void setPayTime(String payTime) {
        this.payTime = payTime == null ? null : payTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.order_state
     *
     * @return the value of order_info.order_state
     *
     * @mbggenerated
     */
    public String getOrderState() {
        return orderState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.order_state
     *
     * @param orderState the value for order_info.order_state
     *
     * @mbggenerated
     */
    public void setOrderState(String orderState) {
        this.orderState = orderState == null ? null : orderState.trim();
    }
}