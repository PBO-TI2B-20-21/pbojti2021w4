/**
 * Pegawai
 */
public class Pegawai {

    private String nip;
    private String nama;
    public Pegawai(String np, String nm){
        nip= np;
        nama=nm;
    }
    public String getNip(){
        return nip;
    }
    public String getNama(){
        return nama;
    }
    public void setNip(String nip){
        this.nip = nip;
    }
    public void setNama(String Nama){
        this.nama=Nama;
    }
    public String info(){
        String info = " ";
        info += "Nip: " + this.nip + "\n";
        info += "Nama: " + this.nama + "\n";
        return info;
    } 
}