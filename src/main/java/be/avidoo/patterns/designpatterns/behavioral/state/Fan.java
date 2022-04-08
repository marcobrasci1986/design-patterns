package be.avidoo.patterns.designpatterns.behavioral.state;

public class Fan {
    State fanOffState;
    State fanLowState;
    State fanMedState;
    State fanHighState;

    State state;

    public Fan() {
        this.fanOffState = new FanOffState(this);
        this.fanLowState = new FanLowState(this);
        this.fanMedState = new FanMedState(this);
        this.fanHighState = new FanHighState(this);

        this.state = fanOffState;
    }

    public void pullChain() {
        state.handleRequest();
    }

    public State getFanOffState() {
        return fanOffState;
    }

    public State getFanLowState() {
        return fanLowState;
    }

    public State getFanMedState() {
        return fanMedState;
    }

    public State getFanHighState() {
        return fanHighState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    @Override
    public String toString() {
        return state.toString();
    }


}
