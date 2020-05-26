package com.qiumuzi.VisualizeSong.Mapper;

import com.qiumuzi.VisualizeSong.Model.Song;
import com.qiumuzi.VisualizeSong.Model.SongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SongMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Song
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    long countByExample(SongExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Song
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    int deleteByExample(SongExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Song
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Song
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    int insert(Song record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Song
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    int insertSelective(Song record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Song
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    List<Song> selectByExample(SongExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Song
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    Song selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Song
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    int updateByExampleSelective(@Param("record") Song record, @Param("example") SongExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Song
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    int updateByExample(@Param("record") Song record, @Param("example") SongExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Song
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    int updateByPrimaryKeySelective(Song record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Song
     *
     * @mbg.generated Mon May 25 21:37:11 EDT 2020
     */
    int updateByPrimaryKey(Song record);
}