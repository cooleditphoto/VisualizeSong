package com.qiumuzi.VisualizeSong.Service;

import org.springframework.web.multipart.MultipartFile;

public interface FileStorageService {

 public String store(MultipartFile file);
}
