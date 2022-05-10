package com.dbz.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dbz.common.utils.PageUtils;
import com.dbz.gulimall.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author dbz
 * @email dbz@my.swjtu.edu.com
 * @date 2022-05-10 15:54:02
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

