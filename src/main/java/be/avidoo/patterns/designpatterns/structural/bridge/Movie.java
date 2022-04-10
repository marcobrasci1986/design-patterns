package be.avidoo.patterns.designpatterns.structural.bridge;

/**
 * Regular POJO
 */
public class Movie {

    private final String title;
    private final String year;

    public Movie(String title, String year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }
}
