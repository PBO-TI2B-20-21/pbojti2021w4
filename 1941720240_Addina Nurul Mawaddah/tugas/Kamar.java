package tugas;

public class Kamar {
    private int idKamar;
    private Penyewa sewa;

    public Kamar(int idKamar, Penyewa sewa) {
        this.idKamar = idKamar;
        this.sewa = sewa;
    }

    public Kamar() {
    }

    public int getIdKamar() {
        return idKamar;
    }

    public void setIdKamar(int idKamar) {
        this.idKamar = idKamar;
    }

    public Penyewa getSewa() {
        return sewa;
    }

    public void setSewa(Penyewa sewa) {
        this.sewa = sewa;
    }
    
    public void info(){
        System.out.println("Nomor Kamar : " + idKamar);
    }
}
