package pbo310117087latihan62livingthing;

/**
 *
 * @author amxyfa
 * Nama : Ahmad Maula
 * NIM  : 10117087
 * Kelas: IF-3
 */
public abstract class LivingThing {
    public abstract void walk (String nama);
    public void breath(String nama){
        System.out.println(nama+" Bernafas");
    }
    public void eat(String nama){
        System.out.println(nama+" Makan");
    }
    
}
