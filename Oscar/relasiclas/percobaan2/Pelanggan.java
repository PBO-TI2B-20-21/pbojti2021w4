package Oscar.relasiclas.percobaan2;
public class Pelanggan {
    private String nama;
    private Mobil mobil;
    private Sopir sopir;
    private int hari;
    Pelanggan() {
    }
    public void setnama(String Nama){
    this.nama=Nama;
    }
    public void setmobil(Mobil mobil){
    this.mobil=mobil;
    }
    public void setsopir(Sopir sopir){
    this.sopir=sopir;
    }
    public void setHari(int Hari){
    this.hari=Hari;
    }
    String getNama(){
    return nama;
    }
    Mobil  getMobil(){
    return mobil;
    }
    Sopir getSopir(){
    return sopir;
    }
    int hari(){
    return hari;
    }
    public int hitungBiayaTotal(){
    return mobil.hitungBiayaMobil(hari)+sopir.hitungBiayaSopir(hari);
    }
}
