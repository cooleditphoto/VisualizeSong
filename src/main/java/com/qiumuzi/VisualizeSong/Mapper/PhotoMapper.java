package com.qiumuzi.VisualizeSong.Mapper;

import com.qiumuzi.VisualizeSong.Model.Photo;
import com.qiumuzi.VisualizeSong.Model.PhotoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PhotoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Photo
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    long countByExample(PhotoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Photo
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    int deleteByExample(PhotoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Photo
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Photo
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    int insert(Photo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Photo
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    int insertSelective(Photo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Photo
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    List<Photo> selectByExample(PhotoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Photo
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    Photo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Photo
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    int updateByExampleSelective(@Param("record") Photo record, @Param("example") PhotoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Photo
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    int updateByExample(@Param("record") Photo record, @Param("example") PhotoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Photo
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    int updateByPrimaryKeySelective(Photo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Photo
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    int updateByPrimaryKey(Photo record);
}