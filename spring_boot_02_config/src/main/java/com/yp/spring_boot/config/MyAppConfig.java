package com.yp.spring_boot.config;

import com.yp.spring_boot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author RickYinPeng
 * @ClassName MyAppConfig
 * @Description 配置类
 * @date 2019/1/14/14:45
 */

/**
 * @Configuration：指明当前类是一个配置类；就是用来代替之前的Spring配置文件的
 *
 * 在配置文件中用<bean></bean>标签添加组件
 *
 *
 */

@Configuration
public class MyAppConfig {

    //将方法的返回值添加到容器中；容器中这个组件默认的id就是方法名
    @Bean
    public HelloService helloService02(){
        System.out.println("给容器中添加helloService02这个类");
        return new HelloService();
    }

}
