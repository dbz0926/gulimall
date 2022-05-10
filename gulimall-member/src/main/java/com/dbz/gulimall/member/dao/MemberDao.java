package com.dbz.gulimall.member.dao;

import com.dbz.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author dbz
 * @email dbz@my.swjtu.edu.com
 * @date 2022-05-10 15:37:40
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
