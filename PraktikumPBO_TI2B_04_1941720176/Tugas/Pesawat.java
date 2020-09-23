/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author WINDOWS 10
 */
public class Pesawat {
    private String nama;
    private String kelas;
    private String kode;
    private Kursi[] arrayKursi;
    private Pegawai pilot;
    private Pegawai coPilot;   
    Pesawat(String nama, String kelas, Pegawai pilot) {
        this.nama = nama;
        this.kelas = kelas;
        this.pilot = pilot;
    }   
    Pesawat(String nama, String kelas, Pegawai pilot, Pegawai coPilot) {
        this.nama = nama;
        this.kelas = kelas;
        this.pilot = pilot;
        this.coPilot = coPilot;
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
    Pesawat(String kode, int jumlah) {
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
        info += "Kelas : " + this.kelas + "\n";
        info += "Pilot : " + this.pilot.info() + "\n";
        info += "Co-Pilot : " + this.coPilot.info() + "\n";
        return info;
    }   
    public void setPenumpang(Penumpang penumpang, int nomor) {
        this.arrayKursi[nomor - 1].setPenumpang(penumpang);
    }
}
