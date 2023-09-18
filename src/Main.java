import UI.Menu;
import UI.Tamagotchi;

public class Main {
    public static void main(String[] args) {
        Tamagotchi tamagotchi = new Tamagotchi();
        Menu menu = new Menu(tamagotchi);
        menu.init();
    }
}