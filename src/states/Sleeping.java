package states;

import UI.Tamagotchi;

import java.util.Timer;
import java.util.TimerTask;

public class Sleeping extends State {

    public Sleeping(Tamagotchi tamagotchi) {
        super(tamagotchi);
    }

    @Override
    public void play() {
    }

    @Override
    public void feed() {
    }

    @Override
    public void sleep() {
    }

    @Override
    public void howAreYou() {
        System.out.println("Está durmiendo!!!");

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Sleeping.this.tamagotchi.changeState(new Hungry(tamagotchi));
            }
        }, 7000);
    }

}