package pbo310117087latihan61bangunruang;

/**
 *
 * @author amxyfa
 * Nama : Ahmad Maula
 * NIM  : 10117087
 * Kelas: IF-3
 */
public class Tabung extends BangunRuang {
    private double r;
    private double h;
    private double volume;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double hitungVolume() {
        this.volume = 3.14 * r * r * h;
        return this.volume;
    }
    

}
