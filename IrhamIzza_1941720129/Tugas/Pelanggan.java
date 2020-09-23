package Tugas;
public class Pelanggan {
    private String nama;
    private Pelayanan pelayanan;
    private Koki koki;
    private int stok,jumpes;
    
    Pelanggan (String nama,int stok,Pelayanan pelayanan,Koki koki) {
        this.nama=nama;
        this.pelayanan=pelayanan;
        this.koki=koki;
        this.stok =stok;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public void setStok(int stok){
        this.stok = stok;
    }
    public int getStok(){
        return stok;
    }
    public void setPelayanan(Pelayanan pelayanan){
        this.pelayanan = pelayanan;
    }
    public Pelayanan getPelayanan(){
        return pelayanan;
    }
    public void setKoki(Koki koki){
        this.koki = koki;
    }
    public Koki getKoki(){
        return koki;
    }
    public void hitungStok(int stok){
        if (stok > pelayanan.getStok()) {
            System.out.println("Maaf Stok Telah Habis");
            System.exit(0);
        }else{
            pelayanan.hitungStok(stok);
        }
    }
    public int hitungBiaya(int stok){
        return stok * pelayanan.getBiaya();
    }
    public void info() {
        pelayanan.info();
        System.out.println("======Data Pelanggan=====");
        System.out.println("Nama Pelanggan\t\t: " + nama);
        System.out.println("Jumlah Pesanan\t\t: " + stok);
        int total = hitungBiaya(stok);
        if (koki != null) {
            koki.info();
            total += koki.getGaji();
        }
        System.out.println("Total Biaya\t\t: Rp" + total);
    }
}
