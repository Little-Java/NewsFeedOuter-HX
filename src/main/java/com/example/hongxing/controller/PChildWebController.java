package com.example.hongxing.controller;

import com.example.hongxing.common.Result;
import com.example.hongxing.dto.PChildWebEntityEx;
import com.example.hongxing.entity.PChildWebEntity;
import com.example.hongxing.service.PChildWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 站点模块
 */
@Controller
@RequestMapping("site")
public class PChildWebController {

    @Autowired
    private PChildWebService pChildWebService;

    @PostMapping("/getSiteDtoAll")
    @ResponseBody
    public Result<List<PChildWebEntity>> getSiteDtoAll(Integer topicId, String topicName){
        Result<List<PChildWebEntity>> result = new Result<List<PChildWebEntity>>();
        result.setMessage("请求成功");
        result.setStatusCode(200);
        result.setResult(pChildWebService.getSiteDtoAll(topicId, topicName));
        return result;
    }

    @PostMapping("/getSiteAll")
    @ResponseBody
    public Result<List<PChildWebEntityEx>> getSiteAll(Integer topicId, String topicName){
        List<PChildWebEntityEx> list = pChildWebService.getSiteAll(topicId, topicName);
        if(list == null || list.size()<=0){
            return new Result(500, "没有站点");
        }
        return new Result(0, "请求成功", list, list.size());
    }
}
