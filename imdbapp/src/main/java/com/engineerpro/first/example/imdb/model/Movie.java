package com.engineerpro.first.example.imdb.model;

public class Movie {
  private int id;
  private String title;

  public Movie(int id, String title) {
    this.id = id;
    this.title = title;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "{" +
        " id='" + getId() + "'" +
        ", title='" + getTitle() + "'" +
        "}";
  }

}
