package com.guigu.gulimall.product.dao;

import com.guigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lambda
 * @email chlambda123@gmail.com
 * @date 2023-07-07 20:55:12
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
