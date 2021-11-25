package app.com.desafio.dto;

import java.util.List;

public class FilmWrapperDTO {
  private Integer count;
  private String next;
  private String previous;
  private List<FilmDTO> results;


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

  public List<FilmDTO> getResults() {
    return this.results;
  }

  public void setResults(List<FilmDTO> results) {
    this.results = results;
  }

}
