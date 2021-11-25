package app.com.desafio.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.com.desafio.service.PlanetService;

@RestController
@RequestMapping("/planetas")
public class PlanetResource {
  
  @Autowired
  private PlanetService service;

  @GetMapping("/{id}")
  public ResponseEntity<?> getPlanetById(@PathVariable("id") Integer id) {
    return ResponseEntity.ok(service.getPlanetById(id));
  }

  @GetMapping
  public ResponseEntity<?> getPlanets() {
    return ResponseEntity.ok(service.getPlanets());
  }
}
