/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indra.relasiclass.percobaan2;

/**
 *
 * @author INDRAFN
 */
public class MainPercobaan2 {
    public static void main(String[] args) {
        Mobil m = new Mobil();
        m.setMerk("Fuso");
        m.setBiaya(350000);
        Sopir s = new Sopir();
        s.setNama("Sokip Kanisir");
        s.setBiaya(200000);
        Pelanggan p = new Pelanggan();
        p.setNama("Bambang Galon");
        p.setMobil(m);
        p.setSopir(s);
        p.setHari(2);
        System.out.println("Biaya Total = " + 
        p.hitungBiayaTotal());
    }
}
