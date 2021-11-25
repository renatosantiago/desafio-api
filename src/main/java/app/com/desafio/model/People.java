package app.com.desafio.model;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;

public class People {
  private String name;
  private String birthYear;
  private String eyeColor;
  private String gender;
  private String hairColor;
  private String height;
  private String mass;
  private String url;
  private String skinColor;
  private String homeWorld;
  private String created;
  private String edited;
  private Set<String> films;
  private Set<String> species;
  private Set<String> starShips;
  private Set<String> vehicles;


  @JsonProperty(value = "nome", access = JsonProperty.Access.READ_ONLY)
  public String getName() {
    return this.name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  @JsonProperty(value = "data_nascimento", access = JsonProperty.Access.READ_ONLY)
  public String getBirthYear() {
    return this.birthYear;
  }
  
  @JsonProperty(value = "birth_year", access = JsonProperty.Access.WRITE_ONLY)
  public void setBirthYear(String birthYear) {
    this.birthYear = birthYear;
  }
  
  @JsonProperty(value = "cor_olho", access = JsonProperty.Access.READ_ONLY)
  public String getEyeColor() {
    return this.eyeColor;
  }
  
  @JsonProperty(value = "eye_color ", access = JsonProperty.Access.WRITE_ONLY)
  public void setEyeColor(String eyeColor) {
    this.eyeColor = eyeColor;
  }

  @JsonProperty(value = "genero", access = JsonProperty.Access.READ_ONLY)
  public String getGender() {
    return this.gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  @JsonProperty(value = "cor_cabelo", access = JsonProperty.Access.READ_ONLY)
  public String getHairColor() {
    return this.hairColor;
  }
  
  @JsonProperty(value = "hair_color ", access = JsonProperty.Access.WRITE_ONLY)
  public void setHairColor(String hairColor) {
    this.hairColor = hairColor;
  }

  @JsonProperty(value = "altura", access = JsonProperty.Access.READ_ONLY)
  public String getHeight() {
    return this.height;
  }

  public void setHeight(String height) {
    this.height = height;
  }

  @JsonProperty(value = "peso", access = JsonProperty.Access.READ_ONLY)
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

  @JsonProperty(value = "cor_pele", access = JsonProperty.Access.READ_ONLY)
  public String getSkinColor() {
    return this.skinColor;
  }

  @JsonProperty(value = "skin_color", access = JsonProperty.Access.WRITE_ONLY)
  public void setSkinColor(String skinColor) {
    this.skinColor = skinColor;
  }

  @JsonProperty(value = "planeta_natal", access = JsonProperty.Access.READ_ONLY)
  public String getHomeWorld() {
    return this.homeWorld;
  }

  @JsonProperty(value = "homeworld", access = JsonProperty.Access.WRITE_ONLY)
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

  @JsonProperty(value = "filmes", access = JsonProperty.Access.READ_ONLY)
  public Set<String> getFilms() {
    return this.films;
  }
  
  public void setFilms(Set<String> films) {
    this.films = films;
  }
  
  @JsonProperty(value = "especies", access = JsonProperty.Access.READ_ONLY)
  public Set<String> getSpecies() {
    return this.species;
  }
  
  public void setSpecies(Set<String> species) {
    this.species = species;
  }
  
  @JsonProperty(value = "naves", access = JsonProperty.Access.READ_ONLY)
  public Set<String> getStarShips() {
    return this.starShips;
  }

  public void setStarShips(Set<String> starShips) {
    this.starShips = starShips;
  }

  @JsonProperty(value = "veiculos", access = JsonProperty.Access.READ_ONLY)
  public Set<String> getVehicles() {
    return this.vehicles;
  }

  public void setVehicles(Set<String> vehicles) {
    this.vehicles = vehicles;
  }


}
