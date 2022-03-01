package com.openclassrooms.mediscreensecurity.controller.endpoints;

import com.openclassrooms.mediscreensecurity.controller.DTO.RiskResponse;
import com.openclassrooms.mediscreensecurity.proxies.RiskProxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class RiskController {

  @Autowired
  private RiskProxy riskProxy;

  /**
   * @param patientId a patient's id
   * @return the risk corresponding to the patient
   */
  @GetMapping("/risks/{patientId}")
  public RiskResponse getRiskByPatientId(@PathVariable("patientId") long patientId) {
    return riskProxy.getRiskByPatientId(patientId);
  }

}
