package Tugas;
public class Pelayanan {
    private String nama;
    private Makanan makanan;
    private int biaya, stok;
    
    Pelayanan (String nama,int biaya,int stok,Makanan makanan) {
        this.nama =nama;
        this.biaya =biaya;
        this.makanan =makanan;
        this.stok=stok;
        
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public void setMakanan(Makanan makanan){
        this.makanan = makanan;
    } 
    public Makanan getMakanan(){
        return makanan;
    }
    public void setStok(int stok){
        this.stok = stok;
    } 
    public int getStok(){
        return stok;
    } 
    public void setBiaya(int biaya){
        this.biaya = biaya;
    }
    public int getBiaya(){
        return biaya;
    }
    public void hitungStok(int stok){
        this.stok -= stok;
        makanan.hitungstok(stok);
    }
    public void info() {
        makanan.info();
        System.out.println("====Makanaan====");
        System.out.println("Nama Layanan\t: "+ nama);
        System.out.println("Stok tersisa\t: "+ stok);
        System.out.println("Harga Makanan\t: "+ biaya);
        
    }
}
