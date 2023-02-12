import java.util.Scanner;

public class Menu {

    public void ShowOptions() {
        System.out.println("Вивести усі фільми -> 1");
        System.out.println("Додати фільм -> 2");
        System.out.println("Вивести інформацію про фільм -> 3");
        System.out.println("Пошук усіх фільмів по автору -> 4");
        System.out.println("Пошук усіх фільмів по жанру -> 5");
        System.out.println("Сортувати фільми від найстарішого до найновішого -> 6");
        System.out.println("Сортувати фільми від найновішого до найстарішого -> 7");
        System.out.println("Сортувати фільми по алфавіту -> 8");
        System.out.println("Сортувати фільми по алфавіту в зворотному порядку -> 9");
        System.out.println("Завершити -> x");
    }

    public void ChooseOption(MovieManagerImpl movieManager){
        Scanner scanner = new Scanner(System.in);
        String choice ="";
        while(!choice.equalsIgnoreCase("x")){
            System.out.println("Оберіть дію:");
            choice = scanner.nextLine();
            switch (choice){
                case "1":
                    movieManager.displayAllMovieTitles();
                    displayDivider();
                    break;
                case "2":
                    Movie newMovie = createNewMovie();
                    movieManager.addNewMovie(newMovie);
                    displayDivider();
                    break;
                case "3":
                    System.out.println("Напишіть назву фільму");
                    String movieTitle = scanner.nextLine();
                    movieManager.isMovieInTheList(movieTitle);
                    displayDivider();
                    break;
                case "4":
                    String director;
                    System.out.println("Напишіть ім'я режисера/режисерки:");
                    director = scanner.nextLine();
                    movieManager.searchMoviesByDirector(director);
                    displayDivider();
                    break;
                case "5":
                    String genre;
                    System.out.println("Напишіть жанр фільму");
                    genre = scanner.nextLine();
                    movieManager.searchMoviesByGenre(genre);
                    displayDivider();
                    break;
                case "6":
                    movieManager.sortMoviesByYearAscending();
                    displayDivider();
                    break;
                case "7":
                    movieManager.sortMoviesByYearDescending();
                    displayDivider();
                    break;
                case "8":
                    movieManager.sortMoviesByTitlesAscending();
                    displayDivider();
                    break;
                case "9":
                    movieManager.sortMoviesByTitlesDescending();
                    displayDivider();
                    break;
                case "x":
                    System.out.println("Кінець програми");
                    break;
                default:
                    System.out.println("Такої дії не існує");
                    displayDivider();
                    break;
            }
        }
    }

    private Movie createNewMovie() {
        String title;
        String director;
        String genre;
        String year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишіть назву фільму");
        title = scanner.nextLine();
        System.out.println("Напишіть режисера фільму");
        director = scanner.nextLine();
        System.out.println("Напишіть жанр фільму");
        genre = scanner.nextLine();
        System.out.println("Напишіть рік виходу фільму");
        year = scanner.nextLine();
        Movie newMovie = new Movie();
        newMovie.setTitle(title);
        newMovie.setDirector(director);
        newMovie.setGenre(genre);
        newMovie.setYear(Integer.parseInt(year));
        return newMovie;
    }

    private void displayDivider(){
        System.out.println("------------------------------");
    }
}
