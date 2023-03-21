package com.example.nailssamarabot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class NailsSamaraBotApplication {

    public static void main(String[] args) {
        SpringApplication.run(NailsSamaraBotApplication.class, args);
    }

}
//архитектура!