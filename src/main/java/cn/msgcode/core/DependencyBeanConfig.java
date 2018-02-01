package cn.msgcode.core;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class DependencyBeanConfig {

    @Bean
    @ConditionalOnMissingBean
    public SpringUtil springUtil() {
        return new SpringUtil();
    }

    @Bean
    @ConditionalOnMissingBean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
