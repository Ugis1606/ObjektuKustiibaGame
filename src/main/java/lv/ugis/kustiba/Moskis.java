package lv.ugis.kustiba;

import java.awt.*;

public class Moskis extends Elementi{
    int moskisX = 200;
    int moskisIndeks = 1;
    int moskisSpeed = 3;
    int i;
    Logi logi = new Logi();

    public void draw(Graphics g) {
        if (getMoskisIndeks(moskisIndeks)==0 && i<70) {
            i++;
            if (i % 2 == 0)
                g.setColor(Color.red);
            else
                g.setColor(Color.black);
        }
        if (i == 70) {
            logi.setVisible(true);
            setMoskisIndeks(this,1);
            i = 0;
        }

        g.fillOval(getMoskisX(moskisX),30,100,50);
        g.drawOval(getMoskisX(moskisX)-20,50,30,30);
        g.drawOval(getMoskisX(moskisX)+90,50,30,30);
    }
    public void move (){

        if (getMoskisX(moskisX)>800)
            moskisIndeks = -1;
        else if (getMoskisX(moskisX)<50)
            moskisIndeks = 1;

        setMoskisX(this, getMoskisX(moskisX) + moskisSpeed * getMoskisIndeks(moskisIndeks));
    }
}
