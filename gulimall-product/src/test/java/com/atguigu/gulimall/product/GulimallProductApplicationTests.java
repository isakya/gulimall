package com.atguigu.gulimall.product;


import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import com.atguigu.gulimall.product.service.CategoryService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {
    @Autowired
    BrandService brandService;
    @Autowired
    CategoryService categoryService;
    @Test
    public void  contextLoads() {
        // BrandEntity brandEntity = new BrandEntity();
        // brandEntity.setBrandId(1L);
        // brandEntity.setDescript("华为");


        // brandEntity.setDescript("");
        // brandEntity.setName("华为");
        // brandService.save(brandEntity);
        // System.out.println("保存成功...");


        // brandService.updateById(brandEntity);

        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        list.forEach(item -> System.out.println(item.getDescript()));
    }

    @Test
    public void testFindPath() {
        Long[] catelogPath = categoryService.findCatelogPath(172L);
        log.info("完整路径:{}", Arrays.asList(catelogPath));
    }
}
