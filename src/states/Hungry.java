package states;

import UI.Tamagotchi;

public class Hungry extends State {

    public Hungry(Tamagotchi tamagotchi) {
        super(tamagotchi);
    }

    @Override
    public String play() {
        return "No quiero jugar!";
    }

    @Override
    public String feed() {
        tamagotchi.changeState(new Bored(tamagotchi));
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

}