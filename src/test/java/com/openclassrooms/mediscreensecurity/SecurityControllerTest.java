package com.openclassrooms.mediscreensecurity;

import com.openclassrooms.mediscreensecurity.controller.DTO.NoteResponse;
import com.openclassrooms.mediscreensecurity.controller.DTO.PatientResponse;
import com.openclassrooms.mediscreensecurity.controller.DTO.RiskResponse;
import com.openclassrooms.mediscreensecurity.controller.endpoints.NoteController;
import com.openclassrooms.mediscreensecurity.controller.endpoints.PatientController;
import com.openclassrooms.mediscreensecurity.controller.endpoints.RiskController;
import com.openclassrooms.mediscreensecurity.proxies.NoteProxy;
import com.openclassrooms.mediscreensecurity.proxies.PatientProxy;
import com.openclassrooms.mediscreensecurity.proxies.RiskProxy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = {NoteController.class, PatientController.class, RiskController.class})
public class SecurityControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private NoteProxy noteProxy;

  @MockBean
  private PatientProxy patientProxy;

  @MockBean
  private RiskProxy riskProxy;

  /*@Test
  public void getNotesByPatientId_shouldReturnOk() throws Exception {
    when(noteProxy.getNotesByPatientId(anyLong())).thenReturn(new ArrayList<>());
    mockMvc.perform(get("/notes/1")).andExpect(status().isOk());
  }

  @Test
  public void updateNoteById_shouldReturnOk() throws Exception {
    when(noteProxy.updateNoteById(anyString(), any(NoteResponse.class))).thenReturn(new NoteResponse());
    mockMvc.perform(put("/notes/1")
            .contentType(MediaType.APPLICATION_JSON).content("{}"))
            .andExpect(status().isOk());
  }

  @Test
  public void addNoteByPatientId_shouldReturnOk() throws Exception {
    when(noteProxy.addNoteByPatientId(anyLong(), any(NoteResponse.class))).thenReturn(new NoteResponse());
    mockMvc.perform(post("/notes/1")
            .contentType(MediaType.APPLICATION_JSON).content("{}"))
            .andExpect(status().isOk());
  }

  @Test
  public void deleteNoteById_shouldReturnOk() throws Exception {
    doNothing().when(noteProxy).deleteNoteById(anyString());
    mockMvc.perform(delete("/notes/1")).andExpect(status().isOk());
  }

  @Test
  public void getPatients_shouldReturnOk() throws Exception {
    when(patientProxy.getPatients()).thenReturn(new ArrayList<>());
    mockMvc.perform(get("/patients")).andExpect(status().isOk());
  }

  @Test
  public void updatePatientById_shouldReturnOk() throws Exception {
    when(patientProxy.updatePatientById(anyLong(), any(PatientResponse.class))).thenReturn(new PatientResponse());
    mockMvc.perform(put("/patients/1")
            .contentType(MediaType.APPLICATION_JSON).content("{}"))
            .andExpect(status().isOk());
  }

  @Test
  public void addPatient_shouldReturnOk() throws Exception {
    when(patientProxy.addPatient(any(PatientResponse.class))).thenReturn(new PatientResponse());
    mockMvc.perform(post("/patients")
            .contentType(MediaType.APPLICATION_JSON).content("{}"))
            .andExpect(status().isOk());
  }

  @Test
  public void deletePatientById_shouldReturnOk() throws Exception {
    doNothing().when(patientProxy).deletePatientById(anyLong());
    mockMvc.perform(delete("/patients/1")).andExpect(status().isOk());
  }

  @Test
  public void getRiskByPatientId_shouldReturnOk() throws Exception {
    when(riskProxy.getRiskByPatientId(anyLong())).thenReturn(new RiskResponse());
    mockMvc.perform(get("/risks/1")).andExpect(status().isOk());
  }*/

}
