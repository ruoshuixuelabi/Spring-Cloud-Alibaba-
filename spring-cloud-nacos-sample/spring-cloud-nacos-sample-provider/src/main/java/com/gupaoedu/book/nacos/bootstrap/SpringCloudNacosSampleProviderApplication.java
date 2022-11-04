package com.gupaoedu.book.nacos.bootstrap;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class SpringCloudNacosSampleProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudNacosSampleProviderApplication.class, args);
    }
}
