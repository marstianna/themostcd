package com.cd.dao;


import com.cd.domain.Match;

public interface MatchDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table matches
     *
     * @mbggenerated Sat Jan 31 12:40:45 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table matches
     *
     * @mbggenerated Sat Jan 31 12:40:45 CST 2015
     */
    int insert(Match record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table matches
     *
     * @mbggenerated Sat Jan 31 12:40:45 CST 2015
     */
    int insertSelective(Match record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table matches
     *
     * @mbggenerated Sat Jan 31 12:40:45 CST 2015
     */
    Match selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table matches
     *
     * @mbggenerated Sat Jan 31 12:40:45 CST 2015
     */
    int updateByPrimaryKeySelective(Match record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table matches
     *
     * @mbggenerated Sat Jan 31 12:40:45 CST 2015
     */
    int updateByPrimaryKeyWithBLOBs(Match record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table matches
     *
     * @mbggenerated Sat Jan 31 12:40:45 CST 2015
     */
    int updateByPrimaryKey(Match record);
}