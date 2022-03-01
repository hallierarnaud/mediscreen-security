package com.openclassrooms.mediscreensecurity.controller.DTO;

import lombok.Data;

@Data
public class NoteResponse {

  private String id;
  private long patientId;
  private String patientNote;


}
