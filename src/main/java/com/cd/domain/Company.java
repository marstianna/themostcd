package com.cd.domain;

public class Company {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.id
     *
     * @mbggenerated Sat Jan 31 12:40:45 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.name
     *
     * @mbggenerated Sat Jan 31 12:40:45 CST 2015
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.continent
     *
     * @mbggenerated Sat Jan 31 12:40:45 CST 2015
     */
    private String continent;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.id
     *
     * @return the value of company.id
     *
     * @mbggenerated Sat Jan 31 12:40:45 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.id
     *
     * @param id the value for company.id
     *
     * @mbggenerated Sat Jan 31 12:40:45 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.name
     *
     * @return the value of company.name
     *
     * @mbggenerated Sat Jan 31 12:40:45 CST 2015
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.name
     *
     * @param name the value for company.name
     *
     * @mbggenerated Sat Jan 31 12:40:45 CST 2015
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.continent
     *
     * @return the value of company.continent
     *
     * @mbggenerated Sat Jan 31 12:40:45 CST 2015
     */
    public String getContinent() {
        return continent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.continent
     *
     * @param continent the value for company.continent
     *
     * @mbggenerated Sat Jan 31 12:40:45 CST 2015
     */
    public void setContinent(String continent) {
        this.continent = continent == null ? null : continent.trim();
    }
}