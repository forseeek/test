import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Movie {
        //присовення значень змінних для даних фільму
        private String title;
        private String director;
        private String genre;
        private int year;

        //конструктор без параметрів
        public Movie(){

        }

        //сетери та гетери для значень фільму
        public String getTitle(){
            return this.title;
        }

        public String getDirector(){
            return this.director;
        }

        public String getGenre(){
            return this.genre;
        }

        public int getYear(){
            return this.year;
        }

        public void setTitle(String title){
            this.title = title;
        }

        public void setDirector(String director){
            this.director = director;
        }

        public void setGenre(String genre){
            this.genre = genre;
        }

        public void setYear(int year){
            this.year = year;
        }

        //метод для виведеня інформації про фільм
        public void displayMovieInfo(){
            System.out.println(this.title + ", made by " + this.director + ", was released in " + year + ".");
        }


}
