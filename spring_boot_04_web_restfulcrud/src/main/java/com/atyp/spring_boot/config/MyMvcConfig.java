package com.atyp.spring_boot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author RickYinPeng
 * @ClassName MyMvcConfig
 * @Description
 * @date 2019/1/17/11:19
 */
@Configuration
public class MyMvcConfig implements WebMvcConfigurer{
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //浏览器发送 atyp 请求，也来到success页面
        registry.addViewController("/atyp").setViewName("success");
    }
}
