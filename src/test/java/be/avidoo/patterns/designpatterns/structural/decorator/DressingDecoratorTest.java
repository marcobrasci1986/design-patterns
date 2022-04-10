package be.avidoo.patterns.designpatterns.structural.decorator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DressingDecoratorTest {

    @Test
    void decorators() {
        SimpleSandwich simpleSandwich = new SimpleSandwich();
        assertThat(simpleSandwich.make()).hasToString("Simple Sandwich");

        MeatDecorator meatDecorator = new MeatDecorator(simpleSandwich);
        assertThat(meatDecorator.make()).hasToString("Simple Sandwich + turkey");

        DressingDecorator dressingDecorator = new DressingDecorator(simpleSandwich);
        assertThat(dressingDecorator.make()).hasToString("Simple Sandwich + mustard");

        SandwichDecorator masterSandwich = new DressingDecorator(meatDecorator);
        assertThat(masterSandwich.make()).hasToString("Simple Sandwich + turkey + mustard");
    }
}
