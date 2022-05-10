package com.dbz.gulimall.ware.dao;

import com.dbz.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author dbz
 * @email dbz@my.swjtu.edu.com
 * @date 2022-05-10 15:59:17
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
