package be.avidoo.patterns.designpatterns.behavioral.state;

public class FanHighState extends State {
    private final Fan fan;

    public FanHighState(Fan fan) {
        super();
        this.fan = fan;
    }


    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to off");
        this.fan.setState(this.fan.getFanOffState());
    }

    @Override
    public String toString() {
        return "Fan is high";
    }
}

