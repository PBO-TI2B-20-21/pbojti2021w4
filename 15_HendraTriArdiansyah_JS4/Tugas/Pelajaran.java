package Tugas;
public class Pelajaran {
    
    private String kode;
    private String nama;
    private Siswa siswa;
    private Guru guru;
    private RuangKelas ruangKelas;

    public Pelajaran(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }
    public String getKode() {
        return kode;
    }
    public void setKode(String kode) {
        this.kode = kode;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public Siswa getSiswa() {
        return siswa;
    }
    public void setSiswa(Siswa siswa) {
        this.siswa = siswa;
    }
    public Guru getGuru() {
        return guru;
    }
    public void setGuru(Guru guru) {
        this.guru = guru;
    }
    public RuangKelas getRuangKelas() {
        return ruangKelas;
    }
    public void setRuangKelas(RuangKelas ruangKelas) {
        this.ruangKelas = ruangKelas;
    }
    public void info(){
        System.out.println("Kode Mata Kuliah: " + kode);
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("Guru: " + this.guru.info());
        System.out.println("Siswa: " + this.siswa.info());
        System.out.println("Ruang: " + this.ruangKelas.info());
    }

}
