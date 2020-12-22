package com.example.hongxing.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.hongxing.dto.PChildWebEntityEx;
import com.example.hongxing.entity.PChildWebEntity;

import java.util.List;

public interface PChildWebService extends IService<PChildWebEntity> {

    List<PChildWebEntity> getSiteDtoAll(Integer topicId, String topicName);

    List<PChildWebEntityEx> getSiteAll(Integer topicId, String topicName);

}
