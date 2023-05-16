package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author izumi
 * @email izumi@gmail.com
 * @date 2023-05-17 00:31:50
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
