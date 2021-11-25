package app.com.desafio.webclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import app.com.desafio.dto.PlanetDTO;
import app.com.desafio.dto.PlanetWrapperDTO;

@Component
public class PlanetWebClient {

  @Autowired
  private WebClient webClient;
  
  public PlanetDTO getPlanetById(Integer id) {
    return webClient
            .get()
            .uri("https://swapi.dev/api/planets/{id}", id)
            .retrieve()
            .bodyToMono(PlanetDTO.class)
            .block();
  }

  public PlanetWrapperDTO getPlanets() {
    return webClient
            .get()
            .uri("https://swapi.dev/api/planets")
            .retrieve()
            .bodyToMono(PlanetWrapperDTO.class)
            .block();
  }
}
