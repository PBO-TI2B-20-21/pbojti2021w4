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
public class Dosen {

    private String nama;
    private MataKuliah matakuliah;

    public Dosen() {

    }

    Dosen(String nama, MataKuliah matakuliah) {
        this.nama = nama;
        this.matakuliah = matakuliah;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setMataKuliah(MataKuliah matakuliah) {
        this.matakuliah = matakuliah;
    }

    public String getNama() {
        return nama;
    }

    public MataKuliah getMataKuliah() {
        return matakuliah;
    }

    public String info() {
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "MataKuliah: " + this.matakuliah + "\n";
        return info;
    }
}