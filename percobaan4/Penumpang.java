/**
 * Penumpang
 */
public class Penumpang {

    private String ktp;
    private String nama;  
    public Penumpang(String ktp, String nam){
        this.ktp = ktp;
        this.nama=nam;
    }
    public void setKtp(String ktp){
        this.ktp = ktp;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getKtp(){
        return ktp;
    }
    public String getNama(){
        return nama;
    }
    public String info(){
        String info =" ";
        info+="Ktp: "+ ktp + "\n";
        info+= "Nama: "+nama + "\n";
        return info;
    }
}