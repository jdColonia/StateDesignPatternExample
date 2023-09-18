package states;

import UI.Tamagotchi;

public class Tired extends State {

    public Tired(Tamagotchi tamagotchi) {
        super(tamagotchi);
    }

    @Override
    public void play() {
        System.out.println("No quiero jugar!");
    }

    @Override
    public void feed() {
        System.out.println("No quiero comer!");
    }

    @Override
    public void sleep() {
        System.out.println("Buenas noches!!!");
        tamagotchi.changeState(new Sleeping(tamagotchi));
    }

    @Override
    public void howAreYou() {
        System.out.println("Tengo sueño!");
    }

}
