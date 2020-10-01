/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Rafi Rachmawan
 */
public class Main {
    public static void main(String[] args){
        //try{
            Mahasiswa m = new Mahasiswa(1941720102, "Khoirul");
            Dosen d = new Dosen(12371037, "Romadhon");
            RuangKelas r = new RuangKelas("LPR1");
            MataKuliah k = new MataKuliah("P01", "PBO");
            k.setDosen(d);
            k.setMahasiswa(m);
            k.setRuangKelas(r);
        
            k.info();

    }
}
 

