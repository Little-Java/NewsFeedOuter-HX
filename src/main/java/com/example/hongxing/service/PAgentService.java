package com.example.hongxing.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.hongxing.common.Result;
import com.example.hongxing.entity.PAgentEntity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface PAgentService extends IService<PAgentEntity> {

    Result userLogin(String usAccounts, String rawPassword, HttpServletRequest request, HttpServletResponse response);

    List<PAgentEntity> queryUserList();
}
