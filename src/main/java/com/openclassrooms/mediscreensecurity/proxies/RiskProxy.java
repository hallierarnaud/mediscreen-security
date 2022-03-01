package com.openclassrooms.mediscreensecurity.proxies;

import com.openclassrooms.mediscreensecurity.controller.DTO.RiskResponse;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "mediscreen-risk", url = "localhost:8083")
public interface RiskProxy {

  @GetMapping(value ="/risks/{patientId}")
  RiskResponse getRiskByPatientId(@PathVariable long patientId);

}
