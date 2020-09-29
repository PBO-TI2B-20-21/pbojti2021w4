/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasjobsheet4;
import java.util.Scanner;
/**
 *
 * @author Bedman
 */
public class MainTugas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama Eskpedisi Kurir: ");
        String nama = input.next();
        System.out.print("Jumlah: ");
        int jumlah = input.nextInt();
        Kurir kurir = new Kurir(nama);
        System.out.print("Plat Nomor Kendaraan Kurir: ");
        String plat = input.next();
        Barang brg = new Barang(plat, jumlah);
        for (int i = 1; i <= jumlah; i++) {
            System.out.println("==== PAKET KE "+i+" ====");
            System.out.print("Nama Penerima: ");
            String name = input.next();
            System.out.print("Alamat Penerima: ");
            String alamat = input.next();
            Pembeli p = new Pembeli(name, alamat);
            brg.setPembeli(p, jumlah);
            System.out.println("Pengantar: "+nama);
            System.out.println(brg.info());
        }
  
}

}
