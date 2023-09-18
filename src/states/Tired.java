package states;

import UI.Tamagotchi;

public class Tired extends State {

    public Tired(Tamagotchi tamagotchi) {
        super(tamagotchi);
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
        tamagotchi.changeState(new Sleeping(tamagotchi));
        return "Buenas noches!!!";
    }

    @Override
    public String howAreYou() {
        return "Tengo sueño!";
    }

}
