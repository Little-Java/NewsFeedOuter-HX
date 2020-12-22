package com.example.hongxing.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.hongxing.entity.PAgentEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface PAgentMapper extends BaseMapper<PAgentEntity> {

    PAgentEntity selectUserByName(@Param("usAccounts") String usAccounts);

    PAgentEntity selectUserById(@Param("usId") Integer usId);
}
