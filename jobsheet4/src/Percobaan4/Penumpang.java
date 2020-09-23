package Percobaan4;

public class Penumpang {
    private String ktp;
    private String nama;

    Penumpang(String ktp, String nama){
        this.ktp = ktp;
        this.nama = nama;
    }
    public void setKTP(String ktp){
        this.ktp = ktp;
    }
    public void  setNama(String nama){
        this.nama = nama;
    }
    public String info(){
        String info = "";
        info += "ktp: " + ktp + "\n";
        info += "nama: " + nama + "\n";
        return info;
    }
}