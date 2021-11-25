package app.com.desafio.dto;

import java.util.List;

public class PlanetWrapperDTO {
  private Integer count;
  private String next;
  private String previous;
  private List<PlanetDTO> results;


  public Integer getCount() {
    return this.count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public String getNext() {
    return this.next;
  }

  public void setNext(String next) {
    this.next = next;
  }

  public String getPrevious() {
    return this.previous;
  }

  public void setPrevious(String previous) {
    this.previous = previous;
  }

  public List<PlanetDTO> getResults() {
    return this.results;
  }

  public void setResults(List<PlanetDTO> results) {
    this.results = results;
  }

}
