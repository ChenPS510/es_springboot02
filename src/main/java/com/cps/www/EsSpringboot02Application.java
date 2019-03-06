package com.cps.www;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@MapperScan("com.cps.www.dao")
@EnableElasticsearchRepositories(basePackages = "com.cps.www.dao.es")
public class EsSpringboot02Application {

    public static void main(String[] args) {
        SpringApplication.run(EsSpringboot02Application.class, args);
    }

}
