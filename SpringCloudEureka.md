###Spring Cloud Eureka

1. 简介
    
    Spring Cloud Eureka是Spring Cloud Netflix项目下的服务治理模块。而Spring Cloud Netflix项目是Spring Cloud的子项目之一，
   主要内容是对Netflix公司一系列开源产品的包装，它为Spring Boot应用提供了自配置的Netflix OSS整合。
   通过一些简单的注解，开发者就可以快速的在应用中配置一下常用模块并构建庞大的分布式系统。
   它主要提供的模块包括：服务发现（Eureka），断路器（Hystrix），智能路由（Zuul），客户端负载均衡（Ribbon）等。

2. 实现介绍
   
   工程名|用途
   ---|---
   eureka-server|服务注册中心
   service-hi|服务提供者
   service-ribbon|负载均衡客户端

3. 目前架构详见 项目图片 ribbon.png

   * 一个服务注册中心，eureka server,端口为8761
   * service-hi工程跑了两个实例，端口分别为8762,8763，分别向服务注册中心注册
   * sercvice-ribbon端口为8764,向服务注册中心注册
   * 当sercvice-ribbon通过restTemplate调用service-hi的hi接口时，因为用ribbon进行了负载均衡，会轮流的调用service-hi：8762和8763 两个端口的hi接口

   