package states;

import UI.Tamagotchi;

public class Tired implements State {

    private Tamagotchi tamagotchi;

    public Tired() {

    }

    @Override
    public String play() {
        return "No quiero jugar!";
    }

    @Override
    public String feed() {
        return "No quiero comer!";
    }

    @Override
    public String sleep() {
        tamagotchi.changeState(new Sleeping());
        return "Buenas noches!!!";
    }

    @Override
    public String howAreYou() {
        return "Tengo sueño!";
    }

    @Override
    public void setTamagotchi(Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;
    }

}
