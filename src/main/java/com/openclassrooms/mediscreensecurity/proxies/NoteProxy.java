package com.openclassrooms.mediscreensecurity.proxies;

import com.openclassrooms.mediscreensecurity.controller.DTO.NoteResponse;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "mediscreen-note", url = "${host.note}")
public interface NoteProxy {

  @GetMapping(value = "/notes/{patientId}")
  List<NoteResponse> getNotesByPatientId(@PathVariable("patientId") long patientId);

  @PutMapping(value = "/notes/{id}")
  NoteResponse updateNoteById(@PathVariable("id") String id, @RequestBody NoteResponse noteResponse);

  @PostMapping(value = "/notes/{patientId}")
  NoteResponse addNoteByPatientId(@PathVariable("patientId") long patientId, @RequestBody NoteResponse noteResponse);

  @DeleteMapping(value = "/notes/{id}")
  void deleteNoteById(@PathVariable("id") String id);

}
