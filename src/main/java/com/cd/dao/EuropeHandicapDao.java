package com.cd.dao;


import com.cd.domain.EuropeHandicap;

public interface EuropeHandicapDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table europe_handicap
     *
     * @mbggenerated Sat Jan 31 12:40:45 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table europe_handicap
     *
     * @mbggenerated Sat Jan 31 12:40:45 CST 2015
     */
    int insert(EuropeHandicap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table europe_handicap
     *
     * @mbggenerated Sat Jan 31 12:40:45 CST 2015
     */
    int insertSelective(EuropeHandicap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table europe_handicap
     *
     * @mbggenerated Sat Jan 31 12:40:45 CST 2015
     */
    EuropeHandicap selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table europe_handicap
     *
     * @mbggenerated Sat Jan 31 12:40:45 CST 2015
     */
    int updateByPrimaryKeySelective(EuropeHandicap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table europe_handicap
     *
     * @mbggenerated Sat Jan 31 12:40:45 CST 2015
     */
    int updateByPrimaryKey(EuropeHandicap record);
}