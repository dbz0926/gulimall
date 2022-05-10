package com.dbz.gulimall.order.dao;

import com.dbz.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author dbz
 * @email dbz@my.swjtu.edu.com
 * @date 2022-05-10 15:54:02
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
