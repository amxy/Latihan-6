package pbo310117087latihan63gradiengarislurus;

/**
 *
 * @author amxyfa
 * Nama : Ahmad Maula
 * NIM  : 10117087
 * Kelas: IF-3
 */
public class Koordinat implements GarisLurus {
    private int x1,x2,y1,y2;

    public Koordinat (int x1,int x2,int y1,int y2){
    this.x1=x1;
    this.x2=x2;
    this.y1=y1;
    this.y2=y2;
    }

   
    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }
    
   
    public int hitungGradien(){
    int m= (y1 - y2) / (x1 - x2);
    return m;
    }
    
    
}
