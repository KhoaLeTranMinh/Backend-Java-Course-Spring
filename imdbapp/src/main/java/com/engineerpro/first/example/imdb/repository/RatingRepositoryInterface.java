package com.engineerpro.first.example.imdb.repository;

import java.util.List;
import java.util.Map;

import com.engineerpro.first.example.imdb.model.Movie;

public interface RatingRepositoryInterface {
  void saveUserRating(int userId, int movieId, int numberOfStar);
  void addMovie(Movie movie);
  boolean hasMovie(int movieId);
  List<Movie> getMovieByIds(List<Integer> movieIds);
  // key is movie id, and value is number of star
  Map<Integer, Integer> getUserRatedMovies(int userId);
}
