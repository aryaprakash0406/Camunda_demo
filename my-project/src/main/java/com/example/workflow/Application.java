package com.example.workflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
//@ConditionalOnProperty(name = "camunda.bpm.webapp.header-security.xss-protection-disabled", havingValue = "true", matchIfMissing = true)
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class Application {

  public static void main(String... args) {
    SpringApplication.run(Application.class, args);
  }

}