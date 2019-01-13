package com.yp.spring_boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author RickYinPeng
 * @ClassName HelloController
 * @Description
 * @date 2019/1/4/22:51
 */
//这个类的所有方法返回的数据直接写给浏览器(如果是对象转换为json)
/*@ResponseBody
@Controller*/
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        System.out.println();
        return "hello world quick!!!";
    }

}
