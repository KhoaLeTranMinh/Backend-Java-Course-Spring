package com.engineerpro.first.example.imdb.model;

// import lombok.Data;
// import lombok.Data;
import lombok.Data;

public @Data class User {
  private int id;
  private String name;
  private String gender;

  public User(int id, String name, String gender) {
    this.id = id;
    this.name = name;
    this.gender = gender;
  }

  // public int getId() {
  // return this.id;
  // }

  // public void setId(int id) {
  // this.id = id;
  // }

  // public String getName() {
  // return this.name;
  // }

  // public void setName(String name) {
  // this.name = name;
  // }

  // public String getGender() {
  // return this.gender;
  // }

  // public void setGender(String gender) {
  // this.gender = gender;
  // }

  // @Override
  // public String toString() {
  // return "{" +
  // " id='" + getId() + "'" +
  // ", name='" + getName() + "'" +
  // ", gender='" + getGender() + "'" +
  // "}";
  // }

}
