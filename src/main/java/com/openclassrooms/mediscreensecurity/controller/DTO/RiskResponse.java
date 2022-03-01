package com.openclassrooms.mediscreensecurity.controller.DTO;

import lombok.Data;

@Data
public class RiskResponse {

  private String risk;
  private int age;
  private String sex;
  private int trigger;

}
