package movies;

public class Movie {

    private String name, category;

    public Movie(String name, String category) {
        this.setName(name);
        this.setCategory(category);
    }

    public String getName() {
        return this.name;
    }

    public String getCategory() {
        return this.category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
