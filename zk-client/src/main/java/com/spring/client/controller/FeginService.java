package com.spring.client.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 服务端调用
 *
 * @author xuweizhi
 * @since 2019/11/26 18:28
 */
@Component
@FeignClient("server")
public interface FeginService {

    @GetMapping("/rest/msg")
    String test();
}
