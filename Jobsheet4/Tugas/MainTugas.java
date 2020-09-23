/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet4.Tugas;

/**
 *
 * @author DEBORA
 */
public class MainTugas {
    public static void main(String[] args){
        Mahasiswa m = new Mahasiswa(1941720156,"Debora Febriana");
        Dosen d = new Dosen(123456789,"Deboyaaaaaa");
        RuangKelas rk = new RuangKelas("LPR5");
        //MataKuliah(String kodeMatkul, String nama, Mahasiswa mahasiswa, Dosen dosen, RuangKelas ruangkelas)
        MataKuliah mk = new MataKuliah("PBO","Pemrograman Berbasis Objek");
        mk.setdosen(d);
        mk.setmahasiswa(m);
        mk.setruang(rk);
        mk.info();
    }
}
