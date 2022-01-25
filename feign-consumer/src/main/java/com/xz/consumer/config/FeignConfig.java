package com.xz.consumer.config;

import com.alibaba.fastjson.JSONObject;
import com.xz.consumer.model.User;
import feign.FeignException;
import feign.Logger;
import feign.Response;
import feign.Util;
import feign.codec.DecodeException;
import feign.codec.Decoder;
import org.apache.juli.logging.Log;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.support.SpringDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.swing.*;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * @author xz
 * @date 2022/1/20 14:24
 */
@Configuration
public class FeignConfig {

//    @Bean
//    public Decoder decoder() {
//        return new Decoder(){
//            @Override
//            public Object decode(Response response, Type type) throws IOException, FeignException {
//                String res = Util.toString(response.body().asReader(StandardCharsets.UTF_8));
//
//                return JSONObject.parseObject(res, User.class);
//            }
//        };
//    }
//
//    @Bean
//    public Logger.Level level() {
//        return Logger.Level.FULL;
//    }
}
