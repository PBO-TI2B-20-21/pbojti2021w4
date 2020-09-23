/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nadaalya.relasiclass.tugas;

/**
 *
 * @author Nada Alya
 */
public class MainTugas {
    public static void main(String[] args) {
        DetailKendaraan dk = new DetailKendaraan("HITAM", "8902489320");
        Kendaraan k = new Kendaraan("AG 653 RBC", "TOYOTA", "Mobil", dk);
        Operator o = new Operator("Wawan", "2938420984", "Lowokwaru");
        MasukKeluar mk = new MasukKeluar(7, 11, k, o);
        System.out.println(mk.info());
        DetailKendaraan dk1 = new DetailKendaraan();
        Kendaraan k1 = new Kendaraan();
        MasukKeluar mk1 = new MasukKeluar();
        k1.setMerk("HONDA");
        k1.setPlatNomor("N 5067 RRG");
        k1.tipeKendaraan("Mobil");
        k1.setDetailKendaraan(dk1);
        dk1.setWarna("PUTIH");
        dk1.setNoMesin("438378424");
        dk1.setKendaraan(k1);
        mk1.setJamMasuk(10);
        mk1.setJamKeluar(12);
        mk1.o=o;
        mk1.k=k1;
        System.out.println(mk1.info());
    }
}
