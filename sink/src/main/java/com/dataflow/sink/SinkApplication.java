package com.dataflow.sink;

import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SinkApplication {


    @Bean
    public Consumer<String> consumer() {
        return message -> System.out.println("payload " + message);
    }


    public static void main(String[] args) {
        SpringApplication.run(SinkApplication.class, args);
    }

}
