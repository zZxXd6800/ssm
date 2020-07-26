package com.atguigu.spring.aspect;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author zhuxu
 * @date 2020/7/15 23:02
 */
@Configuration
@ComponentScan(basePackages = {"com.atguigu.spring.aspect"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AspectConfig {
}
