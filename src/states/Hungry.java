package states;

import UI.Tamagotchi;

public class Hungry implements State {

    private Tamagotchi tamagotchi;

    public Hungry() {

    }

    @Override
    public String play() {
        return "No quiero jugar!";
    }

    @Override
    public String feed() {
        tamagotchi.changeState(new Bored());
        return "Ñam ñan nañ!!!";
    }

    @Override
    public String sleep() {
        return "No quiero dormir!";
    }

    @Override
    public String howAreYou() {
        return "Dame de comer. Tengo hambre!";
    }

    @Override
    public void setTamagotchi(Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;
    }

}