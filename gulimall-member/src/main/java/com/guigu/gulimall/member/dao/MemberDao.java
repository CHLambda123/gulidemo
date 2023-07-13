package com.guigu.gulimall.member.dao;

import com.guigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lambda
 * @email chlambda123@gmail.com
 * @date 2023-07-02 20:09:59
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
