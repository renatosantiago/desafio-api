package app.com.desafio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import app.com.desafio.dto.PlanetDTO;
import app.com.desafio.dto.PlanetWrapperDTO;
import app.com.desafio.service.exceptions.ResourceNotFoundException;
import app.com.desafio.webclient.PlanetWebClient;

@Service
public class PlanetService {
  
  @Autowired
  private PlanetWebClient webClient;

  public PlanetDTO getPlanetById(Integer id) {
    try {
      return webClient.getPlanetById(id);
    } catch (WebClientResponseException e) {
      throw new ResourceNotFoundException("resource not found");
    }
  }

  public PlanetWrapperDTO getPlanets() {
    return webClient.getPlanets();
  }
}
