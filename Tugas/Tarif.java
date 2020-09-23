/**
 * Tarif
 */
public class Tarif {

    private int biaya, jarak;
    private String asal, tujuan;
    private Kendaraan kendaraan;

    public Tarif() {

    }

    public Tarif(String asal, String tujuan, int biaya, int jarak, Kendaraan kendaraan) {
        this.asal = asal;
        this.tujuan = tujuan;
        this.biaya = biaya;
        this.jarak = jarak;
        this.kendaraan = kendaraan;
    }

    public int getBiaya() {
        return biaya;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public int getJarak() {
        return jarak;
    }

    public void setJarak(int jarak) {
        this.jarak = jarak;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;

    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public int hitungBiaya() {
        return biaya * jarak;
    }

    public String print() {
        String print = "";
        print += kendaraan.print();
        print += "Biaya Perjalanan : " + hitungBiaya();
        return print;
    }
}