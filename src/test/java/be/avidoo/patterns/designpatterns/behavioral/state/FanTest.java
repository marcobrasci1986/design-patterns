package be.avidoo.patterns.designpatterns.behavioral.state;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FanTest {

    @Test
    void pullChain() {
        Fan fan = new Fan();

        assertThat(fan.getState()).isInstanceOf(FanOffState.class);

        fan.pullChain();
        assertThat(fan.getState()).isInstanceOf(FanLowState.class);

        fan.pullChain();
        assertThat(fan.getState()).isInstanceOf(FanMedState.class);

        fan.pullChain();
        assertThat(fan.getState()).isInstanceOf(FanHighState.class);

        fan.pullChain();
        assertThat(fan.getState()).isInstanceOf(FanOffState.class);
    }
}
