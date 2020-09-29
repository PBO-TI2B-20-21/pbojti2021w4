/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ronaldo.relasiclass.percobaan4;

import java.util.Scanner;

/**
 *
 * @author Bedman
 */
public class MainPercobaan4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kode Gerbong: ");
        String kode = input.next();
        System.out.print("Jumlah kursi: ");
        int jumlah = input.nextInt();
        Gerbong gerbong = new Gerbong(kode, jumlah);
        for (int i = 1; i <= jumlah; i++) {
            System.out.println("==== PENUMPANG KE "+i+" ====");
            System.out.print("No.KTP: ");
            String nomor = input.next();
            System.out.print("Nama: ");
            String name = input.next();
            Penumpang p = new Penumpang(nomor, name);
            gerbong.setPenumpang(p, i);
            System.out.println(gerbong.info());
        }
  
}
}
