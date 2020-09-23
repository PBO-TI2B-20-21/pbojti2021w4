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
public class Mahasiswa {
    private int nim;
    private String nama;
    
    Mahasiswa(int nim, String nama){
        this.nim=nim;
        this.nama=nama;
    }
    public void setnim(int nim){
        this.nim=nim;
    }
    public int getnim(){
        return nim;
    }
    public String getnama(){
        return nama;
    }
    public void setnama(String nama){
        this.nama=nama;
    }
    public String nama(){
        return nama;
    }
    public String info(){
        String info ="";
        info+="NIM: "+this.nim+"\n";
        info+="Nama: "+this.nama+"\n";
        return info;
    }
}
