/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan2;
public class MainPercobaan2 {
    public static void main(String[] args) {
        Mobil m=new Mobil();
        m.setMerk("Jazz");
        m.setBiaya(250000);
        Sopir s=new Sopir();
        s.setNama("Ferguso");
        s.setBiaya(150000);
        Pelanggan p=new Pelanggan();
        p.setNama("Antonio");
        p.setMobil(m);
        p.setSopir(s);
        p.setHari(2);
        System.out.println("Biaya Total = "+p.hitungBiayaTotal());
    }
}
