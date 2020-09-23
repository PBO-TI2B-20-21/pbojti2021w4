package Tugas;
public class Siswa {
    private String nama;
    private String absen;

    public Siswa(String nama, String abs) {
        this.nama = nama;
        this.absen = abs;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public void setAbsen(String absen) {
        this.absen = absen;
    }
    public String getAbsen() {
        return absen;
    }
    public String info(){
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Absen: " + this.absen + "\n";
        return info;
    }

}
