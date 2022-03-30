package com.openclassrooms.mediscreensecurity.proxies;

import com.openclassrooms.mediscreensecurity.controller.DTO.PatientResponse;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "mediscreen-patient", url = "${host.patient}")
public interface PatientProxy {

  @GetMapping(value = "/patients")
  List<PatientResponse> getPatients();

  @PutMapping(value = "/patients/{id}")
  PatientResponse updatePatientById(@PathVariable("id") long id, @RequestBody PatientResponse patientResponse);

  @PostMapping(value = "/patients")
  PatientResponse addPatient(@RequestBody PatientResponse patientResponse);

  @DeleteMapping(value = "/patients/{id}")
  void deletePatientById(@PathVariable("id") long id);

}
