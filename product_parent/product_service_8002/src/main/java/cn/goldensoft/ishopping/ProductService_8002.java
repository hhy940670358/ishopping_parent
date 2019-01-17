package cn.goldensoft.ishopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "cn.goldensoft.ishopping")
public class ProductService_8002 {
    public static void main(String[] args) {
        SpringApplication.run(ProductService_8002.class);
    }
}
