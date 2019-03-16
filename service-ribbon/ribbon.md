### Ribbon

1.  微服务调用方式
  * 在微服务架构中，业务都会被拆分成一个独立的服务，服务与服务的通讯是基于http restful的。
  * Spring cloud有两种服务调用方式， 一种是ribbon+restTemplate，另一种是feign。

2. Ribbon

  * ribbon是一个负载均衡客户端，可以很好的控制htt和tcp的一些行为。
  * Feign默认集成了ribbon。
  
3. 断路器
  
  * 提出原因：  为了解决服务故障的“雪崩”效应问题。
  * Netflix开源了Hystrix组件，实现了断路器模式。
  * 较底层的服务如果出现故障，会导致连锁故障。当对特定的服务的调用的不可用达到一个阀值（Hystric 是5秒20次） 断路器将会被打开。
  * 断路打开后，可用避免连锁故障，fallback方法可以直接返回一个固定值。
    

    
    