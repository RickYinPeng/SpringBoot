package yp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author RickYinPeng
 * @ClassName HelloWorldMainApplication
 * @Description SpringBoot的第一个案列
 * @date 2019/1/4/17:52
 */

/**
 * @SpringBootApplication 来标注一个主程序类，说明是一个Spring Boot应用
 */
@SpringBootApplication
public class HelloWorldMainApplication {

    public static void main(String[] args) {
        //spring应用启动起来
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}
