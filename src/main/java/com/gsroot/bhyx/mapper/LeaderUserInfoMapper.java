package com.gsroot.bhyx.mapper;

import com.gsroot.bhyx.model.LeaderUserInfo;

public interface LeaderUserInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table leader_user_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String leaderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table leader_user_info
     *
     * @mbggenerated
     */
    int insert(LeaderUserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table leader_user_info
     *
     * @mbggenerated
     */
    int insertSelective(LeaderUserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table leader_user_info
     *
     * @mbggenerated
     */
    LeaderUserInfo selectByPrimaryKey(String leaderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table leader_user_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(LeaderUserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table leader_user_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(LeaderUserInfo record);
}