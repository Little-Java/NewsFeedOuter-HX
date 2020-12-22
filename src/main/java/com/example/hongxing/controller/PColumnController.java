package com.example.hongxing.controller;

import com.example.hongxing.common.Result;
import com.example.hongxing.dto.SubjectDto;
import com.example.hongxing.dto.TreeChidrenDto;
import com.example.hongxing.entity.PColumnEntity;
import com.example.hongxing.service.PColumnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 栏目模块
 */
@Controller
@RequestMapping("column")
public class PColumnController {

    @Autowired
    private PColumnService pColumnService;

    @RequestMapping("/queryColumnListBySiteId")
    @ResponseBody
    public Result<List<PColumnEntity>> queryColumnListByChildWebId(String childWebId){
        if(childWebId == null){
            return new Result(500, "站点不能为空");
        }
        List<PColumnEntity> list = pColumnService.queryColumnListByChildWebId(childWebId);
        return new Result(200,"请求成功", list);
    }

    @RequestMapping("/getSubjectListById")
    @ResponseBody
    public Result<List<TreeChidrenDto>> getSubjectListById(String sbId){
        List<TreeChidrenDto> list = pColumnService.getSubjectListById(sbId);
        if(list == null || list.size()<=0){
            return new Result(500, "没有栏目");
        }
        return new Result(0, "请求成功", list, list.size());
    }

    @RequestMapping("/querySubjectTree")
    @ResponseBody
    public Result<List<TreeChidrenDto>> querySubjectTree(String sbId){
        List<TreeChidrenDto> list = pColumnService.querySubjectTree(sbId);
        return new Result(200, "请求成功", list);
    }
}
