package dhimas.arbi.relasiclass.percobaan4;

/**
 *
 * @author Dhimas.arbi
 */
public class Penumpang {
    private String ktp, nama;
    
    Penumpang(String ktp, String nama){
        this.ktp = ktp;
        this.nama = nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
    public void setKtp(String ktp) {
        this.ktp = ktp;
    }

    public String getKtp() {
        return ktp;
    }
    public String info(){
        String info = "";
        info += "Ktp: " + this.ktp + "\n";
        info += "Nama: " + this.nama + "\n";
        return info;
    }
}
