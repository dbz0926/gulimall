package com.dbz.gulimallproduct;

import com.dbz.gulimall.product.entity.BrandEntity;
import com.dbz.gulimall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class GulimallProductApplicationTests {
    @Autowired
    public BrandService brandService;
    @Test
    public void test() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("apple");
        brandService.save(brandEntity);
        System.out.println("success");
    }

}
