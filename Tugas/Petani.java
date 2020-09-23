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
public class Petani {

    private String jenis;
    private int biaya;
    Petani(){
    }
public void setJenis(String jenis){
this.jenis=jenis;
}
public void setBiaya(int biaya){
this.biaya=biaya;
}
String  getJenis(){
return jenis;
}
int getBiaya(){
return biaya;
}
    public int hitungBiayaPetani(int jumlah_padi){
   return  biaya * jumlah_padi;
    }
}
