public class Sopir {
    private String nama;
    private int biaya;

    Sopir(){

    }
    Spoir(String nama, int biaya){
        this.nama = nama;
        this.biaya = biaya;
    }
    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getBiaya() {
        return this.biaya;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }
    public int hitungBiayaSopir(int hari){
        return biaya * hari;
    }
   
}
