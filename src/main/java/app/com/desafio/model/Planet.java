package app.com.desafio.model;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Planet {
  private String name;
  private String diameter;
  private String rotationPeriod;
  private String orbitalPeriod;
  private String gravity;
  private String population;
  private String climate;
  private String terrain;
  private String surfaceWater;
  private String url;
  private String created;
  private String edited;
  private Set<String> films;
  private Set<String> residents;


  @JsonProperty(value = "nome", access = JsonProperty.Access.READ_ONLY)
  public String getName() {
    return this.name;
  }

  @JsonProperty(value = "data_edicao", access = JsonProperty.Access.READ_ONLY)
  public String getEdited() {
    return edited;
  }

  public void setEdited(String edited) {
    this.edited = edited;
  }

  public void setName(String name) {
    this.name = name;
  }

  @JsonProperty(value = "diametro", access = JsonProperty.Access.READ_ONLY)
  public String getDiameter() {
    return this.diameter;
  }

  public void setDiameter(String diameter) {
    this.diameter = diameter;
  }

  @JsonProperty(value = "periodo_rotacao", access = JsonProperty.Access.READ_ONLY)
  public String getRotationPeriod() {
    return this.rotationPeriod;
  }

  @JsonProperty(value = "rotation_period", access = JsonProperty.Access.WRITE_ONLY)
  public void setRotationPeriod(String rotationPeriod) {
    this.rotationPeriod = rotationPeriod;
  }

  @JsonProperty(value = "orbital_period", access = JsonProperty.Access.READ_ONLY)
  public String getOrbitalPeriod() {
    return this.orbitalPeriod;
  }
  
  @JsonProperty(value = "orbital_period", access = JsonProperty.Access.WRITE_ONLY)
  public void setOrbitalPeriod(String orbitalPeriod) {
    this.orbitalPeriod = orbitalPeriod;
  }

  @JsonProperty(value = "gravidade", access = JsonProperty.Access.READ_ONLY)
  public String getGravity() {
    return this.gravity;
  }

  public void setGravity(String gravity) {
    this.gravity = gravity;
  }

  @JsonProperty(value = "populacao", access = JsonProperty.Access.READ_ONLY)
  public String getPopulation() {
    return this.population;
  }

  public void setPopulation(String population) {
    this.population = population;
  }

  @JsonProperty(value = "clima", access = JsonProperty.Access.READ_ONLY)
  public String getClimate() {
    return this.climate;
  }

  public void setClimate(String climate) {
    this.climate = climate;
  }

  @JsonProperty(value = "terreno", access = JsonProperty.Access.READ_ONLY)
  public String getTerrain() {
    return this.terrain;
  }

  public void setTerrain(String terrain) {
    this.terrain = terrain;
  }

  @JsonProperty(value = "superficie_aquatica", access = JsonProperty.Access.READ_ONLY)
  public String getSurfaceWater() {
    return this.surfaceWater;
  }

  @JsonProperty(value = "surface_water", access = JsonProperty.Access.WRITE_ONLY)
  public void setSurfaceWater(String surfaceWater) {
    this.surfaceWater = surfaceWater;
  }

  public String getUrl() {
    return this.url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @JsonProperty(value = "data_criacao", access = JsonProperty.Access.READ_ONLY)
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  @JsonProperty(value = "filmes", access = JsonProperty.Access.READ_ONLY)
  public Set<String> getFilms() {
    return this.films;
  }

  public void setFilms(Set<String> films) {
    this.films = films;
  }

  @JsonProperty(value = "residentes", access = JsonProperty.Access.READ_ONLY)
  public Set<String> getResidents() {
    return residents;
  }

  public void setResidents(Set<String> residents) {
    this.residents = residents;
  }


}
