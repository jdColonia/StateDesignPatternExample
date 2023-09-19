package UI;

import states.Bored;
import states.State;

public class Tamagotchi {

    private State state;

    public Tamagotchi() {
        changeState(new Bored());
    }

    public void changeState(State estado) {
        this.state = estado;
        this.state.setTamagotchi(this);
    }

    public State getState() {
        return state;
    }

}