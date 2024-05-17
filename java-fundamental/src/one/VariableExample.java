package one;

class MovieGenre {
  // static variables
  public static final String ACTION = "ACTION";
  public static final String DRAMA = "DRAMA";
}

class NetflixMovie {
  public static final String STREAMING_SERVICE = "NETFLIX";
  // instance variables
  String movieGenre;
  String name;

  public String getPresentation() {
    // local variables
    String presentation = movieGenre + ":" + name;
    return presentation;
  }
}

public class VariableExample {
  public static void main(String[] args) {
    NetflixMovie movie = new NetflixMovie();
    movie.movieGenre = MovieGenre.ACTION;
    movie.name = "Stranger Things";
    // System.out.println(movie.name);

    System.out.println(movie.getPresentation());
  }
}
