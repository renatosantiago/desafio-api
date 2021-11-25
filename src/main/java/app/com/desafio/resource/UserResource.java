package app.com.desafio.resource;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import app.com.desafio.dto.UserDTO;
import app.com.desafio.dto.UserInsertDTO;
import app.com.desafio.service.UserService;

@RestController
@RequestMapping(value = "/usuarios")
public class UserResource {
  
  @Autowired
  UserService service;

  @PostMapping
  public ResponseEntity<UserDTO> insert(@Valid @RequestBody UserInsertDTO dto) {
    UserDTO newDto = service.insert(dto);
    URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newDto.getId()).toUri();
    return ResponseEntity.created(uri).body(newDto);
  }

  @PutMapping(value = "/{id}")
  public ResponseEntity<UserDTO> update(@PathVariable Long id, @Valid  @RequestBody UserInsertDTO dto) {
    UserDTO newDto = service.update(id, dto);
    return ResponseEntity.ok().body(newDto);
  }
}
