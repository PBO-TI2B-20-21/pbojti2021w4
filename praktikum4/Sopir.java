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
public class Sopir {
    private String Nama;
    private int Biaya;
    
    Sopir(){
        
    }
    Sopir(String nama, int biaya){
        Nama=nama;
        Biaya=biaya;
    }
     public void setNama(String nama){
        Nama=nama;
    }
    public void setBiaya(int biaya){
        Biaya=biaya;
    }
    public String getNama(){
        return Nama;
    }
    public double getBiaya(){
        return Biaya;
    }
    public int hitungBiayaSopir(int hari){
        return Biaya*hari;
    }
}
