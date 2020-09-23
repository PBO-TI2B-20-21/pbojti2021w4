/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author USER
 */
public class Tengkulak {
      private String jenis;
    private int biaya;

    Tengkulak() {
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    public void setBiaya(int biaya){
    this.biaya=biaya;
    }
    String setJenis() {
        return jenis;
    }
    int setBiaya(){
    return biaya;
    }
   
    public int hitungBiayaTengkulak(int jumlah_padi){
    return biaya*jumlah_padi;
    }
}
