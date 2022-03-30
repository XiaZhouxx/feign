package com.xz.consumer.controller;

import com.netflix.loadbalancer.*;
import com.xz.consumer.feign.ProducerService;
import org.springframework.cloud.netflix.ribbon.SpringClientFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

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
    @Resource
    SpringClientFactory clientFactory;

    @RequestMapping("/editRule")
    public void dynamicRibbonRule(String clientName, String rule) {
        ILoadBalancer loadBalancer = clientFactory.getLoadBalancer(clientName);
        if (loadBalancer instanceof BaseLoadBalancer) {
            ((BaseLoadBalancer) loadBalancer).setRule(cache.get(rule));
        }
    }
    private static Map<String, IRule> cache;
    static {
        cache = new HashMap<>();
        cache.put("random", new RandomRule());
        cache.put("round", new RoundRobinRule());
    }
}
