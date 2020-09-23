package Tugas;

public class Kasir {
    private String nama;
    private Pasien p;

    Kasir(){

    }
    public Kasir(String nama,Pasien p){
        this.nama=nama;
        this.p=p;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public String getNama(){
        return nama;
    }
    public void setPasien(Pasien p){
        this.p=p;
    }
    public Pasien getPasien(){
        return p;
    }
    public String info() {
        String info = "";
        info += "Nama Petugas Kasir : " + this.nama + "\n"+
                p.info();
        return info;

    }
}