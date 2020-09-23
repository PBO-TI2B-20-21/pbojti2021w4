package Tugas;

public class Pasien {
    private String nama;
    private String antrian;
    private String penyakit;
    private Dokter d;
    private Ruang r;

    Pasien(){

    }
    public Pasien(String nama, String antrian, String penyakit, Dokter d,Ruang r){
        this.nama=nama;
        this.antrian=antrian;
        this.penyakit=penyakit;
        this.d=d;
        this.r=r;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public String getNama(){
        return nama;
    }
    public void setAntrian(String antrian){
        this.antrian=antrian;
    }
    public String getAntrian(){
        return antrian;
    }
    public void setPenyakit(String penyakit){
        this.penyakit=penyakit;
    }
    public String getPenyakit(){
        return penyakit;
    }
    public String info() {
        String info = "";
        info += "Nama Pasien: " + this.nama + "\n";
        info += "Nomor Antrian : " + this.antrian + "\n";
        info += "Jenis Penyakit : " + this.penyakit + "\n"+
                d.info()+"\n"+r.info()+"\n";
        return info;
    }
}