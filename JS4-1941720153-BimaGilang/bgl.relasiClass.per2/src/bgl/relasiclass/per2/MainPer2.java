
package bgl.relasiclass.per2;
/**
 * BimaGilangL
 */
public class MainPer2 {
    public static void main (String[] args){
        Mobil m = new Mobil();
        m.setMerk("Avanca");
        m.setBiaya(350000);
        Sopir s = new Sopir();
        s.setNama("Jhon Doeee");
        s.setBiaya(200000);
        Pelanggan p = new Pelanggan();
        p.setNama("Janee");
        p.setMobil(m);
        p.setSopir(s);
        p.setHari(2);
        System.out.println("Biaya Total = "+ p.hitunganBiayaTotal());
        System.out.println(p.getMobil().getMerk());
    }
}
