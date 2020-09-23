
package bgl.relasiclass.tgs;
/**
 * Bima Gilang L
 */
public class Pemandu {
    private String nama;
    private int biaya;
    Pemandu (String nama, int biaya){
        this.nama = nama;
        this.biaya = biaya;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public void setBiaya(int biaya){
        this.biaya = biaya;
    }
    public int getBiaya(){
        return biaya;
    }
    public void info (){
        System.out.println("Nama Pilot\t\t: " + nama);
        System.out.println("Biaya\t\t\t: Rp." + biaya);
    }
}
