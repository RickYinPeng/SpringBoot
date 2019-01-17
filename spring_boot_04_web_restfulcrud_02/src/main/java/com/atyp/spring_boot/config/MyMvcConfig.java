package com.atyp.spring_boot.config;

import com.atyp.spring_boot.component.LoginHandlerInterceptor;
import com.atyp.spring_boot.component.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author RickYinPeng
 * @ClassName MyMvcConfig
 * @Description
 * @date 2019/1/17/11:19
 */
//@EnableWebMvc  //全面接管mvc
@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //super.addViewControllers(registry);
        registry.addViewController("/atyp").setViewName("success");
    }

    @Bean
    //所有的WebMvcConfigurerAdapter组件都会一起生效
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter(){
        WebMvcConfigurerAdapter webMvcConfigurerAdapter = new WebMvcConfigurerAdapter(){
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/login.html").setViewName("login");
                registry.addViewController("/main.html").setViewName("dashboard");
            }
        };
        return webMvcConfigurerAdapter;
    }

    @Bean
    public MyLocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }

    //注册拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
        .excludePathPatterns("/login.html","/","/user/login");
    }
}
