/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ronaldo.relasiclass.ronaldo2;

/**
 *
 * @author Bedman
 */
public class MainPercobaan2 {
    public static void main(String[] args) {
        Mobil m = new Mobil();
        m.setMerk("Avanza");
        m.setBiaya(350000);
        Sopir s = new Sopir();
        s.setNama("John Doe");
        s.setBiaya(200000);
        Pelanggan p = new Pelanggan();
        p.setNama("Christan Doe");
        p.setMobil(m);
        p.setSopir(s);
        p.setHari(2);
        System.out.println("");
        System.out.println("Biaya Total: Rp. "+p.hitungBiayaTotal());
        System.out.println(p.getMobil().getMerk());
    }
}
