package com.rajendarreddyj.spring.batch.main;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author rajendarreddy.jagapathi
 *
 */
@SpringBootApplication
@EnableBatchProcessing
@EnableAutoConfiguration
public class Main {
    public static void main(final String[] args) {
        SpringApplication.run(Main.class, args);
    }

}