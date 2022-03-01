package com.openclassrooms.mediscreensecurity.proxies;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "mediscreen-risk", url = "localhost:8083")
public interface RiskProxy {
}
