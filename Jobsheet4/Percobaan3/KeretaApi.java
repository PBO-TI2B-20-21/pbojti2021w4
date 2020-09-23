/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet4.Percobaan3;
public class KeretaApi {
    private String nama;
    private String kelas;
    private Pegawai masinis;
    private Pegawai asisten;
    
    KeretaApi(String nama, String kelas, Pegawai masinis){
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
    }
    
    KeretaApi(String nama, String kelas, Pegawai masinis, Pegawai asisten){
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }

    public void setnama(String nama){
        this.nama = nama;
    }
    public String getnama(){
        return nama;
    }
    public void setkelas(String kelas){
        this.kelas = kelas;
    }
    public String getkelas(){
        return kelas;
    }
    public void setmasinis(Pegawai masinis){
        this.masinis = masinis;
    }
    public Pegawai getmasinis(){
        return masinis;
    }
    public void setasisten(Pegawai asisten){
        this.asisten = asisten;
    }
    public Pegawai getasisten(){
        return asisten;
    }
     public String info(){
         String info = "";
         info += "Nama: "+this.nama+"\n";
         info += "Kelas: "+this.kelas+"\n";
         info += "Masinis: "+this.masinis+"\n";
         info += "Asisten: "+this.asisten+"\n";
        return info;
     }
}
