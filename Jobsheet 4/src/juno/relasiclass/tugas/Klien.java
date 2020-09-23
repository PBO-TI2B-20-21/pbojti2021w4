package juno.relasiclass.tugas;

public class Klien {
    private String nama;
    private String hp;

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

    Klien(String nama, String hp){
        this.nama = nama;
        this.hp = hp;

    }

    public String info(){
        String info = "\n";
        info += "Name: " + nama + "\n";
        info += "No. HP: " + hp + "\n";
        return info;
    }
}
