package com.openclassrooms.mediscreensecurity.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static javax.persistence.GenerationType.AUTO;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Role {

  @Id
  @GeneratedValue(strategy = AUTO)
  private Long id;
  private String name;

}
