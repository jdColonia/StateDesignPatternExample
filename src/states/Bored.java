package states;

import UI.Tamagotchi;

public class Bored implements State {

    private Tamagotchi tamagotchi;

    public Bored() {

    }

    @Override
    public String play() {
        tamagotchi.changeState(new Tired());
        return "Juguemos!!!";
    }

    @Override
    public String feed() {
        return "No quiero comer!";
    }

    @Override
    public String sleep() {
        return "No quiero dormir!";
    }

    @Override
    public String howAreYou() {
        return "Estoy aburrido. Quiero jugar!";
    }

    @Override
    public void setTamagotchi(Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;
    }

}