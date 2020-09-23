/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indra.relasiclass.percobaan2;

/**
 *
 * @author INDRAFN
 */
public class Sopir {
   private String nama;
   private int biaya;
   
   public Sopir(){
       
   }
   public void setNama(String nama){
       this.nama = nama;
   }
   public String getNama(){
       return nama;
   }
   public void setBiaya(int biaya){
       this.biaya = biaya;
   }
   public int getBiaya(){
       return biaya;
   }
   public int hitungBiayaSopir(int hari){
       return biaya * hari;
   }
}
