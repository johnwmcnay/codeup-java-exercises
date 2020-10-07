package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        String[] categories = MoviesArray.categoryList();

        do {

            byte index = 0;

            while (index < categories.length) {
                System.out.printf("%s - filter by %s\n", index, categories[index]);
                index++;
            }

            System.out.printf("%s - show all movies\n", index);
            System.out.printf("%s - exit\n\n", index + 1);

            int choice = input.getInt(0, index + 1, "Enter an option:");

            if (choice == index + 1) {
                break;
            } else if (choice == index) {
                printMovies(MoviesArray.findAll());
            } else {
                printMovies(MoviesArray.filterByCategory(categories[choice]));
            }
        } while (true);
    }

    public static void printMovies(Movie[] movieList) {

        System.out.println("\n====Movies====");
        for (Movie movie: movieList) {
            System.out.printf("%s - %s\n", movie.getName(), movie.getCategory());
        }
        System.out.print("==============\n");
    }
}
