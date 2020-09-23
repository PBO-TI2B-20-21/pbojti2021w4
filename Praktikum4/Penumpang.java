/**
 * Penumpang
 */
public class Penumpang {

    private String ktp;
    private String nama;

    Penumpang(String ktp, String nama){
        this.ktp = ktp;
        this.nama = nama;
    }

    public String getKtp() {
        return this.ktp;
    }

    public void setKtp(String ktp) {
        this.ktp = ktp;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public String info(){
        String info = "";
        info += "ktp : " + ktp + "\n";
        info += "Nama : " + nama + "\n";
        return info;
    }
}