package com.cd.dao;


import com.cd.domain.Company;

public interface CompanyDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company
     *
     * @mbggenerated Sat Jan 31 12:40:45 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company
     *
     * @mbggenerated Sat Jan 31 12:40:45 CST 2015
     */
    int insert(Company record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company
     *
     * @mbggenerated Sat Jan 31 12:40:45 CST 2015
     */
    int insertSelective(Company record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company
     *
     * @mbggenerated Sat Jan 31 12:40:45 CST 2015
     */
    Company selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company
     *
     * @mbggenerated Sat Jan 31 12:40:45 CST 2015
     */
    int updateByPrimaryKeySelective(Company record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company
     *
     * @mbggenerated Sat Jan 31 12:40:45 CST 2015
     */
    int updateByPrimaryKey(Company record);
}