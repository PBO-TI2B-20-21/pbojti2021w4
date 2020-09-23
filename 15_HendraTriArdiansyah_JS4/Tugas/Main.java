package Tugas;
public class Main {
    public static void main(String[] args) {
        Siswa sw = new Siswa("Aji Hasan", "04");
        Guru gr = new Guru("Rokim", "034");
        RuangKelas rk = new RuangKelas("RT01", "Ruang Teori");
        Pelajaran pl = new Pelajaran("02", "Kewarganegaraan");
        pl.setGuru(gr);
        pl.setSiswa(sw);
        pl.setRuangKelas(rk);
        pl.info();

    }
}
