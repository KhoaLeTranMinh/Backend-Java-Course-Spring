package com.engineerpro.first.example.imdb.business;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.engineerpro.first.example.imdb.exception.InvalidInputException;
import com.engineerpro.first.example.imdb.model.Movie;
import com.engineerpro.first.example.imdb.model.User;
import com.engineerpro.first.example.imdb.repository.RatingRepositoryInterface;

public class RatingBusinessLogic {
  private static final List<Integer> VALID_STAR_RATINGS = Arrays.asList(1, 2, 3, 4, 5);
  private RatingRepositoryInterface ratingRepository;

  public RatingBusinessLogic(RatingRepositoryInterface ratingRepository) {
    this.ratingRepository = ratingRepository;
  }

  public void rateMovie(User user, int movieId, int numberOfStar) throws Exception {
    if (!VALID_STAR_RATINGS.contains(numberOfStar)) {
      throw new InvalidInputException("Invalid number of star, a valid star must be in [1,2,3,4,5]");
    }
    if (!ratingRepository.hasMovie(movieId)) {
      throw new InvalidInputException("Invalid movieid=" + movieId);
    }
    ratingRepository.saveUserRating(user.getId(), movieId, numberOfStar);
  }

  public Map<Movie, Integer> getUserRatedMovies(User user) throws Exception {
    // userRatedMovies has key as movieId
    // and value as number of star
    Map<Integer, Integer> userRatedMovies = ratingRepository.getUserRatedMovies(user.getId());
    List<Integer> movieIds = new ArrayList<>();
    for (int movieId : userRatedMovies.keySet()) {
      movieIds.add(movieId);
    }
    List<Movie> userRatedMovieIds = ratingRepository.getMovieByIds(movieIds);

    Map<Movie, Integer> results = new HashMap<>();
    for (int movieId : userRatedMovies.keySet()) {
      int rating = userRatedMovies.get(movieId);
      Movie ratedMovie = userRatedMovieIds.stream().filter(movie -> movie.getId() == movieId).findFirst().get();
      results.put(ratedMovie, rating);
    }
    return results;
  }
}
