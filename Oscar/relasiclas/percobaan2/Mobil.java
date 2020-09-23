/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oscar.relasiclas.percobaan2;
public class Mobil {

    private String merk;
    private int biaya;

    Mobil() {
    }
    
   public void setMerk(String Merk){
   this.merk=Merk;
   }
   public void setBiaya(int Biaya){
   this.biaya=Biaya;
   }
   public String getMerk(){
   return merk;
   }
   public int getBiaya(){
   return biaya;
   }
   
   public int hitungBiayaMobil(int hari){
   return biaya * hari;
   }
}
