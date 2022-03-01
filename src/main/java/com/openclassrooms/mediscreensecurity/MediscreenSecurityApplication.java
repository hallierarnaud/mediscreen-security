package com.openclassrooms.mediscreensecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.openclassrooms.mediscreensecurity")
public class MediscreenSecurityApplication {

  public static void main(String[] args) {
    SpringApplication.run(MediscreenSecurityApplication.class, args);
  }

}
