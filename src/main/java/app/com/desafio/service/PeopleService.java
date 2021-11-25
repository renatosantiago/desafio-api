package app.com.desafio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import app.com.desafio.dto.PeopleDTO;
import app.com.desafio.dto.PeopleWrapperDTO;
import app.com.desafio.service.exceptions.ResourceNotFoundException;
import app.com.desafio.webclient.PeopleWebClient;

@Service
public class PeopleService {
  
  @Autowired
  PeopleWebClient webClient;

  public PeopleDTO getPeopleById(Integer id) {
    try {
      return webClient.getPeopleById(id);
    } catch (WebClientResponseException e) {
      throw new ResourceNotFoundException("resource not found");
    }
  }

  public PeopleWrapperDTO getPeoples() {
    return webClient.getPeoples();
  }
}
