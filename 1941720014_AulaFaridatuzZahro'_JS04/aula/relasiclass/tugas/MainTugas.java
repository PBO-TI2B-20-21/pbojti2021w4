package aula.relasiclass.tugas;

import java.util.Scanner;

/**
 *
 * @author Aulafz
 */
public class MainTugas {

    public static void main(String[] args) {
        Scanner aula = new Scanner(System.in);
        System.out.print("Masukkan Kode Reservasi : ");
        String resev = aula.nextLine();
        System.out.print("Masukkan Id Customer : ");
        String idCust = aula.nextLine();
        System.out.print("Masukkan Nama Customer : ");
        String nama = aula.nextLine();
        System.out.print("Masukkan Tanggal : ");
        int tanggal = aula.nextInt();
        System.out.println();
        System.out.println("--------MOVIHERE--------");
        System.out.println("=========================");
        System.out.println("Pilihan Judul Film : ");
        System.out.println("1. The Invisible Man (Theater 1/2)");
        System.out.println("2. Mulan (Theater 1)");
        System.out.println("3. I Still Believe (Theater 2)");
        System.out.println("=========================");
        System.out.print("Pilih id Film (1/2/3) : ");
        int idFilm = aula.nextInt();
        System.out.print("Masukkan Theater (1/2) : ");
        int teater = aula.nextInt();
        System.out.println("======================================");
        Customer c = new Customer(idCust, nama);
        Tanggal t = new Tanggal(tanggal);
        Film f = new Film(idFilm);
        Theater h = new Theater(teater);
        Reservasi r = new Reservasi(resev, c, t, f, h);
        
        System.out.println(r.info());

    }
}
