package juno.relasiclass.percobaan4;

public class Kursi {
    private String nomor;
    Penumpang penumpang;

    Kursi(String nomor){
        this.nomor = nomor;
    }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public Penumpang getPenumpang() {
        return penumpang;
    }

    public void setPenumpang(Penumpang penumpang) {
        this.penumpang = penumpang;
    }

    public String info(){
        String info = "";
        info += "Nomor: " + nomor + "\n";
        if(this.penumpang != null){
            info += "Penumpang: " + penumpang.info() + "\n";
        }
        return  info;
    }
}



