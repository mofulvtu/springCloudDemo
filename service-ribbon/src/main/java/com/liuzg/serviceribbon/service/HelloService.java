package com.liuzg.serviceribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * <pre>
 *  Desc: 测试服务
 * </pre>
 *
 * @author liuzg
 * @date 2019/2/27 15:45
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name, String.class);
    }
}
