package Tugas;

public class Main {
    public static void main(String[] args) {
        Dokter d= new Dokter("Penyakit dalam","Dr. Rama", 350000);
        Ruang r= new Ruang("Umum");
        Pasien p=new Pasien("Rani", "089", "Paru-paru",d,r);
        Kasir k = new Kasir("Liya",p);
        System.out.println(k.info());
    }
}