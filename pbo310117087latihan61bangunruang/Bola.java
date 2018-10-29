package pbo310117087latihan61bangunruang;

/**
 *
 * @author amxyfa
 * Nama : Ahmad Maula
 * NIM  : 10117087
 * Kelas: IF-3
 * 
 */
public class Bola extends BangunRuang {
    private double r;
    private double volume;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double hitungVolume() {
        this.volume = (4/3)*3.14*(r*r*r);
        return this.volume;
    }


}
    
