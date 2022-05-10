package com.dbz.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dbz.common.utils.PageUtils;
import com.dbz.gulimall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author dbz
 * @email dbz@my.swjtu.edu.com
 * @date 2022-05-10 15:28:07
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

