package com.example.hongxing.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.hongxing.entity.PAgentEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface PAgentMapper extends BaseMapper<PAgentEntity> {

    PAgentEntity selectUserByName(@Param("agentId") String agentId);

    PAgentEntity selectUserById(@Param("usId") Integer usId);

    List<PAgentEntity> queryUserList();
}
