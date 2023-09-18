package states;

import UI.Tamagotchi;

public abstract class State {

    Tamagotchi tamagotchi;

    State(Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;
    }

    public abstract String play();

    public abstract String feed();

    public abstract String sleep();

    public abstract String howAreYou();

}
