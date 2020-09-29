/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rizalwhisnu.relasiclass.tugas;

/**
 *
 * @author hp
 */
public class Mahasiswa {

    private String nim;
    private String nama;

    public Mahasiswa() {

    }

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String info() {
        String info = "";
        info += "Nim: " + this.nim + "\n";
        info += "Nama: " + this.nama + "\n";
        return info;
    }
}