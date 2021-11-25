package app.com.desafio.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonAlias;


public class Film {
  private String title;

  @JsonAlias("episode_id")
  private Integer episodeID;
  
  
  @JsonAlias("opening_crawl")
  private String openingCrawl;
  
  private String director;
  private String producer;
  
  private String url;
  private String created;
  private String edited;
  
  
  @JsonAlias("release_date")
  private LocalDate releaseDate;
  private Set<String> species = new HashSet<>();
  private Set<String> starships = new HashSet<>();;
  private Set<String> vehicles = new HashSet<>();;
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
