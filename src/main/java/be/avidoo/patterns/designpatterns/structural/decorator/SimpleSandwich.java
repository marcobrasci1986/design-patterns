package be.avidoo.patterns.designpatterns.structural.decorator;

/**
 * Concrete Component
 */
public class SimpleSandwich implements Sandwich{

    @Override
    public String make() {
        return "Simple Sandwich";
    }
}
