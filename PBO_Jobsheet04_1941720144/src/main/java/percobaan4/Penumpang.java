/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan4;

/**
 *
 * @author Zidan
 */
public class Penumpang {
    private String KTP;
    private String nama;

    Penumpang(String ktp, String nama){
        this.KTP=ktp;
        this.nama = nama;
    }

    public void setKtp(String ktp){
        this.KTP=ktp;
    }

    public void setNama(String nama){
        this.nama=nama;
    }

    public String getKTP(){
        return KTP;
    }

    public String getNama(){
        return nama;
    }

    public String info(){
        String info="";
        info+="Ktp: "+KTP+"\n";
        info+="Nama: "+ nama+"\n";
        return info;
    }
}
