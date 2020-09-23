package Tugas;
public class Makanan {
    private String nama;
    private int stok;
    Makanan(String nama, int stok){
        this.nama = nama;
        this.stok = stok;
    }
    
    public void setNama(String nama){
        this.nama = nama ;
    }
    public void setStok(int stok){
        this.stok = stok;
    }
    public String getNama(){
        return nama;
    }
    public int getStok(){
        return stok;
    }
    public void hitungstok(int stok){
        this.stok = stok;
    }
    
    public void info(){
        System.out.println("\n====Makanan====");
        System.out.println("Nama Makananan\t: "+ nama);
        System.out.println("Stok Makananan\t: "+ stok);
    }
}
