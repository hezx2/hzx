package com.example.server;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@EnableEurekaServer
@SpringBootApplication
@RestController
public class ServerApplication {
    @Value("${server.port}")
    private String bookName; // 注入第一个配置外部文件属性

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }


    @RequestMapping(value = "aa",method = RequestMethod.GET)
    public String  communicate() {
        return bookName;
    }


}
