
package ronaldo.relasiclass.ronaldo2;

/**
 *
 * @author Bedman
 */
public class Pelanggan {
    private String Nama;
    private Mobil Mobil;
    private Sopir Sopir;
    private int Hari;
    Pelanggan(){
        
    }
     public void setNama(String nama){
        Nama=nama;
    }
    public void setMobil(Mobil mobil){
        Mobil=mobil;
    }
    public void setSopir(Sopir sopir){
        Sopir=sopir;
    }
    public void setHari(int hari){
        Hari=hari;
    }
    public String getNama(){
        return Nama;
    }
    public Mobil getMobil(){
        return Mobil;
    }
    public String getSopir(){
        return Nama;
    }
    public int getHari(){
        return Hari;
    }
    public int hitungBiayaTotal(){
        return Mobil.hitungBiayaMobil(Hari)+Sopir.hitungBiayaSopir(Hari);
    }
}
