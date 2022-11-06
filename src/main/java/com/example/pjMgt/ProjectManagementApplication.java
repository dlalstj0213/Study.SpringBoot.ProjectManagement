package com.example.pjMgt;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class ProjectManagementApplication {

    public static void main(String[] args) {
        log.info("### PORT ::: {}" + System.getProperty("sys"));
        SpringApplication.run(ProjectManagementApplication.class, args);
    }

}
