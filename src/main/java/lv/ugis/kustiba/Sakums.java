package lv.ugis.kustiba;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sakums extends JFrame implements ActionListener{
    Sound sound = new Sound(getClass().getClassLoader().getResource("sakums.wav"));

    public Sakums() {
        JPanel panel = new JPanel();
        setSize(800,600);
        setLocation(600,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton start = new JButton("Start");
        start.addActionListener( this);
        JLabel text = new JLabel("ALIEN INVASION", SwingConstants.CENTER);

        text.setFont(new Font("Serif",Font.BOLD,42));
        panel.add(start);
        add(panel, BorderLayout.SOUTH);
        add(text);
        sound.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Start")) {
            dispose();
            sound.stop();
            Main.startGame();
        }
    }
}
