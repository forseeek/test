public interface MovieManager {
    //метод addNewMovie без реалізації
    void addNewMovie(Movie movie);
//    boolean isMovieInTheList(String title);
    //метод displayAllMovieTitles без реалізації
    void displayAllMovieTitles();
    void searchMoviesByDirector(String director);
    void searchMoviesByGenre(String genre);
    void sortMoviesByTitlesAscending();
    void sortMoviesByTitlesDescending();
    void sortMoviesByYearAscending();
    void sortMoviesByYearDescending();

    boolean isMovieInTheList(String title);
}
