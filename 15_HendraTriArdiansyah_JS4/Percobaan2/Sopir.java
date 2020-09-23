package Percobaan2;
public class Sopir {
    private String nama;
    private int biaya;
    
    public Sopir(){
    }
    public String getnama(){
        return nama;
    }
    public int getbiaya(){
        return biaya;
    }
    public void setnama(String nama){
        this.nama=nama;
    }
    public void setbiaya(int biaya){
        this.biaya=biaya;
    }
    public int hitungbiayaSopir(int hari){
        return biaya*hari;
    }
}
