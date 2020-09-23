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
public class Dosen {
    private String nama;
    private String nip;

    public Dosen(String nama, String nip) {
        this.nama = nama;
        this.nip = nip;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public void setNip(String nip) {
        this.nip = nip;
    }
    public String getNip() {
        return nip;
    }
    public String info(){
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "NIP: " + this.nip + "\n";
        return info;
    }
}
