package be.avidoo.patterns.designpatterns.behavioral.state;

public class FanLowState extends State {
    private final Fan fan;

    public FanLowState(Fan fan) {
        super();
        this.fan = fan;
    }


    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to med");
        this.fan.setState(this.fan.getFanMedState());
    }

    @Override
    public String toString() {
        return "Fan is low";
    }
}

