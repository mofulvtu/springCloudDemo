package com.liuzg.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <pre>
 *  Desc:  @FeignClient用于通知Feign组件对该接口进行代理(不需要编写接口实现),使用者可直接通过@Autowired注入
 *
 *        Feign客户端定义
 * </pre>
 *
 * @author liuzg
 * @date  2019/3/4 21:33
 **/
@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
