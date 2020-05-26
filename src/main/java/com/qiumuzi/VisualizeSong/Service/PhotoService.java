package com.qiumuzi.VisualizeSong.Service;

import com.qiumuzi.VisualizeSong.Model.Photo;

import java.util.List;

public interface PhotoService {

    public List<Photo> getUploadedPhotoList(Long userId);
}
