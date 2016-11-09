package com.lw.springboot.controller.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.net.UnknownServiceException;

/**
 * Created by lw on 2016/11/9.
 */

public class Application {

    @Bean
    public Person person() {
         return  new Person();
    }

//    public static void main(String[] args) {
//        SpringApplication.run(Application.class, args);
//    }
}
