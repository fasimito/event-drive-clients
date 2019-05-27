package com.events.mapper;

import com.events.domain.ShortUrlBase;

public interface ShortUrlBaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shorturlbase
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shorturlbase
     *
     * @mbggenerated
     */
    int insert(ShortUrlBase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shorturlbase
     *
     * @mbggenerated
     */
    int insertSelective(ShortUrlBase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shorturlbase
     *
     * @mbggenerated
     */
    ShortUrlBase selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shorturlbase
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ShortUrlBase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shorturlbase
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ShortUrlBase record);

    ShortUrlBase selectByShortKey(String shortKey);
}