/**
 * mainPercobaan2
 */
public class mainPercobaan2 {

    public static void main(String[] args) {
        Mobil mbl = new Mobil();
        mbl.setMerk("Ferarri");
        mbl.setBiaya(350000);

        Sopir spr = new Sopir();
        spr.setNama("Dobleh");
        spr.setBiaya(200000);

        Pelanggan plg = new Pelanggan();
        plg.setNama("Jamal");
        plg.setMobil(mbl);
        plg.setSopir(spr);
        plg.setHari(2);

        System.out.println("Biaya Total: "+plg.hitungBiayaTotal());
    }
}