package Percobaan2;
public class Mobil {
    private String merk;
    private int biaya;
    
    public Mobil(){
    }
    public String getmerk(){
        return merk;
    }
    public int getbiaya(){
        return biaya;
    }
    public void setmerk(String merk){
        this.merk = merk;
    }
    public void setbiaya(int biaya){
        this.biaya = biaya;
    }
    public int hitungbiayaMobil(int hari){
        return biaya*hari;
    }
}
