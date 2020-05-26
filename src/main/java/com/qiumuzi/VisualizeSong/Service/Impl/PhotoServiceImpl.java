package com.qiumuzi.VisualizeSong.Service.Impl;

import com.qiumuzi.VisualizeSong.Mapper.PhotoMapper;
import com.qiumuzi.VisualizeSong.Model.Photo;
import com.qiumuzi.VisualizeSong.Model.PhotoExample;

import javax.annotation.Resource;
import java.util.List;

public class PhotoServiceImpl {

    @Resource
    private PhotoMapper photoMapper;

    public List<Photo> getUploadedPhotoList(Long userId) {
        PhotoExample photoExample = new PhotoExample();
        PhotoExample.Criteria criteria = photoExample.createCriteria();
        criteria.andUseridEqualTo(userId);
        return photoMapper.selectByExample(photoExample);
    }
}
