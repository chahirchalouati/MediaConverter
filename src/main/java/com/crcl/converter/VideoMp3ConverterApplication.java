package com.crcl.converter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class VideoMp3ConverterApplication {

    public static void main(String[] args) {
        SpringApplication.run(VideoMp3ConverterApplication.class, args);
    }

}
