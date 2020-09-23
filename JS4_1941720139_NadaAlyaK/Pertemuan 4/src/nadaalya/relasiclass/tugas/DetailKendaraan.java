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
public class DetailKendaraan {

    String warna, noMesin;
    Kendaraan k;

    DetailKendaraan() {

    }

    DetailKendaraan(String warna, String noMesin) {
        this.warna = warna;
        this.noMesin = noMesin;
    }

    void setWarna(String warna) {
        this.warna = warna;
    }

    String getWarna() {
        return warna;
    }

    void setNoMesin(String noMesin) {
        this.noMesin = noMesin;
    }

    String getNoMesin() {
        return noMesin;
    }

    public String info() {
        return "Warna : " + warna + "\nNo Mesin : " + noMesin;
    }

    void setKendaraan(Kendaraan k) {
        this.k = k;
    }

    Kendaraan getKendaraan() {
        return k;
    }

}
