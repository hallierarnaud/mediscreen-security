package com.openclassrooms.mediscreensecurity.proxies;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "mediscreen-note", url = "localhost:8082")
public interface NoteProxy {
}
