package be.avidoo.patterns.designpatterns.decorator;

/**
 * Decorator
 *
 */
public abstract class SandwichDecorator implements Sandwich {

    protected Sandwich customSandwich;

    public SandwichDecorator(Sandwich customSandwich) {
        this.customSandwich = customSandwich;
    }

    @Override
    public String make() {
        return customSandwich.make();
    }
}
