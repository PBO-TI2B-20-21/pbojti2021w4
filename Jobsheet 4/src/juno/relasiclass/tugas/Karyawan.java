package juno.relasiclass.tugas;

public class Karyawan {
    private String nip;
    private String nama;
    private String hp;

    Karyawan(){
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    Karyawan(String nip, String nama, String hp){
        this.nip = nip;
        this.nama = nama;
        this.hp = hp;
    }

    public String info(){
        String info = "\n";
        info += "\tNIP : " + this.nip + "\n";
        info += "\tNama : " + this.nama + "\n";
        info += "\tNo. HP : " + this.hp + "\n";
        return info;
    }
}


