package com.atguigu.gulimall.thirdparty;

import com.aliyun.oss.OSSClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GulimallThirdPartyApplicationTests {

    // @Autowired
    // OSSClient ossClient;
    //
    // @Test
    // public void testUpload() throws FileNotFoundException {
    //     String filePath= "src/main/resources/izumi.jpg";
    //     InputStream inputStream = new FileInputStream(filePath);
    //     ossClient.putObject("gulimall-izumi","izumi2.jpg",inputStream);
    //     ossClient.shutdown();
    // }
}
