package com.openclassrooms.mediscreensecurity;

import com.openclassrooms.mediscreensecurity.domain.service.UserService;
import com.openclassrooms.mediscreensecurity.model.entity.Role;
import com.openclassrooms.mediscreensecurity.model.entity.User;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
@EnableFeignClients("com.openclassrooms.mediscreensecurity")
public class MediscreenSecurityApplication {

  public static void main(String[] args) {
    SpringApplication.run(MediscreenSecurityApplication.class, args);
  }

  @Bean
  public BCryptPasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }

  @Bean
  CommandLineRunner run(UserService userService) {
    return args -> {
      userService.saveRole(new Role(null, "ROLE_USER"));
      userService.saveRole(new Role(null, "ROLE_ADMIN"));

      userService.saveUser(new User(null, "Homer Simpson", "hSimpson", "homsim", new ArrayList<>()));
      userService.saveUser(new User(null, "Marge Simpson", "mSimpson", "marsim", new ArrayList<>()));
      userService.saveUser(new User(null, "Bart Simpson", "bSimpson", "barsim", new ArrayList<>()));
      userService.saveUser(new User(null, "Lisa Simpson", "lSimpson", "lissim", new ArrayList<>()));

      userService.addRoleToUser("hSimpson", "ROLE_USER");
      userService.addRoleToUser("hSimpson", "ROLE_ADMIN");
      userService.addRoleToUser("mSimpson", "ROLE_USER");
      userService.addRoleToUser("bSimpson", "ROLE_USER");
      userService.addRoleToUser("lSimpson", "ROLE_USER");
    };
  }

}
