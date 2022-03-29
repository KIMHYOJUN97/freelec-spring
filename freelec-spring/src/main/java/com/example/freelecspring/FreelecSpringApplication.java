package com.example.freelecspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class FreelecSpringApplication {

    public FreelecSpringApplication() {
    }

    public static void main(String[] args) {
        SpringApplication.run(FreelecSpringApplication.class, args);
    }

}
