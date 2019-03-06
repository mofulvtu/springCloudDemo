package com.liuzg.servicefeign.service;


import org.springframework.stereotype.Component;
/**
 * <pre>
 *  Desc: Feign中使用断路器
 * </pre>
 *
 * @author liuzg
 * @date  2019/3/6 22:00
 **/
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "Sorry," + name;
    }
}
