package com.monster.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author CustomLZH
 */
@SpringBootApplication
@EnableEurekaServer
public class MonsterEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonsterEurekaApplication.class, args);
    }

}
