package lv.ugis.kustiba;

public class Elementi{
    public static int getSavinshY(int savinshY) {
        return savinshY;
    }

    public static int getSavinshIndeks(int savinshIndeks) {
        return savinshIndeks;
    }

    public static void setSavinshIndeks(Savinsh savinsh, int savinshIndeks) {
        savinsh.savinshIndeks = savinshIndeks;
    }

    public static int getSavinshX(int savinshX) {
        return savinshX;
    }

    public static void setSavinshX(Savinsh savinsh, int savinshX) {
        savinsh.savinshX = savinshX;
    }

    public static int getMoskisIndeks(int moskisIndeks) {
        return moskisIndeks;
    }

    public static int getMoskisX(int moskisX) {
        return moskisX;
    }

    public static void setMoskisX(Moskis moskis, int moskisX) {
        moskis.moskisX = moskisX;
    }

    public static int getIndeksX(int indeksX) {
        return indeksX;
    }

    public static void setIndeksX(Objekts objekts, int indeksX) {
        objekts.indeksX = indeksX;
    }

    public static int getX(int x) {
        return x;
    }

    public static void setX(Objekts objekts, int x) {
        if (x<50) {
            setX(objekts, 50);
        }
        else if (x>950){
            setX(objekts, 950);
        }
        objekts.x = x;
    }

    public static void setMoskisIndeks(Moskis moskis, int moskisIndeks) {
        moskis.moskisIndeks = moskisIndeks;
    }

    public void setSavinshY(Savinsh savinsh, int savinshY) {
        savinsh.savinshY = savinshY;
    }
}
