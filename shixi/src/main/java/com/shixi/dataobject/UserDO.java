package com.shixi.dataobject;

public class UserDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.id
     *
     * @mbg.generated Thu Jun 06 18:19:39 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.name
     *
     * @mbg.generated Thu Jun 06 18:19:39 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.sex
     *
     * @mbg.generated Thu Jun 06 18:19:39 CST 2019
     */
    private Integer sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.age
     *
     * @mbg.generated Thu Jun 06 18:19:39 CST 2019
     */
    private Integer age;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.telephone
     *
     * @mbg.generated Thu Jun 06 18:19:39 CST 2019
     */
    private String telephone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.register_mode
     *
     * @mbg.generated Thu Jun 06 18:19:39 CST 2019
     */
    private String registerMode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.thirdparty_id
     *
     * @mbg.generated Thu Jun 06 18:19:39 CST 2019
     */
    private Integer thirdpartyId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.id
     *
     * @return the value of user_info.id
     *
     * @mbg.generated Thu Jun 06 18:19:39 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.id
     *
     * @param id the value for user_info.id
     *
     * @mbg.generated Thu Jun 06 18:19:39 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.name
     *
     * @return the value of user_info.name
     *
     * @mbg.generated Thu Jun 06 18:19:39 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.name
     *
     * @param name the value for user_info.name
     *
     * @mbg.generated Thu Jun 06 18:19:39 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.sex
     *
     * @return the value of user_info.sex
     *
     * @mbg.generated Thu Jun 06 18:19:39 CST 2019
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.sex
     *
     * @param sex the value for user_info.sex
     *
     * @mbg.generated Thu Jun 06 18:19:39 CST 2019
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.age
     *
     * @return the value of user_info.age
     *
     * @mbg.generated Thu Jun 06 18:19:39 CST 2019
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.age
     *
     * @param age the value for user_info.age
     *
     * @mbg.generated Thu Jun 06 18:19:39 CST 2019
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.telephone
     *
     * @return the value of user_info.telephone
     *
     * @mbg.generated Thu Jun 06 18:19:39 CST 2019
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.telephone
     *
     * @param telephone the value for user_info.telephone
     *
     * @mbg.generated Thu Jun 06 18:19:39 CST 2019
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.register_mode
     *
     * @return the value of user_info.register_mode
     *
     * @mbg.generated Thu Jun 06 18:19:39 CST 2019
     */
    public String getRegisterMode() {
        return registerMode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.register_mode
     *
     * @param registerMode the value for user_info.register_mode
     *
     * @mbg.generated Thu Jun 06 18:19:39 CST 2019
     */
    public void setRegisterMode(String registerMode) {
        this.registerMode = registerMode == null ? null : registerMode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.thirdparty_id
     *
     * @return the value of user_info.thirdparty_id
     *
     * @mbg.generated Thu Jun 06 18:19:39 CST 2019
     */
    public Integer getThirdpartyId() {
        return thirdpartyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.thirdparty_id
     *
     * @param thirdpartyId the value for user_info.thirdparty_id
     *
     * @mbg.generated Thu Jun 06 18:19:39 CST 2019
     */
    public void setThirdpartyId(Integer thirdpartyId) {
        this.thirdpartyId = thirdpartyId;
    }
}