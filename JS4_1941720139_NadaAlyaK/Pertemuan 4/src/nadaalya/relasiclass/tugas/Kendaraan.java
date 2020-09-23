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
public class Kendaraan {

    String platNomor, merk, tipeKendaraan;
    DetailKendaraan dk;

    Kendaraan() {

    }

    Kendaraan(String plat, String merk, String tipeKendaraan, DetailKendaraan dk) {
        platNomor = plat;
        this.merk = merk;
        this.tipeKendaraan = tipeKendaraan;
        this.dk = dk;
    }

    void setPlatNomor(String plat) {
        platNomor = plat;
    }

    String getPlatNomor() {
        return platNomor;
    }

    void setMerk(String merk) {
        this.merk = merk;
    }

    String getMerk() {
        return merk;
    }

    void tipeKendaraan(String tipeKendaraan) {
        this.tipeKendaraan = tipeKendaraan;
    }

    String getTipe() {
        return tipeKendaraan;
    }

    void setDetailKendaraan(DetailKendaraan k) {
        this.dk = k;
    }

    DetailKendaraan getDetailKendaraan() {
        return dk;
    }

    String info() {
        return "Plat : " + platNomor + "\nMerk : " + merk + "\nTipe : " + tipeKendaraan + "\n" + dk.info();
    }
}
