package app.com.desafio.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.com.desafio.service.FilmService;

@RestController
@RequestMapping("/filmes")
public class FilmResource {
  
  @Autowired
  private FilmService service;

  @GetMapping("/{id}")
  public ResponseEntity<?> getFilmById(@PathVariable("id") Integer id) {
    return ResponseEntity.ok(service.getFilmById(id));
  }

  @GetMapping
  public ResponseEntity<?> listFilms() {
    return ResponseEntity.ok(service.getFilms());
  }
}
