package be.avidoo.patterns.designpatterns.behavioral.state;

public class FanOffState extends State {
    private final Fan fan;

    public FanOffState(Fan fan) {
        super();
        this.fan = fan;
    }


    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to low");
        this.fan.setState(this.fan.getFanLowState());
    }

    @Override
    public String toString() {
        return "Fan is off";
    }
}

