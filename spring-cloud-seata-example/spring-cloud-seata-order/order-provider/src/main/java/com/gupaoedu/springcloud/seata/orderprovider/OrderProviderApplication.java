package com.gupaoedu.springcloud.seata.orderprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.gupaoedu.springcloud.seata.orderprovider.dal.mappers")
//@SpringBootApplication(exclude = GlobalTransactionAutoConfiguration.class)
@SpringBootApplication()
public class OrderProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderProviderApplication.class, args);
	}

}
