package app.com.desafio.dto;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PeopleDTO {

  @JsonAlias("name")
  @JsonProperty("nome")
  private String name;

  @JsonAlias("birth_year")
  @JsonProperty("ano_nascimento")
  private String birthYear;

  @JsonAlias("eye_color")
  @JsonProperty("cor_olho")
  private String eyeColor;

  @JsonAlias("gender")
  @JsonProperty("genero")
  private String gender;

  @JsonAlias("hair_color")
  @JsonProperty("cor_cabelo")
  private String hairColor;

  @JsonAlias("height")
  @JsonProperty("altura")
  private String height;

  @JsonAlias("mass")
  @JsonProperty("peso")
  private String mass;

  private String url;

  @JsonAlias("skin_color")
  @JsonProperty("cor_pele")
  private String skinColor;

  @JsonAlias("homeworld")
  @JsonProperty("planeta_natal")
  private String homeWorld;

  @JsonAlias("created")
  @JsonProperty("data_criacao")
  private String created;

  @JsonAlias("edited")
  @JsonProperty("data_edicao")
  private String edited;

  @JsonAlias("films")
  @JsonProperty("filmes")
  private Set<String> films;

  @JsonAlias("species")
  @JsonProperty("especies")
  private Set<String> species;

  @JsonAlias("starships")
  @JsonProperty("naves")
  private Set<String> starShips;

  @JsonAlias("vehicles")
  @JsonProperty("veiculos")
  private Set<String> vehicles;


  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBirthYear() {
    return this.birthYear;
  }

  public void setBirthYear(String birthYear) {
    this.birthYear = birthYear;
  }

  public String getEyeColor() {
    return this.eyeColor;
  }

  public void setEyeColor(String eyeColor) {
    this.eyeColor = eyeColor;
  }

  public String getGender() {
    return this.gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getHairColor() {
    return this.hairColor;
  }

  public void setHairColor(String hairColor) {
    this.hairColor = hairColor;
  }

  public String getHeight() {
    return this.height;
  }

  public void setHeight(String height) {
    this.height = height;
  }

  public String getMass() {
    return this.mass;
  }

  public void setMass(String mass) {
    this.mass = mass;
  }

  public String getUrl() {
    return this.url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getSkinColor() {
    return this.skinColor;
  }

  public void setSkinColor(String skinColor) {
    this.skinColor = skinColor;
  }

  public String getHomeWorld() {
    return this.homeWorld;
  }

  public void setHomeWorld(String homeWorld) {
    this.homeWorld = homeWorld;
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

  public Set<String> getFilms() {
    return this.films;
  }

  public void setFilms(Set<String> films) {
    this.films = films;
  }

  public Set<String> getSpecies() {
    return this.species;
  }

  public void setSpecies(Set<String> species) {
    this.species = species;
  }

  public Set<String> getStarShips() {
    return this.starShips;
  }

  public void setStarShips(Set<String> starShips) {
    this.starShips = starShips;
  }

  public Set<String> getVehicles() {
    return this.vehicles;
  }

  public void setVehicles(Set<String> vehicles) {
    this.vehicles = vehicles;
  }

}
