package Tugas;
public class Guru {
    private String nama;
    private String nip;

    public Guru(String nama, String nip) {
        this.nama = nama;
        this.nip = nip;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public void setNip(String nip) {
        this.nip = nip;
    }
    public String getNip() {
        return nip;
    }
    public String info(){
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "NIP: " + this.nip + "\n";
        return info;
    }

}
