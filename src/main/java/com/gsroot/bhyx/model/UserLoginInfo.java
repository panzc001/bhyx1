package com.gsroot.bhyx.model;

public class UserLoginInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_login_info.ul_id
     *
     * @mbggenerated
     */
    private String ulId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_login_info.create_time
     *
     * @mbggenerated
     */
    private String createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_login_info.ul_ip
     *
     * @mbggenerated
     */
    private String ulIp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_login_info.ul_terminal
     *
     * @mbggenerated
     */
    private String ulTerminal;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_login_info.ul_address
     *
     * @mbggenerated
     */
    private String ulAddress;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_login_info.ul_id
     *
     * @return the value of user_login_info.ul_id
     *
     * @mbggenerated
     */
    public String getUlId() {
        return ulId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_login_info.ul_id
     *
     * @param ulId the value for user_login_info.ul_id
     *
     * @mbggenerated
     */
    public void setUlId(String ulId) {
        this.ulId = ulId == null ? null : ulId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_login_info.create_time
     *
     * @return the value of user_login_info.create_time
     *
     * @mbggenerated
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_login_info.create_time
     *
     * @param createTime the value for user_login_info.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_login_info.ul_ip
     *
     * @return the value of user_login_info.ul_ip
     *
     * @mbggenerated
     */
    public String getUlIp() {
        return ulIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_login_info.ul_ip
     *
     * @param ulIp the value for user_login_info.ul_ip
     *
     * @mbggenerated
     */
    public void setUlIp(String ulIp) {
        this.ulIp = ulIp == null ? null : ulIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_login_info.ul_terminal
     *
     * @return the value of user_login_info.ul_terminal
     *
     * @mbggenerated
     */
    public String getUlTerminal() {
        return ulTerminal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_login_info.ul_terminal
     *
     * @param ulTerminal the value for user_login_info.ul_terminal
     *
     * @mbggenerated
     */
    public void setUlTerminal(String ulTerminal) {
        this.ulTerminal = ulTerminal == null ? null : ulTerminal.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_login_info.ul_address
     *
     * @return the value of user_login_info.ul_address
     *
     * @mbggenerated
     */
    public String getUlAddress() {
        return ulAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_login_info.ul_address
     *
     * @param ulAddress the value for user_login_info.ul_address
     *
     * @mbggenerated
     */
    public void setUlAddress(String ulAddress) {
        this.ulAddress = ulAddress == null ? null : ulAddress.trim();
    }
}