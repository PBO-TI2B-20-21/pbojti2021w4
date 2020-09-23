/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oscar.relasiclas.percobaan2;

public class Sopir {

    private String nama;
    private int biaya;

    Sopir() {
    }
    public void setNama(String Nama){
    this.nama=Nama;
    }
    public void setBiaya(int Biaya){
    this.biaya=Biaya;
    }
    String getNama(){
    return nama;
    }
    int getBiaya(){
    return biaya;
    }
    
    public int hitungBiayaSopir(int hari){
    return biaya * hari;
    }
    
}
