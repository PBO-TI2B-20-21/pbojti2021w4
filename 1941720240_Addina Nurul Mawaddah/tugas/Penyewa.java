package tugas;

public class Penyewa {
    private String idSewa;
    private String nama;
    private String alamat;
    private String noHP;

    public Penyewa(String idSewa, String nama, String alamat, String noHP) {
        this.idSewa = idSewa;
        this.nama = nama;
        this.alamat = alamat;
        this.noHP = noHP;
    }

    public String getIdSewa() {
        return idSewa;
    }

    public void setIdSewa(String idSewa) {
        this.idSewa = idSewa;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoHP() {
        return noHP;
    }

    public void setNoHP(String noHP) {
        this.noHP = noHP;
    }

    public void info(){
        System.out.println("Id Sewa :" + idSewa);
        System.out.println("Nama Sewa : " + nama);
        System.out.println("Alamat :" + alamat);
        System.out.println("No HP : " + noHP);
    }
}
