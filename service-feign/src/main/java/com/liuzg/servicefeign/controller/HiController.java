package com.liuzg.servicefeign.controller;

import com.liuzg.servicefeign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <pre>
 *     Desc:
 * </pre>
 * @author liuzg
 * @date  2019/3/4 21;38
 */
@RestController
public class HiController {

    // 注入服务提供者,远程的Http服务
    @Autowired
    SchedualServiceHi schedualServiceHi;

    //服务消费者对外提供的服务
    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
