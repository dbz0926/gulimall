package com.dbz.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dbz.common.utils.PageUtils;
import com.dbz.gulimall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author dbz
 * @email dbz@my.swjtu.edu.com
 * @date 2022-05-09 21:28:38
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

