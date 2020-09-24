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
public class Guru {
    private String nama;
    private String pelajaran;

    public Guru() {

    }

    Guru(String nama,pelajaran plj) {
        this.nama = nama;
        this.pelajaran = pelajaran;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setPelajaran(pelajaran plj) {
        this.pelajaran = pelajaran;
    }

    public String getNama() {
        return nama;
    }

    public String getPelajaran() {
        return pelajaran;
    }

    public String info() {
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Pelajaran: " + this.pelajaran+ "\n";
        return info;
    }
}
