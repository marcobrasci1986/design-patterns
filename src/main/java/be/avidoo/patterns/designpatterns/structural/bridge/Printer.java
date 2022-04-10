package be.avidoo.patterns.designpatterns.structural.bridge;

import java.util.List;

/**
 * Printers and formatters are independent of each other
 */
public abstract class Printer {

    public String print(Formatter formatter){
        return formatter.format(getHeader(), getDetails());
    }

    protected abstract List<Detail> getDetails();

    protected abstract String getHeader();

}