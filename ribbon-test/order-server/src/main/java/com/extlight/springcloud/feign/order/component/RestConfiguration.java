package com.extlight.springcloud.feign.order.component;

import com.netflix.loadbalancer.*;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @descrption:
 * @author: bubbles
 */
@Configuration
public class RestConfiguration {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Bean
    public IRule testRule(){
        // Ribbon 提供 IRule 接口，该接口定义了如何访问服务的方法，以下是该接口的实现类：
        // 1) RoundRobinRule：轮询，默认使用的规则；
        // 2) RandomRule：随机；
        // 3)AvailabilityFilteringRule：先过滤由于多次访问故障而处于断路器跳闸状态以及并发连接数量超过阀值得服务，然后从剩余服务列表中按照轮询策略进行访问；
        // 4) WeightedResponseTimeRule：根据平均响应时间计算所有的权重，响应时间越快服务权重越有可能被选中；
        // 5) RetryRule：先按照 RoundRobinRule 策略获取服务，如果获取服务失败则在指定时间内进行重试，获取可用服务；
        // 6) BestAvailableRule：先过滤由于多次访问故障而处于断路器跳闸状态的服务，然后选择并发量最小的服务；
        // 7) ZoneAvoidanceRule：判断 server 所在区域的性能和 server 的可用性来选择服务器。
        return new RandomRule();
    }

}
