package dhimas.arbi.relasiclass.tugas;

/**
 *
 * @author Dhimas arbi
 */
public class Transaksi {

    private String orderId;
    private Barang barang;
    private Pembeli pembeli;
    private Kasir kasir;

    Transaksi(String orderId,Barang barang, Pembeli pembeli, Kasir kasir) {
        this.orderId = orderId;
        this.barang = barang;
        this.pembeli = pembeli;
        this.kasir = kasir;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setPembeli(Pembeli p) {
        pembeli = p;
    }

    public Pembeli getPembeli() {
        return pembeli;
    }

    public void setKasir(Kasir k) {
        kasir = k;
    }

    public Kasir getKasir() {
        return kasir;
    }
    public void kurangiStock(){
        barang.setStok(barang.getStok()-1);
    }
    public void setBarang(Barang b) {
        barang = b;
    }

    public Barang getBarang() {
        return barang;
    }

    public String info() {
        String info = "";
        kurangiStock();
        info += "Order ID: " + orderId + "\n";
        info += "Kasir: \n" + kasir.info() + "\n";
        info += "Pembeli: \n" + pembeli.info() + "\n";
        info += "Barang: \n"+barang.info()+"\n";
        return info;
    }
}
