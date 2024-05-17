package com.engineerpro.first.example.imdb.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.engineerpro.first.example.imdb.model.Movie;

/**
 * A repository to save all rating data in memory
 */
public class InMemoryRatingRepository implements RatingRepositoryInterface {
  // movieMap has key as movieId
  // and value has movie object
  private static final Map<Integer, Movie> movieMap = new HashMap<>();
  // userRating has key as userId
  // and value as a map of movieId and number of star
  private static final Map<Integer, Map<Integer, Integer>> userRatingMap = new HashMap<>();

  @Override
  public void saveUserRating(int userId, int movieId, int numberOfStar) {
    if (!userRatingMap.containsKey(userId)) {
      userRatingMap.put(userId, new HashMap<>());
    }
    userRatingMap.get(userId).put(movieId, numberOfStar);
  }

  @Override
  public void addMovie(Movie movie) {
    movieMap.put(movie.getId(), movie);
  }

  @Override
  public boolean hasMovie(int movieId) {
    return movieMap.containsKey(movieId);
  }

  @Override
  public List<Movie> getMovieByIds(List<Integer> movieIds) {
    List<Movie> results = new ArrayList<>();
    for (int movieId : movieIds) {
      if (!hasMovie(movieId)) {
        throw new RuntimeException("Cannot find movie with id=" + movieId);
      }
      Movie movie = movieMap.get(movieId);
      results.add(movie);
    }
    return results;
  }

  @Override
  public Map<Integer, Integer> getUserRatedMovies(int userId) {
    if (!userRatingMap.containsKey(userId)) {
      return new HashMap<>();
    }
    return userRatingMap.get(userId);
  }

}
