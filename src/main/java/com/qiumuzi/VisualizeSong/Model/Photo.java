package com.qiumuzi.VisualizeSong.Model;

public class Photo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Photo.id
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Photo.userId
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    private Long userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Photo.pathUrl
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    private String pathurl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Photo.tags
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    private String tags;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Photo.sensitivity
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    private Double sensitivity;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Photo.id
     *
     * @return the value of Photo.id
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Photo.id
     *
     * @param id the value for Photo.id
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Photo.userId
     *
     * @return the value of Photo.userId
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Photo.userId
     *
     * @param userid the value for Photo.userId
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Photo.pathUrl
     *
     * @return the value of Photo.pathUrl
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    public String getPathurl() {
        return pathurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Photo.pathUrl
     *
     * @param pathurl the value for Photo.pathUrl
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    public void setPathurl(String pathurl) {
        this.pathurl = pathurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Photo.tags
     *
     * @return the value of Photo.tags
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    public String getTags() {
        return tags;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Photo.tags
     *
     * @param tags the value for Photo.tags
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    public void setTags(String tags) {
        this.tags = tags;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Photo.sensitivity
     *
     * @return the value of Photo.sensitivity
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    public Double getSensitivity() {
        return sensitivity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Photo.sensitivity
     *
     * @param sensitivity the value for Photo.sensitivity
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    public void setSensitivity(Double sensitivity) {
        this.sensitivity = sensitivity;
    }
}