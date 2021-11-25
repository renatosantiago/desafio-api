package app.com.desafio.resource;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.standaloneSetup;
import static org.mockito.Mockito.when;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;

import app.com.desafio.dto.PeopleDTO;
import app.com.desafio.service.PeopleService;
import io.restassured.http.ContentType;

@WebMvcTest
public class FilmResourceTest {
  
  @Autowired
  private PeopleResource peopleResource;

  @MockBean
  private PeopleService peopleService;

  @BeforeEach
  public void setup() {
    standaloneSetup(this.peopleResource);
  }

  @Test
  public void deveRetornarSucessoAoBuscarFilme() {

    PeopleDTO dto = new PeopleDTO();
    dto.setUrl("https://swapi.dev/api/people/1");
    dto.setBirthYear("24BBY");
    dto.setEyeColor("brown");
    dto.setGender("male");
    dto.setHairColor("black");
    dto.setHeight("183");
    dto.setMass("88");
    dto.setSkinColor("light");
    dto.setHomeWorld("https://swapi.dev/api/planets/1/");
    dto.setCreated("2014-12-10T15:59:50.509000Z");
    dto.setEdited("2014-12-20T21:17:50.323000Z");
    Set<String> filmes = new HashSet<>();
    filmes.add("https://swapi.dev/api/films/1/");
    dto.setFilms(filmes);



    when(this.peopleService.getPeopleById(1))
      .thenReturn(dto);

    given()
      .accept(ContentType.JSON)
    .when()
      .get("/pessoas/{id}", 1)
    .then()
      .statusCode(HttpStatus.OK.value());
  }
}
