package com.wujc.springtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringtestApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringtestApplication.class, args);

        /*StringRedisTemplate template = ctx.getBean(StringRedisTemplate.class);
        //LOGGER.info("Sending message......");
        template.convertAndSend("chat", "Hello, SpringBoot redis message!!!!");

        System.exit(0);*/
    }
}
