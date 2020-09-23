/**
 * MainRuangan
 */
import java.util.Scanner;
public class MainRuangan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Selamat datang di BIOSKOP SAYA");
        System.out.print("Masukan Nomor ktp? ");
        String b=sc.nextLine();
        System.out.print("Siapa nama anda? ");
        String c=sc2.nextLine();
        Pelanggan p = new Pelanggan(b,c);
        Ruangan Ruangan = new Ruangan("RUANGAN 1", 10);

        System.out.print("Mau duduk dikursi nomor berapa? batas samapai 10? ");
        int a= sc.nextInt();
        Ruangan.setPelanggan(p, a);
        System.out.println(Ruangan.info());

        
        Pegawai Officeboy = new Pegawai("7284", "ROBERTO");
        Pegawai loket = new Pegawai("98327", "MANG OLEH");
        Ruangan p1 = new Ruangan("Film ACTION", "IRONMAN", Officeboy, loket);
        System.out.println(p1.info1());
    }
}