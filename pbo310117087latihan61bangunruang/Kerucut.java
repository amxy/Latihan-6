package pbo310117087latihan61bangunruang;

/**
 *
 * @author amxyfa
 * Nama : Ahmad Maula
 * NIM  : 10117087
 * Kelas: IF-3
 */
public class Kerucut extends BangunRuang {
    private double r,t,s,volume;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }

    public double hitungSisiSelimut() {
        this.s = Math.sqrt((r*r)+(t*t));
        return this.s;
    }
    
    public double hitungVolume() {
        this.volume = (1 * 3.14 * r * r * t) / 3;
        return this.volume;
    }  
}
