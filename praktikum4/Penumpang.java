/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ronaldo.relasiclass.percobaan4;

/**
 *
 * @author Bedman
 */
public class Penumpang {
    String ktp;
    String nama;
    Penumpang(){
        
    }
    Penumpang(String KTP,String Nama){
        ktp=KTP;
        nama=Nama;
    }
    public void setKtp(String KTP) {
        ktp = KTP;
    }
    public void setNama(String Nama) {
        nama = Nama;
    }
    public String getKtp() {
        return ktp;
    }
    public String getNama() {
        return nama;
    }
    public String info() {
        String info = "";
        info += "\n"+"No.KTP: " + ktp+"\n";
        info += "Nama: " + nama+"\n";
        return info;
    }
}
