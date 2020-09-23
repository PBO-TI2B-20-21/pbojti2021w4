public class Kursi {
    private String nomor;
    private Pelanggan Pelanggan;
    
    Kursi(String nomor) {
        this.nomor = nomor;
    }
    
    public void setNomor(String nomor) {
        this.nomor = nomor;
    }
    

    public void setPelanggan(Pelanggan Pelanggan) {
        this.Pelanggan = Pelanggan;
    }
    
    public Pelanggan getPelanggan() {
        return Pelanggan;
    }
    
    public String getNomor() {
        return nomor;
    }
    
    public String info() {
        String info = "";
        info += "Nomor\t: " + nomor + "\n";
        if(this.Pelanggan != null) {
            info += "pelanggan : " + Pelanggan.info() + "\n";
        }
        return info;
    }
}
