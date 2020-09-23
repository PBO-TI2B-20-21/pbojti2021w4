package tugas;

public class MainApartemen {
    public static void main(String[] args) {
        Penyewa pn = new Penyewa("007", "Addina","Kediri","042332247");
        pn.info();
        Kamar kmr = new Kamar();
        kmr.setIdKamar(199);
        kmr.setSewa(pn);
        kmr.info();
        Tipe tp = new Tipe();
        tp.setJenis(2);
        Apartemen apar;
        apar = new Apartemen("Jl Bunga Anggrek", kmr);
        apar.info();
        tp.jenisKamar();
        
    }
}
