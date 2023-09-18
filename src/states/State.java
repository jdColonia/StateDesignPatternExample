package states;

import UI.Tamagotchi;

public abstract class State {

    Tamagotchi tamagotchi;

    State(Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;
    }

    public abstract void play();

    public abstract void feed();

    public abstract void sleep();

    public abstract void howAreYou();

}
