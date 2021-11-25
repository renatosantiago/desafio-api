package app.com.desafio.webclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import app.com.desafio.dto.PeopleDTO;
import app.com.desafio.dto.PeopleWrapperDTO;

@Component
public class PeopleWebClient {

  @Autowired
  private WebClient webClient;

  public PeopleDTO getPeopleById(Integer id) {
    return webClient
            .get()
            .uri("https://swapi.dev/api/people/{id}", id)
            .retrieve()
            .bodyToMono(PeopleDTO.class)
            .block();
  }

  public PeopleWrapperDTO getPeoples() {
    return webClient
            .get()
            .uri("https://swapi.dev/api/people")
            .retrieve()
            .bodyToMono(PeopleWrapperDTO.class)
            .block();
  }

}
