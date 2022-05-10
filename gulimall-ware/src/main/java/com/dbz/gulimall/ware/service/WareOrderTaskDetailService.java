package com.dbz.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dbz.common.utils.PageUtils;
import com.dbz.gulimall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author dbz
 * @email dbz@my.swjtu.edu.com
 * @date 2022-05-10 15:59:17
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

