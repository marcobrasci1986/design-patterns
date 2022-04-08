package be.avidoo.patterns.designpatterns.behavioral.state;

public class FanMedState extends State {
    private final Fan fan;

    public FanMedState(Fan fan) {
        super();
        this.fan = fan;
    }


    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to high");
        this.fan.setState(this.fan.getFanHighState());
    }

    @Override
    public String toString() {
        return "Fan is med";
    }
}

