package lv.ugis.kustiba;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main extends JPanel implements ActionListener, KeyListener {
    Objekts objekts = new Objekts();
    Moskis moskis = new Moskis();
    Savinsh savinsh = new Savinsh();
    Timer tm = new Timer(10, this);
    Sound sound = new Sound(getClass().getClassLoader().getResource("Gun.wav"));

    public static void main(String[] args) {
       Sakums sakums = new Sakums();
        sakums.setVisible(true);
    }

    static void startGame() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setContentPane(new Main());
                frame.setLocation(500,100);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }

    public Main (){
        tm.start();
        addKeyListener(this);
        setFocusable(true);
        this.setPreferredSize(new Dimension(1000,800));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            objekts.move();
            moskis.move();
            savinsh.move();
            repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        objekts.draw(g);
        moskis.draw(g);

        if (Elementi.getSavinshY(savinsh.savinshY)>10 && Elementi.getSavinshY(savinsh.savinshY)<700)
            savinsh.draw(g);

        if (Elementi.getSavinshX(savinsh.savinshX) > Elementi.getMoskisX(moskis.moskisX)-20 && Elementi.getSavinshX(savinsh.savinshX) <
                Elementi.getMoskisX(moskis.moskisX)+80 && Elementi.getSavinshY(savinsh.savinshY) < 80)
            Elementi.setMoskisIndeks(moskis, 0);
    }

    @Override
    public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_RIGHT) Elementi.setIndeksX(objekts, 1);
            if (e.getKeyCode() == KeyEvent.VK_LEFT) Elementi.setIndeksX(objekts, -1);
            if (e.getKeyCode() == KeyEvent.VK_UP && Elementi.getSavinshIndeks(savinsh.savinshIndeks) == 0) {
                sound.start();
                Elementi.setSavinshIndeks(savinsh, 1);
                Elementi.setSavinshX(savinsh, Elementi.getX(objekts.x));
            }
    }

    @Override
    public void keyReleased(KeyEvent e) {
            Elementi.setIndeksX(objekts, 0);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
}
