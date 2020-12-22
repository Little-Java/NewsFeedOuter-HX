package com.example.hongxing.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.hongxing.common.Result;
import com.example.hongxing.entity.PAgentEntity;
import com.example.hongxing.mapper.PAgentMapper;
import com.example.hongxing.service.PAgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Service
public class PAgentServiceImpl extends ServiceImpl<PAgentMapper, PAgentEntity> implements PAgentService {

    @Autowired
    private PAgentMapper pAgentMapper;

//    @Autowired
//    private RedisClient redisClinet;

    @Override
    public Result userLogin(String usAccounts, String rawPassword, HttpServletRequest request, HttpServletResponse response) {
        PAgentEntity pAgentEntity = pAgentMapper.selectUserByName(usAccounts);
        if(pAgentEntity != null) {
            if(pAgentEntity.getAgentPwd().equals(rawPassword)){
                String sessionId = request.getRequestedSessionId();
//                try {
//                    redisClinet.set(user.getUsId().toString(), sessionId);
//                    redisClinet.expire(user.getUsId().toString(), 1800);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
                return new Result(200, "请求成功", sessionId);
            }
            return new Result(500, "密码不正确");
        }
        return new Result(500,"用户不存在");
    }

    @Override
    public List<PAgentEntity> queryUserList() {
        QueryWrapper<PAgentEntity> queryWrapper = new QueryWrapper<>();
        return pAgentMapper.selectList(queryWrapper);
    }


}
