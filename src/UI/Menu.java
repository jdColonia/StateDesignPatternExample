package UI;

import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame {

    private Tamagotchi tamagotchi;
    private static JTextField textField = new JTextField();

    public Menu(Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;
    }

    public void init() {
        JFrame frame = new JFrame("Tamagotchi");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel context = new JPanel();
        context.setLayout(new BoxLayout(context, BoxLayout.Y_AXIS));
        frame.getContentPane().add(context);
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        context.add(textField);
        context.add(buttons);

        JButton feedButton = new JButton("Alimentar");
        feedButton.addActionListener(e -> textField.setText(tamagotchi.getState().feed()));
        JButton sleepButton = new JButton("Dormir");
        sleepButton.addActionListener(e -> textField.setText(tamagotchi.getState().sleep()));
        JButton playButton = new JButton("Jugar");
        playButton.addActionListener(e -> textField.setText(tamagotchi.getState().play()));
        JButton howAreYouButton = new JButton("¿Cómo estás?");
        howAreYouButton.addActionListener(e -> textField.setText(tamagotchi.getState().howAreYou()));
        frame.setVisible(true);
        frame.setSize(400, 100);
        buttons.add(feedButton);
        buttons.add(sleepButton);
        buttons.add(playButton);
        buttons.add(howAreYouButton);
    }

}