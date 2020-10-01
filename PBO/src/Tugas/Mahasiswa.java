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
public class Mahasiswa {
    private int nim;
    private String nama;

    public Mahasiswa(int nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }
    

    public void setNim(int nim) {
        this.nim = nim;
    }
    
    public int getNim() {
        return nim;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String info(){
        String info = "";
        info += "NIM: " + this.nim + "\n";
        info += "Nama: " + this.nama + "\n";
        return info;
    }
}


