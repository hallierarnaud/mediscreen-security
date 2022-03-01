package com.openclassrooms.mediscreensecurity.controller.endpoints;


import com.openclassrooms.mediscreensecurity.controller.DTO.NoteResponse;
import com.openclassrooms.mediscreensecurity.proxies.NoteProxy;

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
public class NoteController {

  @Autowired
  private NoteProxy noteProxy;

  /**
   * @param patientId a patient's id
   * @return a list of all notes corresponding to the patientId
   */
  @GetMapping("/notes/{patientId}")
  public List<NoteResponse> getNotesByPatientId(@PathVariable("patientId") long patientId) {
    return noteProxy.getNotesByPatientId(patientId);
  }

  /**
   * @param id a note's id
   * @param noteResponse a note defined by his attributes
   * @return update the note in the database
   */
  @PutMapping("/notes/{id}")
  public NoteResponse updateNoteById(@PathVariable("id") String id, @RequestBody NoteResponse noteResponse) {
    return noteProxy.updateNoteById(id, noteResponse);
  }

  /**
   * @param patientId a patient's id
   * @param noteResponse a note defined by his attributes
   * @return add the note to the database
   */
  @PostMapping("/notes/{patientId}")
  public NoteResponse addNoteByPatientId(@PathVariable("patientId") long patientId, @RequestBody NoteResponse noteResponse) {
    return noteProxy.addNoteByPatientId(patientId, noteResponse);
  }

  /**
   * @param id a note's id
   * delete the note in the database
   */
  @DeleteMapping("/notes/{id}")
  public void deleteNoteById(@PathVariable("id") String id) {
    noteProxy.deleteNoteById(id);
  }


}
