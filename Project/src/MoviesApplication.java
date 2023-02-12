import java.util.Scanner;

public class MoviesApplication{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

//        String[] movieTitles = new String[3];
//        String[] movieGenres = new String[3];
//        String[] movieDirectors = new String[3];
//        String[] movieYear = new String[3];

        //Введеня даних про три фільма
//        for (int i = 0; i < 3; i++){
//            System.out.println("Напишіть назву фільму");
//            movieTitles[i] = scanner.nextLine();
//
//            System.out.println("Напишіть жанр фільму");
//            movieGenres[i] = scanner.nextLine();
//
//            System.out.println("Напишіть режисера фільму");
//            movieDirectors[i] = scanner.nextLine();
//
//            System.out.println("Напишіть рік виходу фільму");
//            movieYear[i] = scanner.nextLine();
//        }
        //перевірка чи є у списку фільм Avatar
//        boolean isMoviePresent = isMovieInList(movieTitles, "Avatar");
//        System.out.println(isMoviePresent);

        //Задання значень для першого фільму через код
        Movie movie_one = new Movie();
        movie_one.setTitle("Jurassic World");
        movie_one.setGenre("Science-fiction");
        movie_one.setDirector("Colin Trevorrow");
        movie_one.setYear(2015);
//        movie_one.displayMovieInfo();

        //задання значень для другого фільму через клавіатуру
        Movie movie_two = new Movie();
//        movie_two.setTitle(scanner.nextLine());
//        movie_two.setGenre(scanner.nextLine());
//        movie_two.setDirector(scanner.nextLine());
//        movie_two.setYear(scanner.nextLine());
//        movie_two.displayMovieInfo();
        //задання значення назви для другого фільму через код
        movie_two.setTitle("Avatar");
        movie_two.setDirector("somebody");
        movie_two.setGenre("Science-fiction");
        movie_two.setYear(2009);

        //задання значення назви для третього фільму через код
        Movie movie_three = new Movie();
        movie_three.setTitle("Harry Potter and the Deathly Hallows: Part 1");
        movie_three.setDirector("David Yates");
        movie_three.setGenre("Fantasy");
        movie_three.setYear(2010);

        //задання назви четвертого фільму через код
        Movie movie_four = new Movie();
        movie_four.setTitle("Spider-Man: Far From Home");
        movie_four.setDirector("Jon Watts");
        movie_four.setGenre("Superhero movie");
        movie_four.setYear(2021);

        //додавання назв чотирьох фільмів до списку та виведення на єкран
        MovieManagerImpl movieManager = new MovieManagerImpl();
        movieManager.addNewMovie(movie_one);
        movieManager.addNewMovie(movie_two);
        movieManager.addNewMovie(movie_three);
        movieManager.addNewMovie(movie_four);
//        movieManager.displayAllMovieTitles();

//        movieManager.searchMoviesByDirector("Colin Trevorrow");
//        movieManager.searchMoviesByGenre("fantAsy");

//        System.out.println("Movies from the oldest to the newest");
//        System.out.println("----------------");
//        movieManager.sortMoviesByTitlesAscending();

//        System.out.println("Movies from the newest to the oldest");
//        System.out.println("----------------");
//        movieManager.sortMoviesByTitlesDescending();

        Menu menu = new Menu();
        menu.ShowOptions();
        menu.ChooseOption(movieManager);

    }

        //цикл для перевірки чи є фільм Avatar у списку
//    public static boolean isMovieInList(String[] movies, String title){
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
}