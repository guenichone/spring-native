package com.barrak.springnative;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = {
    Application.class}
)
public class Application {

    public static void main(final String... args) {
        SpringApplication.run(Application.class, args);
    }
}
