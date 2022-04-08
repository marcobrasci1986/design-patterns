package be.avidoo.patterns.designpatterns.behavioral.state;

public abstract class State {

    public void handleRequest() {
        throw new IllegalStateException("Should not arrive here");
    }
}
