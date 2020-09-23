package Tugas;

public class Pembeli {

    private String jenis;
    private Penjual penjual;
    private Petani petani;
    private Tengkulak tengkulak;
    private int jumlah_padi;
    Pembeli() {
    }
    public void setJenis(String Jenis){
    this.jenis=Jenis;
    }
    String getJenis(){
    return jenis;
    }
    public void setPenjual(Penjual penjual){
    this.penjual=penjual;
    }
    Penjual Getpenjual(){
    return penjual;
    
    }
    public void setPetani(Petani petani){
    this.petani=petani;
    }

    Petani GetPetani(){
    return petani;
    }
    public void setTengkulak(Tengkulak tengkulak){
    this.tengkulak=tengkulak;
    }
    Tengkulak GetTengkulak(){
    return tengkulak;
    }
public void setjumlah_padi(int  jumlah_padi) {
 this.jumlah_padi=jumlah_padi;
}   
int jumlah_padi(){
return jumlah_padi;
}
    public int hitungBiayaTotal(){
    return penjual. hitungBiayaPenjual( jumlah_padi)+petani.hitungBiayaPetani(jumlah_padi)+tengkulak.hitungBiayaTengkulak(jumlah_padi);
    }
}
