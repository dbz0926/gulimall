package com.dbz.gulimall.coupon.dao;

import com.dbz.gulimall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author dbz
 * @email dbz@my.swjtu.edu.com
 * @date 2022-05-10 15:28:07
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
