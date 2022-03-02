package com.openclassrooms.mediscreensecurity.domain.service;

import com.openclassrooms.mediscreensecurity.model.entity.Role;
import com.openclassrooms.mediscreensecurity.model.entity.User;
import com.openclassrooms.mediscreensecurity.model.repository.RoleRepository;
import com.openclassrooms.mediscreensecurity.model.repository.UserRepository;

import org.springframework.stereotype.Service;

import java.util.List;

import javax.transaction.Transactional;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Transactional
@Slf4j
@Service
public class UserServiceImplementation implements UserService {

  private final UserRepository userRepository;
  private final RoleRepository roleRepository;

  @Override
  public User saveUser(User user) {
    log.info("Saving new user {} to the database", user.getName());
    return userRepository.save(user);
  }

  @Override
  public Role saveRole(Role role) {
    log.info("Saving new role {} to the database", role.getName());
    return roleRepository.save(role);
  }

  @Override
  public void addRoleToUser(String username, String roleName) {
    log.info("Adding role {} to user {}", roleName, username);
    User user = userRepository.findByUsername(username);
    Role role = roleRepository.findByName(roleName);
    user.getRoles().add(role);
  }

  @Override
  public User getUser(String username) {
    log.info("Fetching user {}", username);
    return userRepository.findByUsername(username);
  }

  @Override
  public List<User> getUsers() {
    log.info("Fetching all users");
    return userRepository.findAll();
  }
}
