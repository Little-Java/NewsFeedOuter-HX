package com.example.hongxing.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.hongxing.dto.PChildWebEntityEx;
import com.example.hongxing.entity.PChildWebEntity;
import com.example.hongxing.entity.TopicEntity;
import com.example.hongxing.mapper.PChildWebMapper;
import com.example.hongxing.service.PChildWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PChildWebServiceImpl extends ServiceImpl<PChildWebMapper, PChildWebEntity> implements PChildWebService {

    @Autowired
    private PChildWebMapper pChildWebMapper;

    @Override
    public List<PChildWebEntity> getSiteDtoAll(Integer siteId, String siteName){
        return pChildWebMapper.querySiteList(siteId, siteName);
    }

    @Override
    public List<PChildWebEntityEx> getSiteAll(Integer siteId, String siteName){
        return pChildWebMapper.getSiteAll(siteId, siteName);
    }
}
