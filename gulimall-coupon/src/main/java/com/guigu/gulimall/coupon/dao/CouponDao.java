package com.guigu.gulimall.coupon.dao;

import com.guigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author lambda
 * @email chlambda123@gmail.com
 * @date 2023-07-02 20:00:10
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
