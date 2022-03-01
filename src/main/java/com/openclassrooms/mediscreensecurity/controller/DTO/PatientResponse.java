package com.openclassrooms.mediscreensecurity.controller.DTO;

import java.util.Date;

import lombok.Data;

@Data
public class PatientResponse {

  private Long id;
  private String lastname;
  private String firstname;
  private Date birthdate;
  private String sex;
  private String address;
  private String phone;

}
