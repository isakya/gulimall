package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author izumi
 * @email izumi@gmail.com
 * @date 2023-05-17 00:55:00
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
