package com.lw.springboot.controller.demo1;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lw on 2016/11/9.
 * <p/>
 * Springboot的简单入门
 */
//RestController:在spring4中已经存在
@RestController
//springboot没有xml配置文件因为这个注解帮助我们干了这些事情。
//有了这个注解springboot启动的时候回自动猜测你的配置文件从而部署你的web服务器
@EnableAutoConfiguration
public class HelloWord {

    @RequestMapping("/hello")
    public String hellow() {
        return "hello,Spring boot!";
    }

    //带参数
    @RequestMapping("/word/{name}")
    public String word(@PathVariable String name) {
        System.out.println("获取的参数：" + name );
        return "word--spring boot:" + name;
    }
}
