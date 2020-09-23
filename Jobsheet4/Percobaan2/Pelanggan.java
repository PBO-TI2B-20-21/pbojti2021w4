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
public class Pelanggan {
    private String nama;
    private Mobil mobil;
    private Sopir sopir;
    private int hari;
    
    public Pelanggan(){
    }
    
    public void setnama(String nama){
        this.nama = nama;
    }
    public String getnama(){
        return nama;
    }
    public void setmobil(Mobil mobil){
        this.mobil = mobil;
    }
    public Mobil getmobil(){
        return mobil;
    }
    public void setsopir(Sopir sopir){
        this.sopir = sopir;
    }
    public Sopir getsopir(){
        return sopir;
    }
    public void sethari(int hari){
        this.hari = hari;
    }
    public int gethari(){
        return hari;
    }
    
    public int hitungBiayaTotal(){
        return mobil.hitungBiayaMobil(hari)+
                sopir.hitungBiayaMobil(hari);
    }
}
