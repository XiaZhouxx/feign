package com.xz.producer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xz
 * @date 2022/1/20 14:03
 */
@RestController
public class ProducerController {
    @Value("${server.port}")
    String port;
    @PostMapping("/say")
    public String say() {
        System.out.println("current server port " + port);
        return port;
    }
}
