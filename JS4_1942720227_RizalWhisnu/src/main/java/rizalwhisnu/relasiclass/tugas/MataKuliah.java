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
public class MataKuliah {

    private String nama;
    private Mahasiswa mahasiswa;

    public MataKuliah() {

    }

    public MataKuliah(String nama, Mahasiswa mahasiswa) {
        this.nama = nama;
        this.mahasiswa = mahasiswa;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public String getNama() {
        return nama;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public String info() {
        String info = "";
        info += "Nama: " + this.mahasiswa + "\n";
        info += "MataKuliah: " + this.nama + "\n";
        return info;
    }
}