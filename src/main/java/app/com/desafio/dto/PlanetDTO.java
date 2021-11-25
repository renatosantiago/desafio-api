package app.com.desafio.dto;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PlanetDTO {

  @JsonAlias("name")
  @JsonProperty("nome")
  private String name;

  @JsonAlias("diameter")
  @JsonProperty("diametro")
  private String diameter;

  @JsonAlias("rotation_period")
  @JsonProperty("periodo_rotacao")
  private String rotationPeriod;

  @JsonAlias("orbital_period")
  @JsonProperty("periodo_orbita")
  private String orbitalPeriod;

  @JsonAlias("gravity")
  @JsonProperty("gravidade")
  private String gravity;

  @JsonAlias("population")
  @JsonProperty("populacao")
  private String population;

  @JsonAlias("climate")
  @JsonProperty("clima")
  private String climate;

  @JsonAlias("terrain")
  @JsonProperty("terreno")
  private String terrain;

  @JsonAlias("surface_water")
  @JsonProperty("superfice_aqutica")
  private String surfaceWater;

  private String url;

  @JsonAlias("created")
  @JsonProperty("data_criacao")
  private String created;

  @JsonAlias("edited")
  @JsonProperty("data_edicao")
  private String edited;

  @JsonAlias("films")
  @JsonProperty("filmes")
  private Set<String> films;

  @JsonAlias("residents")
  @JsonProperty("residentes")
  private Set<String> residents;


  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDiameter() {
    return this.diameter;
  }

  public void setDiameter(String diameter) {
    this.diameter = diameter;
  }

  public String getRotationPeriod() {
    return this.rotationPeriod;
  }

  public void setRotationPeriod(String rotationPeriod) {
    this.rotationPeriod = rotationPeriod;
  }

  public String getOrbitalPeriod() {
    return this.orbitalPeriod;
  }

  public void setOrbitalPeriod(String orbitalPeriod) {
    this.orbitalPeriod = orbitalPeriod;
  }

  public String getGravity() {
    return this.gravity;
  }

  public void setGravity(String gravity) {
    this.gravity = gravity;
  }

  public String getPopulation() {
    return this.population;
  }

  public void setPopulation(String population) {
    this.population = population;
  }

  public String getClimate() {
    return this.climate;
  }

  public void setClimate(String climate) {
    this.climate = climate;
  }

  public String getTerrain() {
    return this.terrain;
  }

  public void setTerrain(String terrain) {
    this.terrain = terrain;
  }

  public String getSurfaceWater() {
    return this.surfaceWater;
  }

  public void setSurfaceWater(String surfaceWater) {
    this.surfaceWater = surfaceWater;
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

  public Set<String> getFilms() {
    return this.films;
  }

  public void setFilms(Set<String> films) {
    this.films = films;
  }

  public Set<String> getResidents() {
    return this.residents;
  }

  public void setResidents(Set<String> residents) {
    this.residents = residents;
  }

}
