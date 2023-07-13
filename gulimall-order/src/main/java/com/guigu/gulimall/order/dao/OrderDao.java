package com.guigu.gulimall.order.dao;

import com.guigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author lambda
 * @email chlambda123@gmail.com
 * @date 2023-07-02 20:17:06
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
