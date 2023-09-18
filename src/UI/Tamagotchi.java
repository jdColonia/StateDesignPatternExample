package UI;

import states.Bored;
import states.State;

public class Tamagotchi {

    private State state;

    public Tamagotchi() {
        this.state = new Bored(this);
    }

    public void changeState(State estado) {
        this.state = estado;
    }

    public State getState() {
        return state;
    }

    public void feed() {
        this.state.feed();
    }

    public void sleep() {
        this.state.sleep();
    }

    public void play() {
        this.state.play();
    }

    public void howAreYou() {
        this.state.howAreYou();
    }

}