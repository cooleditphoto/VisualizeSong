package com.qiumuzi.VisualizeSong.Controller;

import com.qiumuzi.VisualizeSong.Model.Photo;
import com.qiumuzi.VisualizeSong.Service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class PhotoController {
    @Autowired
    private PhotoService photoService;

    @GetMapping
    public List<Photo> getUploadedPhotoList(Long userId) {
      return photoService.getUploadedPhotoList(userId);
    }
}
