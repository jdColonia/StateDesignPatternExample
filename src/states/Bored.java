package states;

import UI.Tamagotchi;

public class Bored extends State {

    public Bored(Tamagotchi tamagotchi) {
        super(tamagotchi);
    }

    @Override
    public String play() {
        tamagotchi.changeState(new Tired(tamagotchi));
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

}