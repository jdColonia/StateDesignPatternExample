package states;

import UI.Tamagotchi;

import java.util.Timer;
import java.util.TimerTask;

public class Sleeping extends State {

    public Sleeping(Tamagotchi tamagotchi) {
        super(tamagotchi);
    }

    @Override
    public String play() {
        return "";
    }

    @Override
    public String feed() {
        return "";
    }

    @Override
    public String sleep() {
        return "";
    }

    @Override
    public String howAreYou() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Sleeping.this.tamagotchi.changeState(new Hungry(tamagotchi));
            }
        }, 3000);
        return "Está durmiendo!!!";
    }

}