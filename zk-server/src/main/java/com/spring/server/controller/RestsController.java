package com.spring.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Rest 控制
 *
 * @author xuweizhi
 * @since 2019/11/26 18:24
 */
@RestController
@RequestMapping("rest")
public class RestsController {

    @GetMapping("msg")
    public String test() {
        return "hello";
    }
}
