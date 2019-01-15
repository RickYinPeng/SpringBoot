package com.atyp.spring_boot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot03LoggingApplicationTests {

    //日志记录器
    Logger logger = LoggerFactory.getLogger(getClass());

	@Test
	public void contextLoads() {

        //System.out.println();

        //日志的级别；
        //日志的级别由低到高     trace<debug<info<warn<error
        //可以调整需要输出的日志级别；日志就只会在这个级别以以后的高级别生效
        logger.trace("这是trace日志......");
        logger.debug("这是debug信息......");

        //Spring Boot默认给我们使用的是info级别
        //没有指定级别的就使用SpringBoot的默认规定级别：Root级别
        logger.info("这是info日志......");
        logger.warn("这是警告信息......");
        logger.error("这是error日志......");


	}

}

