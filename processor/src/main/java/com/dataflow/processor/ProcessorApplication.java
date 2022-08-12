package com.dataflow.processor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class ProcessorApplication {

    @Bean
    public Function<String, String> transform() {
        return payload -> {
            System.out.println("incoming from producer: " + payload);
            return payload.toUpperCase();
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(ProcessorApplication.class, args);
    }

}
