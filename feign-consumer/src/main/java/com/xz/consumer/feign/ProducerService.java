package com.xz.consumer.feign;

import com.xz.consumer.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xz
 * @date 2022/1/20 14:05
 */
@FeignClient(value = "nacos-producer")
//@FeignClient(name = "nacos-producer" ,url = "localhost:9999")
public interface ProducerService {
    @PostMapping("/say")
    User say();
}
