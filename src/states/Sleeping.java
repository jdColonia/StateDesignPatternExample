package states;

import UI.Tamagotchi;

import java.util.Timer;
import java.util.TimerTask;

public class Sleeping implements State {

    private Tamagotchi tamagotchi;

    public Sleeping() {

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
                Sleeping.this.tamagotchi.changeState(new Hungry());
            }
        }, 3000);
        return "Está durmiendo!!!";
    }

    @Override
    public void setTamagotchi(Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;
    }

}