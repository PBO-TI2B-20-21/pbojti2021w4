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
public class MainTugas {

    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("1941720227", "Rizal Whisnu Wiratama");
        MataKuliah matkul = new MataKuliah("Pemrograman Berorientasi Object", mhs);
        Dosen dsn = new Dosen("Muhammad Shulhan Khairy", matkul);
        Nilai n = new Nilai(mhs, matkul, dsn, "90");
        System.out.println(n.info());
    }
}