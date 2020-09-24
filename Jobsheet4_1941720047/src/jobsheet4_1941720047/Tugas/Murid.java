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
public class Murid {
     private String nisn;
    private String nama;

    public Murid() {

    }

    public Murid(String nisn,String nama ) {
        this.nisn = nisn;
        this.nama = nama;
    }

    public void setNisn(String nisn) {
        this.nisn = nisn;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNisn() {
        return nisn;
    }

    public String getNama() {
        return nama;
    }

    public String info() {
        String info = "";
        info += "Nim: " + this.nisn+ "\n";
        info += "Nama: " + this.nama + "\n";
        return info;
    }
}
