package com.openclassrooms.mediscreensecurity.controller.endpoints;

import com.openclassrooms.mediscreensecurity.controller.DTO.PatientResponse;
import com.openclassrooms.mediscreensecurity.proxies.PatientProxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class PatientController {

  @Autowired
  private PatientProxy patientProxy;

  /**
   * @return a list of all patients in the database
   */
  @GetMapping("/patients")
  public List<PatientResponse> getPatients() {
    return patientProxy.getPatients();
  }

  /**
   * @param id a patient's id
   * @param patientResponse a patient defined by his attributes
   * @return update the patient in the database
   */
  @PutMapping("/patients/{id}")
  public PatientResponse updatePatientById(@PathVariable("id") long id, @RequestBody PatientResponse patientResponse){
    return patientProxy.updatePatientById(id, patientResponse);
  }

  /**
   * @param patientResponse a patient defined by his attributes
   * @return add the patient to the database
   */
  @PostMapping("/patients")
  public PatientResponse addPatient(@RequestBody PatientResponse patientResponse) {
    return patientProxy.addPatient(patientResponse);
  }

  /**
   * @param id a patient's id
   * delete the patient in the database
   */
  @DeleteMapping("/patients/{id}")
  public void deletePatientById(@PathVariable("id") long id) {
    patientProxy.deletePatientById(id);
  }

}
