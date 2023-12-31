package com.example.naumenwebproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAsync
@EnableScheduling
public class NaumenWebProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(NaumenWebProjectApplication.class, args);
    }

}
