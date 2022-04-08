package be.avidoo.patterns.designpatterns.decorator;

/**
 * Concrete Component
 */
public class SimpleSandwich implements Sandwich{

    @Override
    public String make() {
        return "Simple Sandwich";
    }
}
