package com.qiumuzi.VisualizeSong.Model;

public class Song {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Song.id
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Song.name
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Song.userId
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    private Long userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Song.pathUrl
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    private String pathurl;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Song.id
     *
     * @return the value of Song.id
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Song.id
     *
     * @param id the value for Song.id
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Song.name
     *
     * @return the value of Song.name
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Song.name
     *
     * @param name the value for Song.name
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Song.userId
     *
     * @return the value of Song.userId
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Song.userId
     *
     * @param userid the value for Song.userId
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Song.pathUrl
     *
     * @return the value of Song.pathUrl
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    public String getPathurl() {
        return pathurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Song.pathUrl
     *
     * @param pathurl the value for Song.pathUrl
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    public void setPathurl(String pathurl) {
        this.pathurl = pathurl;
    }
}