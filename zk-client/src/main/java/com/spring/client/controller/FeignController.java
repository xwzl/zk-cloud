package com.spring.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 服务调用测试
 *
 * @author xuweizhi
 * @since 2019/11/26 18:26
 */
@RestController
@RequestMapping("feign")
public class FeignController {

    @Resource
    private FeginService feginService;

    @Resource
    private NacosRefresh nacosRefresh;

    @GetMapping("msg")
    public String msg() {
        nacosRefresh.getTest();
        return feginService.test();
    }
}
