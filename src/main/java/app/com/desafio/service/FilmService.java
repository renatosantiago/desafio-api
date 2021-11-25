package app.com.desafio.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import app.com.desafio.dto.FilmDTO;
import app.com.desafio.dto.FilmWrapperDTO;
import app.com.desafio.service.exceptions.ResourceNotFoundException;
import app.com.desafio.webclient.FilmWebClient;


@Service
public class FilmService {

	@Autowired
	private FilmWebClient webClient;
  
  public FilmDTO getFilmById(Integer id) {
		try {
			return webClient.getFilmById(id);
		} catch (WebClientResponseException e) {
			throw new ResourceNotFoundException("resource not found");
		}
  }

	public FilmWrapperDTO getFilms() {
		return webClient.getFilms();
	}
}
