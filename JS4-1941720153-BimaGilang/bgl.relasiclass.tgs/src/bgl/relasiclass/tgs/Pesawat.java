
package bgl.relasiclass.tgs;
/**
 * BimaGilang
 */
public class Pesawat {
    private String nama;
    private int kuota;
    Pesawat (String nama, int kuota){
        this.nama = nama;
        this.kuota = kuota;
    }
    public void setNama (String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public void getKuota(int kuota){
        this.kuota = kuota;
    }
    public int getKuota (){
        return kuota;
    }
    public void hitungKuota (int kuota){
        this.kuota -= kuota;
    }
    public void info(){
        System.out.println("\nXXXXX Pesawat XXXXX");
        System.out.println("Nama Pesawat\t: " + nama);
        System.out.println("Kuota Tersisa\t: " + kuota + "kursi");
    }
}
