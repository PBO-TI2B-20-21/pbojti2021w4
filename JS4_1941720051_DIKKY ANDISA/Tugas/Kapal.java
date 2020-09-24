/**
 * Kapal
 */
public class Kapal {

    private String nama;
    private String kelas;
    private String kode;
    private Kursi[] arrayKursi;
    private Pegawai nahkoda;
    private Pegawai asisten;
    
    
    Kapal(String nama, String kelas, Pegawai nahkoda) {
        this.nama = nama;
        this.kelas = kelas;
        this.nahkoda = nahkoda;
    }
    
    Kapal(String nama, String kelas, Pegawai nahkoda, Pegawai asisten) {
        this.nama = nama;
        this.kelas = kelas;
        this.nahkoda = nahkoda;
        this.asisten = asisten;
    }
    
     public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    public String getKelas() {
        return kelas;
    }
    
    private void initKursi() {
        for(int i=0; i<arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }
    
    Kapal(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }
    
    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi kursi : arrayKursi) {
            info += kursi.info();
        }
        return info;
    }
    
    public String info1() {
        String info = "";
        info += "Nama : " + this.nama + "\n";
        info += "Kelas : " + this.kelas + "\n\n";
        info += "Nahkoda : " + this.nahkoda.info() + "\n";
        info += "Asisten : " + this.asisten.info() + "\n";
        return info;
    }
    
    public void setPenumpang(Penumpang penumpang, int nomor) {
        this.arrayKursi[nomor - 1].setPenumpang(penumpang);
    }
}