
package bgl.relasiclass.per4;
/**
 * BimaGilangL
 */
public class Penumpang {
    private String ktp,nama;
    Penumpang (String ktp, String nama){
        this.ktp = ktp;
        this.nama = nama;
    }
    public void setKtp(String ktp){
        this.ktp = ktp;
    }
    public String getKtp(){
        return ktp;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public String info (){
        String info = "";
        info += "ktp : " + ktp + "\n";
        info += "Nama : " + nama + "\n";
        return info;
    }
    
}
