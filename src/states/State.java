package states;

import UI.Tamagotchi;

public interface State {

    public abstract String play();

    public abstract String feed();

    public abstract String sleep();

    public abstract String howAreYou();

    public void setTamagotchi(Tamagotchi tamagotchi);

}
