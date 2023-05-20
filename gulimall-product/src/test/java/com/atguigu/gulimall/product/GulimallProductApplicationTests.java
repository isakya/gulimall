package com.atguigu.gulimall.product;


import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.PutObjectResult;
import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {
    @Autowired
    BrandService brandService;

    @Autowired
    OSSClient ossClient;

    // 原生sdk测试上传文件
    @Test
    public void testUpload() {
        // // Endpoint以华东1（杭州）为例，其它Region请按实际情况填写。
        // String endpoint = "oss-cn-shenzhen.aliyuncs.com";
        // // 阿里云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM用户进行API访问或日常运维，请登录RAM控制台创建RAM用户。
        // String accessKeyId = "LTAI5tCwK8tu3A6EK1R123VisyVUo";
        // String accessKeySecret = "8ONzKQPCi523462nN8m742Lfr2t1SP51461cL5N1kv2";
        // // 填写Bucket名称，例如examplebucket。
        // String bucketName = "gulimall-izumi";
        // // 填写Object完整路径，完整路径中不能包含Bucket名称，例如exampledir/exampleobject.txt。
        // String objectName = "izumi.jpg";
        // // 填写本地文件的完整路径，例如D:\\localpath\\examplefile.txt。
        // // 如果未指定本地路径，则默认从示例程序所属项目对应本地路径中上传文件流。
        String filePath= "src/main/resources/izumi.jpg";
        //
        // // 创建OSSClient实例。
        // OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

        try {
            InputStream inputStream = new FileInputStream(filePath);
            // 创建PutObjectRequest对象。
            // PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, objectName, inputStream);
            // 设置该属性可以返回response。如果不设置，则返回的response为空。
            // putObjectRequest.setProcess("true");
            // 创建PutObject请求。
            PutObjectResult result = ossClient.putObject("gulimall-izumi","izumi1.jpg",inputStream);
            // 如果上传成功，则返回200。
            System.out.println(result.getResponse().getStatusCode());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ossClient != null) {
                ossClient.shutdown();
            }
        }
    }
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

}
