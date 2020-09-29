/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasjobsheet4;

/**
 *
 * @author Bedman
 */
public class Pembeli {
    String nama;
    String alamat;
    Pembeli(){
        
    }
    Pembeli(String Nama,String Alamat){
        nama=Nama;
        alamat=Alamat;
    }
    public void setNama(String Nama) {
        nama = Nama;
    }
    public void setAlamat(String Alamat) {
        alamat = Alamat;
    }
    public String getNama() {
        return nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public String info() {
        String info = "";
        info += "Nama: " + nama+"\n";
        info += "Alamat: " + alamat+"\n";
        return info;
    }
}
