### Feign 

1. Feign 简介
  
   Feign是一种声明式、模板化的Http客户端。在Spring Cloud中使用Feign，可以做到使用Http请求远程服务时就像调用本地方法一样的体验。
   
   Feign特性：
   
   * 可插拔的注解支持，包括Feign注解和JAX-RS注解
   * 支持可插拔的HTTP编码器和解码器
   * 支持Hystrix和它的Fallback
   * 支持Ribbon的负载均衡
   * 支持HTTP请求和响应的压缩 Feign是一个声明式的Web Service客户端，它的目的就是让Web Service调用更加简单。
     它整合了Ribbon和Hystrix，从而不再需要显式地使用这两个组件。 
     Feign还提供了HTTP请求的模板，通过编写简单的接口和注解，就可以定义好HTTP请求的参数、格式、地址等信息。
     接下来，Feign会完全代理HTTP的请求，我们只需要像调用方法一样调用它就可以完成服务请求。   

2. Feign工作原理

   * Spring Cloud 应用在启动时，Feign会扫描标有FeignClient注解的接口，生成代理，并注册到Spring容器中。
   * 生成代理时Feign会为每个接口方法创建一个RequestTemplate对象，该对象封装了Http请求的全部信息，请求参数名、请求方法等
   信息都是在这个过程中确定的，Feign的模板化就体现在这里。