/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet4.Percobaan2;

/**
 *
 * @author DEBORA
 */
public class Sopir {
   private String nama;
   private int biaya;
   
   Sopir(){
   }
   
   public void setnama(String nama){
       this.nama = nama;
   }
   
   public String getnama(){
       return nama;
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
