package Percobaan2;
public class Pelanggan {
    private String nama;
    private Mobil mobil;
    private Sopir sopir;
    private int hari;
    public Pelanggan(){
    }
    public String getnama(){
        return nama;
    }
    public Mobil getmobil(){
        return mobil;
    }
    public Sopir getsopir(){
        return sopir;
    }
    public int gethari(){
        return hari;
    }
    public void setnama(String nama){
        this.nama=nama;
    }
    public void setmobil(Mobil mobil){
        this.mobil=mobil;
    }
    public void setsopir(Sopir sopir){
        this.sopir = sopir;
    }
    public void sethari(int hari){
        this.hari=hari;
    }
    public int hitungbiayaTotal(){
        return mobil.hitungbiayaMobil(hari)+sopir.hitungbiayaSopir(hari);
    }
}
