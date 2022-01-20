package com.xz.consumer.controller;

import com.xz.consumer.feign.ProducerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author xz
 * @date 2022/1/20 14:20
 */
@RestController
public class ConsumerController {
    @Resource
    ProducerService producerService;

    @RequestMapping("/test")
    public Object test() {
        return producerService.say();
    }
}
