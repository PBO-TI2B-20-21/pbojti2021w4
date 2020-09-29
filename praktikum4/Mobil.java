/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ronaldo.relasiclass.ronaldo2;

/**
 *
 * @author Bedman
 */
public class Mobil {
    private String Merk;
    private int Biaya;
    
    Mobil(){
        
    }
    Mobil(String merk,int biaya){
        Merk=merk;
        Biaya=biaya;
    }
     public void setMerk(String merk){
        Merk=merk;
    }
    public void setBiaya(int biaya){
        Biaya=biaya;
    }
    public String getMerk(){
        return Merk;
    }
    public double getBiaya(){
        return Biaya;
    }
    public int hitungBiayaMobil(int hari){
        return Biaya*hari;
    }
}
