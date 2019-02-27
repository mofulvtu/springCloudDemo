package com.liuzg.serviceribbon.controller;

import com.liuzg.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <pre>
 *  Desc: 测试控制器
 * </pre>
 *
 * @author liuzg
 * @date 2019/2/27 15:45
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService(name);
    }
}
