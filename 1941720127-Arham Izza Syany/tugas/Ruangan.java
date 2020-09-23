/**
 * Ruangan
 */
public class Ruangan {

    private String genre;
    private String film;
    private String kode;
    private Kursi[] arrayKursi;
    private Pegawai Officeboy;
    private Pegawai loket;
    
    Ruangan(String genre, String film, Pegawai Officeboy) {
        this.genre = genre;
        this.film = film;
        this.Officeboy = Officeboy;
    }
    
    Ruangan(String genre, String film, Pegawai Officeboy, Pegawai loket) {
        this.genre = genre;
        this.film = film;
        this.Officeboy = Officeboy;
        this.loket = loket;
    }
    
     public void setgenre(String genre) {
        this.genre = genre;
    }
    
    public String getgenre() {
        return genre;
    }
    
    public void setfilm(String film) {
        this.film = film;
    }
    
    public String getfilm() {
        return film;
    }
    
    private void initKursi() {
        for(int i=0; i<arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }
    
    Ruangan(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();

    }

    public void setPelanggan(Pelanggan Pelanggan, int nomor) {
        this.arrayKursi[nomor - 1].setPelanggan(Pelanggan);
    }

    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n\n";
        for (Kursi kursi : arrayKursi) {
            info += kursi.info();
        }
        return info;
    }
    
    public String info1() {
        String info = "";
        info += "Genre : " + this.genre + "\n";
        info += "film  : " + this.film + "\n\n";
        info += "Office boy hari ini adalah  \n" + this.Officeboy.info() + "\n";
        info += "Penjaga loket hari ini adalah \n" + this.loket.info() + "\n";
        return info;
    }
    

}