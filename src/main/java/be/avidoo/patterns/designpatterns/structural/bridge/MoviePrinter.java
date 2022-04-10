package be.avidoo.patterns.designpatterns.structural.bridge;

import java.util.ArrayList;
import java.util.List;

/**
 * Bridge between Movie and Formatter
 */
public class MoviePrinter extends Printer {

    private final Movie movie;

    public MoviePrinter(Movie movie) {
        this.movie = movie;
    }

    @Override
    protected List<Detail> getDetails() {
        List<Detail> details = new ArrayList<>();
        details.add(new Detail("Title", this.movie.getTitle()));
        details.add(new Detail("Year", this.movie.getYear()));

        return details;
    }

    @Override
    protected String getHeader() {
        return this.movie.getTitle();
    }
}
