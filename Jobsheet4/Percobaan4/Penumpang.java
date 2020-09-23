/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet4.Percobaan4;

/**
 *
 * @author DEBORA
 */
public class Penumpang {
    private String ktp;
    private String nama;
    
    Penumpang(){   
    }
    Penumpang(String ktp, String nama){
     this.ktp=ktp;
     this.nama=nama;
    }
    public void setktp(String ktp){
        this.ktp=ktp;
    }
    public String getktp(){
        return ktp;
    }
    public void setnama(String nama){
        this.nama=nama;
    }
    public String getnama(){
        return nama;
    }
    public String info(){
        String info ="";
        info+="KTP: "+ktp+"\n";
        info+="Nama: "+nama+"\n";
        return info;
    }
}
