package com.openclassrooms.mediscreensecurity.model.repository;

import com.openclassrooms.mediscreensecurity.model.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

  User findByUsername(String username);

}
