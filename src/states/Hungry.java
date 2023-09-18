package states;

import UI.Tamagotchi;

public class Hungry extends State {

    public Hungry(Tamagotchi tamagotchi) {
        super(tamagotchi);
    }

    @Override
    public void play() {
        System.out.println("No quiero jugar!");
    }

    @Override
    public void feed() {
        System.out.println("Ñam ñan nañ!!!");
        tamagotchi.changeState(new Bored(tamagotchi));
    }

    @Override
    public void sleep() {
        System.out.println("No quiero dormir!");
    }

    @Override
    public void howAreYou() {
        System.out.println("Dame de comer. Tengo hambre!");
    }

}