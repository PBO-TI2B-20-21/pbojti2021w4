    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet4.Percobaan2;
public class Mobil {
    private String merk;
    private int biaya;
    
    Mobil(){
    }
    
    public void setmerk(String merk){
        this.merk = merk;
    }
    
    public String getmerk(){
        return merk;
    }
    
    public void setbiaya(int biaya){
        this.biaya = biaya;
    }
    
    public int getbiaya(){
        return biaya;
    }
    
    public int hitungBiayaMobil(int hari){
        return biaya*hari;
    }
}
