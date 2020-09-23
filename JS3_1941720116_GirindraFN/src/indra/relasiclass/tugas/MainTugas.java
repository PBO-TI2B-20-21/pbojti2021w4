/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indra.relasiclass.tugas;

/**
 *
 * @author INDRAFN
 */
public class MainTugas {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Salim Mebel", "1941720116");
        Dosen dsn = new Dosen("Sholeh Lijo", "031");
        RuangKelas rk = new RuangKelas("RT05", "Ruang Teori");
        MataKuliah mk = new MataKuliah("02", "Kewarganegaraan");
        mk.setDosen(dsn);
        mk.setMahasiswa(mhs);
        mk.setRuangKelas(rk);

        mk.info();
    }
}
