package lv.ugis.kustiba;

import java.awt.*;

public class Savinsh extends Elementi{
    int savinshY = 700;
    int savinshSpeed = 10;
    int savinshIndeks = 0;
    int savinshX;

    public void draw(Graphics g) {
        g.drawPolygon(new int[] {getSavinshX(savinshX),getSavinshX(savinshX) + 20,getSavinshX(savinshX) + 10},
        new int[] {getSavinshY(savinshY), getSavinshY(savinshY), getSavinshY(savinshY)-40}, 3);
    }

    public void move (){
        if (getSavinshY(savinshY)< 10){
            setSavinshY(this, 700);
            setSavinshIndeks(this, 0);
        }
        setSavinshY(this, getSavinshY(savinshY) - savinshSpeed * savinshIndeks);
    }
}
