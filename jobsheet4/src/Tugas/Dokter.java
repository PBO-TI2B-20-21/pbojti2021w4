package Tugas;

public class Dokter {
    private String sps;
    private String nama;
    private int biayaBerobat;

    Dokter() {

    }
    public Dokter (String sps,String nama, int biayaBerobat){
        this.sps=sps;
        this.nama=nama;
        this.biayaBerobat=biayaBerobat;
    }
    public void setSps(String sps){
        this.sps=sps;
    }
    public String getSps(){
        return sps;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public String getNama(){
        return nama;
    }
    public void setBiaya(int biayaBerobat){
        this.biayaBerobat=biayaBerobat;
    }
    public double getBiaya(){
        return biayaBerobat;
    }
    public int hitungBiayaBerobat(int jam) {
        return biayaBerobat * jam;
    }
    public String info() {
        String info = "";
        info += "Nama Dokter: " + this.nama + "\n";
        info += "Spesialis : " + this.sps + "\n";
        info += "biaya : "+biayaBerobat;
        return info;
    }
}