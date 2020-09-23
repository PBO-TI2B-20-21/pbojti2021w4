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
public class Kursi {
    private String nomor;
    private Penumpang penumpang;
    
    public Kursi(String nomor){
        this.nomor=nomor;
    }
    public void setnomor(String nomor){
        this.nomor=nomor;
    }
    public String getnomor(){
        return nomor;
    }
    public void setpenumpang(Penumpang penumpang){
        this.penumpang=penumpang;
    }
    public Penumpang getpenumpang(){
        return penumpang;
    }
    public String info(){
        String info ="";
        info+="Nomor: "+nomor+"\n";
        if(this.penumpang != null){
            info+="Penumpang: "+penumpang.info()+"\n";
        }
        return info;
    }
}
