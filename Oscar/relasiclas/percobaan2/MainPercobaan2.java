/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oscar.relasiclas.percobaan2;
public class MainPercobaan2 {
    public static void main(String[] args) {
        Mobil m = new Mobil();
        m.setMerk("Xenia");
        m.setBiaya(250000);
        Sopir s = new Sopir();
        s.setNama("Anjas Maradita");
        s.setBiaya(450000);
        Pelanggan p = new Pelanggan ();
        p.setnama("Anji");
        p.setmobil(m);
        p.setsopir(s);
        p.setHari(5);
        System.out.println("Biaya Total = "+ p.hitungBiayaTotal());

        System.out.println(p.getMobil().getMerk());
    }
    
}
