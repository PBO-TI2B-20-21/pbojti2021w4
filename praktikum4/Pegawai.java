/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ronaldo.relasiclass.percobaan3;

/**
 *
 * @author Bedman
 */
public class Pegawai {

    private String nip;
    private String nama;

   
    public Pegawai(String NIP, String Nama) {
        this.nip = NIP;
        this.nama = Nama;
    }

    public void setNIP(String Nip) {
        this.nip = Nip;
    }

    public void setNama(String Nama) {
        this.nama = Nama;
    }

    public String getNama() {
        return nama;
    }

    public String getNIP() {
        return nip;
    }

    public String info() {
        String info = " ";
        info += "Nip: " + this.nip + "\n";
        info += "Nama: " + this.nama + "\n";
        return info;
    }
}
