package app.com.desafio.dto;

import javax.validation.constraints.Email;

import app.com.desafio.model.User;

public class UserDTO {

  private Long id;

  @Email(message = "Favor inserir um email válido")
  private String email;


  public UserDTO() {}

  public UserDTO(User entity) {
    id = entity.getId();
    email = entity.getEmail();
  }


  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }
 
  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
  
}
