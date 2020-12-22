package com.example.hongxing.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.hongxing.dto.TreeChidrenDto;
import com.example.hongxing.entity.PColumnEntity;
import com.example.hongxing.mapper.PColumnMapper;
import com.example.hongxing.mapper.PChildWebMapper;
import com.example.hongxing.service.PColumnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PColumnServiceImpl extends ServiceImpl<PColumnMapper, PColumnEntity> implements PColumnService {

    @Autowired
    private PChildWebMapper PChildWebMapper;

    @Autowired
    private PColumnMapper pColumnMapper;

    @Override
    public List<PColumnEntity> queryColumnListByChildWebId(String childWebId) {

        QueryWrapper<PColumnEntity> qw = new QueryWrapper<>();
        qw.eq("CHILDWEBID",childWebId);
        List<PColumnEntity> list = pColumnMapper.selectList(qw);
        return list;
    }

    @Override
    public List<TreeChidrenDto> getSubjectListById(String sbId) {
        List<TreeChidrenDto> list = pColumnMapper.getSubjectListById(sbId);
        return list;
    }

    @Override
    public List<TreeChidrenDto> querySubjectTree(String subjcetId) {
        List<TreeChidrenDto> list =  pColumnMapper.querySubjectTree();
        for (TreeChidrenDto dto : list) {
            String id = dto.getSbId();
            List<TreeChidrenDto> list1 = pColumnMapper.querySubjectTrees(id, id.length()+2);
            dto.setChildren(list1);
            if(list1.size()>0 || list !=null){
                for(TreeChidrenDto dto1 : dto.getChildren()){
                    String id1 = dto1.getSbId();
                    List<TreeChidrenDto> list2 = pColumnMapper.querySubjectTrees(id1, id1.length()+2);
                    dto1.setChildren(list2);
                }
            }
        }
        return list;
    }
}
