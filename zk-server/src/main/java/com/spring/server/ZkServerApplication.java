package com.spring.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * zk server
 *
 * @author xuweizhi
 * @since 2019-11-26 17:55
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ZkServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZkServerApplication.class, args);
    }

}
