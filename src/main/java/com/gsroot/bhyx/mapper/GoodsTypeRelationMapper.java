package com.gsroot.bhyx.mapper;

import com.gsroot.bhyx.model.GoodsTypeRelation;

public interface GoodsTypeRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_type_relation
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_type_relation
     *
     * @mbggenerated
     */
    int insert(GoodsTypeRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_type_relation
     *
     * @mbggenerated
     */
    int insertSelective(GoodsTypeRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_type_relation
     *
     * @mbggenerated
     */
    GoodsTypeRelation selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_type_relation
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(GoodsTypeRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_type_relation
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(GoodsTypeRelation record);
}