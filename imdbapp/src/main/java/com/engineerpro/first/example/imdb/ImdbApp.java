package com.engineerpro.first.example.imdb;

import com.engineerpro.first.example.imdb.business.RatingBusinessLogic;
// import com.engineerpro.first.example.imdb.model.Movie;
import com.engineerpro.first.example.imdb.model.Movie;
import com.engineerpro.first.example.imdb.model.User;
import com.engineerpro.first.example.imdb.repository.InMemoryRatingRepository;
import com.engineerpro.first.example.imdb.repository.RatingRepositoryInterface;

public class ImdbApp {

	public static void main(String[] args) throws Exception {
		User alice = new User(1, "Alice", "female");
		// System.out.println(alice);

		User bob = new User(2, "Bob", "male");
		// System.out.println(bob);

		Movie spiderMan = new Movie(101, "Spiderman");
		Movie batman = new Movie(102, "Batman");
		Movie superMan = new Movie(103, "Superman");
		// System.out.println(spiderMan);

		RatingRepositoryInterface inMemoryRatingRepository = new InMemoryRatingRepository();

		// usually already have in the repository
		inMemoryRatingRepository.addMovie(spiderMan);
		inMemoryRatingRepository.addMovie(batman);
		inMemoryRatingRepository.addMovie(superMan);

		// start here is business logic
		RatingBusinessLogic businessLogic = new RatingBusinessLogic(inMemoryRatingRepository);
		businessLogic.rateMovie(alice, 101, 5);
		businessLogic.rateMovie(alice, 102, 2);
		businessLogic.rateMovie(alice, 103, 3);

		businessLogic.rateMovie(bob, 101, 2);
		businessLogic.rateMovie(bob, 102, 5);

		System.out.println("Alice ratings:" + businessLogic.getUserRatedMovies(alice));
		System.out.println("Bob ratings:" + businessLogic.getUserRatedMovies(bob));
		System.out.println(bob);
	}

}
