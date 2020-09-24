/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet4_1941720047.Tugas;

/**
 *
 * @author ASUS
 */
public class pelajaran {
    private String nama;
    private Murid murid;

    public pelajaran() {

    }

    public pelajaran(String nama, Murid murid) {
        this.nama = nama;
        this.murid = murid;
    }

    pelajaran(String bahasa_indonesia, pelajaran plj) {
       
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setMurid(Murid murid) {
        this.murid = murid;
    }

    public String getNama() {
        return nama;
    }

    public Murid getMurid() {
        return murid;
    }

    public String info() {
        String info = "";
        info += "Nama: " + this.murid + "\n";
        info += "Pelajaran: " + this.nama + "\n";
        return info;
    }
}
