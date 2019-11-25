package com.example.test.controller;

import com.example.test.service.FileUploadService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author: LiuTaoYi
 * @create_time: 2019-11-24 20:59
 * @description:
 **/
@RestController
@Api(tags = "文件上传")
@RequestMapping(value = "/upload")
public class FileUploadController {

    @Autowired
    FileUploadService uploadService;

    @PostMapping(value = "upload")
    public String upload(@RequestParam("file") MultipartFile file) {
        return uploadService.upload(file);
    }
}
