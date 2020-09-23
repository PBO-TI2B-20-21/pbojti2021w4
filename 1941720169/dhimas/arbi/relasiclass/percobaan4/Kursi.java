package dhimas.arbi.relasiclass.percobaan4;

/**
 *
 * @author dhimas arbi
 */
public class Kursi {

    private String nomor;
    private Penumpang penumpang;

    Kursi(String nomor) {
        this.nomor = nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public String getNomor() {
        return nomor;
    }

    public void setPenumpang(Penumpang penumpang) {
        this.penumpang = penumpang;
    }

    public Penumpang getPenumpang() {
        return penumpang;
    }

    public String info() {
        String info = "";
        info += "nomor: " + nomor + "\n";
        if (penumpang != null) {
            info += "Penumpang: " + penumpang.info() + "\n";
        }
        return info;
    }
}
