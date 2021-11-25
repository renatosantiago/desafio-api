package app.com.desafio.webclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import app.com.desafio.dto.FilmDTO;
import app.com.desafio.dto.FilmWrapperDTO;

@Component
public class FilmWebClient {
  
  @Autowired
  private WebClient webClient;

  public FilmDTO getFilmById(Integer id) {
      return webClient
              .get()
              .uri("https://swapi.dev/api/films/{id}", id)
              .retrieve()
              .bodyToMono(FilmDTO.class)
              .block();
    
  }

  public FilmWrapperDTO getFilms() {
		return webClient
						.get()
						.uri("https://swapi.dev/api/films/")
						.retrieve()
						.bodyToMono(FilmWrapperDTO.class)
						.block();
	}
}
