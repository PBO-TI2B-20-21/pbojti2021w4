/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indra.relasiclass.tugas;

/**
 *
 * @author INDRAFN
 */
public class RuangKelas {
    private String kode;
    private String nama;

    public RuangKelas(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }
    public void setKode(String kode) {
        this.kode = kode;
    }  
    public String getKode() {
        return kode;
    } 
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public String info(){
        String info = "";
        info += "Kode: " + this.kode + "\n";
        info += "Nama: " + this.nama + "\n";
        return info;
    }
}
