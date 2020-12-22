package com.example.hongxing.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.hongxing.dto.PChildWebEntityEx;
import com.example.hongxing.entity.PChildWebEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface PChildWebMapper extends BaseMapper<PChildWebEntity> {

    List<PChildWebEntity> querySiteList(@Param("topicId") Integer topicId, @Param("topicName")String topicName);

    List<PChildWebEntityEx> getSiteAll(@Param("topicId") Integer topicId, @Param("topicName")String topicName);
}
