package be.avidoo.patterns.designpatterns.structural.bridge;

import java.util.List;

/**
 * Abstraction
 */
public interface Formatter {

    String format(String header, List<Detail> details);
}
