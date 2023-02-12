import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MovieManagerImpl implements MovieManager{
    //створення списку movies
    private List<Movie> movies = new ArrayList<>();

    //гетер та сетер для класу movies
    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    //метод додавання фільмів
    @Override
    public void addNewMovie(Movie movie){
        movies.add(movie);
    }

    //Виведеня списку з назвами фільмів
    @Override
    public void displayAllMovieTitles(){
        for (int i =0; i<movies.size(); i++){
            System.out.println(movies.get(i).getTitle());
        }
    }

//    @Override
//    public boolean isMovieInTheList(String title){
//        for(int i = 0; i<3; i++) {
//            boolean film;
//            if (movies[i].equals(title)) {
//                film = true;
//            } else {
//                film = false;
//            }
//            return film;
//        }
//        boolean films = false;
//        return films;
//    }

    @Override
    public void searchMoviesByDirector(String director) {
        List<Movie> newMovieList = movies
                .stream()
                .filter(movie -> movie.getDirector().equalsIgnoreCase(director))
                .collect(Collectors.toList());
        if (newMovieList.isEmpty()) {
            System.out.println("Фільмів такого автора немає");
        }
        printMovieInfo(newMovieList);
    }

    @Override
    public void searchMoviesByGenre(String genre) {
        List<Movie> newMovieList = movies
                .stream()
                .filter(movie -> movie.getGenre().equalsIgnoreCase(genre))
                .collect(Collectors.toList());
        if (newMovieList.isEmpty()) {
            System.out.println("Фільмів такого жанру немає");
        }
        printMovieInfo(newMovieList);
    }

    @Override
    public void sortMoviesByTitlesAscending() {
        List<Movie> newMovieList = movies
                .stream()
                .sorted((movie1, movie2) -> movie1.getTitle().compareTo(movie2.getTitle()))
                .collect(Collectors.toList());

        printMovieInfo(newMovieList);
    }

    @Override
    public void sortMoviesByTitlesDescending() {
        List<Movie> newMovieList = movies
                .stream()
                .sorted((movie1, movie2) -> movie2.getTitle().compareTo(movie1.getTitle()))
                .collect(Collectors.toList());
        printMovieInfo(newMovieList);
    }

    @Override
    public void sortMoviesByYearAscending() {
        List<Movie> newMovieList = movies
                .stream()
                .sorted((movie1, movie2) -> movie1.getYear() - movie2.getYear())
                .collect(Collectors.toList());
        printMovieInfo(newMovieList);
    }

    @Override
    public void sortMoviesByYearDescending() {
        List<Movie> newMovieList = movies
                .stream()
                .sorted((movie1, movie2) -> movie2.getYear() - movie1.getYear())
                .collect(Collectors.toList());
        printMovieInfo(newMovieList);
    }

    private void printMovieInfo(List<Movie> movies) {
        for (Movie movie : movies) {
            movie.displayMovieInfo();
        }
    }

    @Override
    public boolean isMovieInTheList(String title) {
        for (Movie movie : movies) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                movie.displayMovieInfo();
                return true;
            }
        }
        System.out.println("Фільму з такою назвою в немає.");
        return false;
    }
}
