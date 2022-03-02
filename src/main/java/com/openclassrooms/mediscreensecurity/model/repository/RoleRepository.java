package com.openclassrooms.mediscreensecurity.model.repository;

import com.openclassrooms.mediscreensecurity.model.entity.Role;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

  Role findByName(String name);

}
