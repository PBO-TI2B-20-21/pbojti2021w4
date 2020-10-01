/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Rafi Rachmawan
 */
public class RuangKelas {
    private String kode;
   

    public RuangKelas(String kode) {
        this.kode = kode;
   
    }

    public void setKode(String kode) {
        this.kode = kode;
    }
    
    public String getKode() {
        return kode;
    }
    

    public String info(){
        String info = "";
        info += "Kode: " + this.kode + "\n";
        return info;
    }
}


