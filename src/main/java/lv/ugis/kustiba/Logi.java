package lv.ugis.kustiba;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Logi extends JFrame implements ActionListener{

    public Logi() {
        JPanel panel = new JPanel();
        setSize(600,400);
        setLocation(600,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton yes = new JButton("Yes");
        JButton no = new JButton("No");
        yes.addActionListener(this);
        no.addActionListener(this);
        JLabel text = new JLabel("Vai spēlēsi vēl ?", SwingConstants.CENTER);

        text.setFont(new Font("Serif",Font.BOLD,32));
        panel.add(yes);
        panel.add(no);
        add(panel, BorderLayout.SOUTH);
        add(text);
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Yes"))
            dispose();
        else if (e.getActionCommand().equals("No"))
            System.exit(0);
    }
}
