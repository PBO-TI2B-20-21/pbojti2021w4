package dhimas.arbi.relasiclass.percobaan2;

/**
 *
 * @author Windows
 */
public class Mobil {

    private String merk;
    private int biaya;

    Mobil() {

    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public int getBiaya() {
        return biaya;
    }

    public int hitungBiayaMobil(int hari) {
        return biaya * hari;
    }

}
