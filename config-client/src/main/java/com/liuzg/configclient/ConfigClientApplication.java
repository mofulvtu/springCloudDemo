package com.liuzg.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * <pre>
 *  Desc:  读取配置服务中心配置，服务中心从github上读取
 * </pre>
 *
 * @author liuzg
 * @date  2019/3/9 0:20
 **/
@SpringBootApplication
@RestController
@EnableEurekaClient
public class ConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }

    @Value("${foo}")
    String foo;

    @RequestMapping("hi")
    public String hi(){
        return foo;
    }

}
