package app.com.desafio.dto;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FilmDTO {

  @JsonAlias("title")
  @JsonProperty("titulo")
  private String title;

  @JsonAlias("episode_id")
  @JsonProperty("id_episodio")
  private Integer episodeID;  
  
  @JsonAlias("opening_crawl")
  @JsonProperty("introducao")
  private String openingCrawl;
  
  @JsonAlias("director")
  @JsonProperty("diretor")
  private String director;

  @JsonAlias("producer")
  @JsonProperty("produtor")
  private String producer;  
  private String url;

  @JsonAlias("created")
  @JsonProperty("data_criacao")
  private String created;

  @JsonAlias("edited")
  @JsonProperty("data_edicao")
  private String edited;
  
  
  @JsonAlias("release_date")
  @JsonProperty("data_lancamento")
  private LocalDate releaseDate;

  @JsonAlias("species")
  @JsonProperty("especies")
  private Set<String> species = new HashSet<>();

  @JsonAlias("starships")
  @JsonProperty("naves")
  private Set<String> starships = new HashSet<>();;

  @JsonAlias("vehicles")
  @JsonProperty("veiculos")
  private Set<String> vehicles = new HashSet<>();;

  @JsonAlias("planets")
  @JsonProperty("planetas")
  private Set<String> planets = new HashSet<>();;

  public String getTitle() {
    return this.title;
  }
  
  public void setTitle(String title) {
    this.title = title;
  }
  
  
  public Integer getEpisodeID() {
    return this.episodeID;
  }
  
  
  public void setEpisodeID(Integer episodeID) {
    this.episodeID = episodeID;
  }
  
  public String getOpeningCrawl() {
    return this.openingCrawl;
  }

  public void setOpeningCrawl(String openingCrawl) {
    this.openingCrawl = openingCrawl;
  }

  public String getDirector() {
    return this.director;
  }
  
  public void setDirector(String director) {
    this.director = director;
  }
  
  public String getProducer() {
    return this.producer;
  }

  public void setProducer(String producer) {
    this.producer = producer;
  }

  public String getUrl() {
    return this.url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getCreated() {
    return this.created;
  }
  
  public void setCreated(String created) {
    this.created = created;
  }
  
  public String getEdited() {
    return this.edited;
  }

  public void setEdited(String edited) {
    this.edited = edited;
  }

  public LocalDate getReleaseDate() {
    return this.releaseDate;
  }

  public void setReleaseDate(LocalDate releaseDate) {
    this.releaseDate = releaseDate;
  }

  public Set<String> getSpecies() {
    return this.species;
  }

  public void setSpecies(Set<String> species) {
    this.species = species;
  }
  
  public Set<String> getStarships() {
    return this.starships;
  }

  public void setStarships(Set<String> starships) {
    this.starships = starships;
  }
  
  public Set<String> getVehicles() {
    return this.vehicles;
  }

  public void setVehicles(Set<String> vehicles) {
    this.vehicles = vehicles;
  }

  public Set<String> getPlanets() {
    return this.planets;
  }

  public void setPlanets(Set<String> planets) {
    this.planets = planets;
  }

}
