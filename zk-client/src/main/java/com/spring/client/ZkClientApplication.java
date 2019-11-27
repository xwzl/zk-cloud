package com.spring.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * zk server
 *
 * @author xuweizhi
 * @since 2019-11-26 17:55
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class ZkClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZkClientApplication.class, args);
    }

}
