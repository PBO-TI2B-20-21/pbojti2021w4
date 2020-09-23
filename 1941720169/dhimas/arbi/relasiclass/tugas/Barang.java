package dhimas.arbi.relasiclass.tugas;

/**
 *
 * @author dhimas arbi
 */
public class Barang {

    private String nama, kode;
    private int stok, harga;

    Barang(String kode,String nama, int stock, int harga) {
        this.kode = kode;
        this.nama = nama;
        this.stok = stock;
        this.harga = harga;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getKode() {
        return kode;
    }

    public void setStok(int stok) {
        this.stok = stok; 
    }

    public int getStok() {
        return stok;
    }

    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        info += "Nama: " + nama + "\n";
        info += "Harga: Rp" + harga + "\n";
        return info;
    }
}
