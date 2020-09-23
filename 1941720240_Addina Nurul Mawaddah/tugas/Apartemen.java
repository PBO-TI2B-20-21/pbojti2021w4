package tugas;

public class Apartemen {
    private String lokasi;
    private Kamar kamar;
    private Tipe tipe;

    public Apartemen() {
    }

    public Apartemen(String lokasi, Kamar kamar) {
        this.lokasi = lokasi;
        this.kamar = kamar;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public Kamar getKamar() {
        return kamar;
    }

    public void setKamar(Kamar kamar) {
        this.kamar = kamar;
    }

    public Tipe getTipe() {
        return tipe;
    }

    public void setTipe(Tipe tipe) {
        this.tipe = tipe;
    }

    
    
    public void info(){
        System.out.println("Lokasi Apartemen : " + lokasi);
        
    }
}
