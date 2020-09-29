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
public class Nilai {

    private String nilai;
    private MataKuliah matakuliah;
    private Mahasiswa mahasiswa;
    private Dosen dosen;

    public Nilai() {

    }

    public Nilai(String nilai, MataKuliah matakuliah, Mahasiswa mahasiswa, Dosen dosen) {
        this.nilai = nilai;
        this.mahasiswa = mahasiswa;
        this.matakuliah = matakuliah;
        this.dosen = dosen;
    }

    Nilai(Mahasiswa mhs, MataKuliah matkul, Dosen dsn, String string) {

    }

    public void setNilai(String nilai) {
        this.nilai = nilai;
    }

    public void setMataKuliah(MataKuliah matakuliah) {
        this.matakuliah = matakuliah;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }

    public String getNilai() {
        return nilai;
    }

    public MataKuliah getMataKuliah() {
        return matakuliah;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public Dosen getDosen() {
        return dosen;
    }

    public String info() {
        String info = "";
        info += "Nama: " + this.mahasiswa + "\n";
        info += "MataKuliah: " + this.matakuliah + "\n";
        info += "Nama Dosen: " + this.dosen + "\n";
        info += "Nilai: " + this.nilai + "\n";
        return info;
    }
}