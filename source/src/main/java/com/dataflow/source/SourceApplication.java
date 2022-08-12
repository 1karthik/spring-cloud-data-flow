package com.dataflow.source;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.function.Supplier;

@SpringBootApplication
public class SourceApplication {

    @Bean
    public Supplier<String> producer() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String generatedString = RandomStringUtils.random(10, true, false);
        return () -> "test " + generatedString + " " + sdf.format(new Date());
    }

    public static void main(String[] args) {
        SpringApplication.run(SourceApplication.class, args);
    }

}
