package com.spring.client.controller;

import lombok.Data;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * nacos 验证即时刷新注入值
 *
 * @author xuweizhi
 * @since 2019/11/27 17:06
 */
@Data
@Component
@RefreshScope
public class NacosRefresh {

    //@Value("${base.config.test}")
    private String test;

}
