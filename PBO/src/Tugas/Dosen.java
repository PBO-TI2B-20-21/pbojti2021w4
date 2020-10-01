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
public class Dosen {
    private int nip;
    private String nama;

    public Dosen(int nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }
    
    public int getNip() {
        return nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String info(){
        String info = "";
        info += "NIP: " + this.nip + "\n";
        info += "Nama: " + this.nama + "\n";
        return info;
    }
}


