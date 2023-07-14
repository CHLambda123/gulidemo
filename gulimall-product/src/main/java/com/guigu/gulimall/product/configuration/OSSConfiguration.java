package com.guigu.gulimall.product.configuration;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OSSConfiguration {
    @Value("${spring.alicloud.oss.endpoint}")
    private String endpoint;
    @Value("${spring.alicloud.access-key}")
    private String accessKey;
    @Value("${spring.alicloud.secret-key}")
    private String secretKey;
    @Bean(value = "customizeOss")
    public OSS oss() {
        return new OSSClientBuilder().build(endpoint, accessKey, secretKey);
    }
}
