package nasabah.bank;
public class Pegawai {
    private String nip;
    private String nama;
    private String jabatan;
    
    Pegawai() {
    }
    public void setNip(String nip) {
        this.nip = nip;
    }
    public String getNip() {
        return nip;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    public String getJabatan() {
        return jabatan;
    }
    public void tampilData() {
        System.out.println("Nip: " +nip);
        System.out.println("Nama: " +nama);
        System.out.println("Jabatan: " +jabatan);
        System.out.println("=======================");
    }
}