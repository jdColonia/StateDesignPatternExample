package states;

import UI.Tamagotchi;

public class Bored extends State {

    public Bored(Tamagotchi tamagotchi) {
        super(tamagotchi);
    }

    @Override
    public void play() {
        System.out.println("Juguemos!!!");
        tamagotchi.changeState(new Tired(tamagotchi));
    }

    @Override
    public void feed() {
        System.out.println("No quiero comer!");
    }

    @Override
    public void sleep() {
        System.out.println("No quiero dormir!");
    }

    @Override
    public void howAreYou() {
        System.out.println("Estoy aburrido. Quiero jugar!");
    }

}