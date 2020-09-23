/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet4.Percobaan3;
public class Pegawai {
    private String NIP;
    private String nama;
    
    Pegawai(){
    }
    
    Pegawai(String NIP, String nama){
        this.nama = nama;
        this.NIP = NIP;
    }
    
   public void setnip(String NIP){
       this.NIP = NIP;
   }
   
   public String getnip(){
       return NIP;
   }
   
   public void setnama(String nama){
       this.nama = nama;
   }
   
   public String getnama(){
       return nama;
   }
   
   public String info(){
       String info = "";
       info += "NIP: "+this.NIP +"\n";
       info += "Nama: "+this.nama+"\n";
       return info;
   }
}
