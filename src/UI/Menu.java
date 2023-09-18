package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {

    private Tamagotchi tamagotchi;
    private JButton feedButton, sleepButton, playButton, howAreYouButton;

    public Menu(Tamagotchi tamagochi) {
        this.tamagotchi = tamagochi;
    }

    public void init() {

        // Crear botones
        feedButton = new JButton("Alimentar");
        sleepButton = new JButton("Dormir");
        playButton = new JButton("Jugar");
        howAreYouButton = new JButton("¿Cómo estás?");

        // Añadir listeners a los botones
        feedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tamagotchi.feed();
            }
        });

        sleepButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tamagotchi.sleep();
            }
        });

        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tamagotchi.play();
            }
        });

        howAreYouButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tamagotchi.howAreYou();
            }
        });

        // Añadir botones al panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));
        panel.add(feedButton);
        panel.add(sleepButton);
        panel.add(playButton);
        panel.add(howAreYouButton);

        // Configurar el marco
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel);
        this.pack();
        this.setVisible(true);

    }

}