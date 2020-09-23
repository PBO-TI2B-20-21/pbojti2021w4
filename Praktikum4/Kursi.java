public class Kursi {
    private String nomor;
    private Penumpang penumpang;

    Kursi(String nomor){
        this.nomor = nomor;
    }
    public String getNomor() {
        return this.nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public Penumpang getPenumpang() {
        return this.penumpang;
    }

    public void setPenumpang(Penumpang penumpang) {
        this.penumpang = penumpang;
    }
    public String info() {
        String info = "";
        info += "Nomor: " + nomor + "\n";
        if (this.penumpang != null) {
        info += "Penumpang: " + penumpang.info() + "\n";
        }
        return info;
    }
        
}
