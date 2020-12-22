package com.example.hongxing.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.hongxing.dto.SubjectDto;
import com.example.hongxing.dto.TreeChidrenDto;
import com.example.hongxing.entity.PColumnEntity;
import com.example.hongxing.entity.SubjectEntity;

import java.util.List;

public interface PColumnService extends IService<PColumnEntity> {

    List<PColumnEntity> queryColumnListByChildWebId(String childWebId);

    List<TreeChidrenDto> getSubjectListById(String sbId);

    List<TreeChidrenDto> querySubjectTree(String subjectId);
}
