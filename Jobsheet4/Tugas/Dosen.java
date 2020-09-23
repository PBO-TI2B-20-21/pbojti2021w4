/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet4.Tugas;

/**
 *
 * @author DEBORA
 */
public class Dosen {
    private int nip;
    private String nama;
    
    Dosen(int nip, String nama){
        this.nip=nip;
        this.nama=nama;
    }
    public void setnip(int nip){
        this.nip=nip;
    }
    public int getnip(){
        return nip;
    }
    public void setnama(String nama){
        this.nama=nama;
    }
    public String getnama(){
        return nama;
    }
   public String info(){
        String info ="";
        info+="NIP: "+this.nip+"\n";
        info+="Nama: "+this.nama+"\n";
        return info;
    }       
}
