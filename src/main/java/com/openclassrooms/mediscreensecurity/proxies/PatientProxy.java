package com.openclassrooms.mediscreensecurity.proxies;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "mediscreen-patient", url = "localhost:8080")
public interface PatientProxy {
}
