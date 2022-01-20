package com.xz.producer.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xz
 * @date 2022/1/20 14:03
 */
@RestController
public class ProducerController {
    @PostMapping("/say")
    public String say() {
        System.out.println("hello world");
        return "{'name':'xz', 'age': 18}";
    }
}
