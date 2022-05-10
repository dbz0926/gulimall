package com.dbz.gulimall.order.dao;

import com.dbz.gulimall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author dbz
 * @email dbz@my.swjtu.edu.com
 * @date 2022-05-10 15:54:02
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
