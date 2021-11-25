package app.com.desafio.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.com.desafio.service.PeopleService;

@RestController
@RequestMapping("/pessoas")
public class PeopleResource {
  
  @Autowired
  private PeopleService service;

  @GetMapping("/{id}")
  public ResponseEntity<?> getPeopleById(@PathVariable("id") Integer id) {
    return ResponseEntity.ok(service.getPeopleById(id));
  }

  @GetMapping
  public ResponseEntity<?> getPeoples() {
    return ResponseEntity.ok(service.getPeoples());
  }
}
