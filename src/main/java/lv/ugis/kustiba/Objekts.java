package lv.ugis.kustiba;

import java.awt.*;

public class Objekts extends Elementi{
    int x = 400;
    int speed = 5;
    int indeksX = 0;

    public void draw(Graphics g) {
            g.drawRect(getX(x), 700, 20, 50);
            g.drawPolygon(new int[] {getX(x),getX(x)+20,getX(x)+10}, new int[] {700,700,690}, 3);
    }
    public void move (){
        setX(this, getX(x) + speed * getIndeksX(indeksX));
    }
}
