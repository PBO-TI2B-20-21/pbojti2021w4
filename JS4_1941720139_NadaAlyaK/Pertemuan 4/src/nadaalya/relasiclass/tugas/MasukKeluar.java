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
public class MasukKeluar {

    int jamMasuk, jamKeluar, biaya;
    Kendaraan k;
    Operator o;

    MasukKeluar() {

    }

    MasukKeluar(int masuk, int keluar, Kendaraan k, Operator o) {
        jamMasuk = masuk;
        jamKeluar = keluar;
        this.k = k;
        this.o = o;
    }

    void setJamMasuk(int masuk) {
        jamMasuk = masuk;
    }

    void setJamKeluar(int keluar) {
        jamKeluar = keluar;
    }

    int getJamMasuk() {
        return jamMasuk;
    }

    int getJamKeluar() {
        return jamKeluar;
    }

    int hitungBiaya() {
        if (k.tipeKendaraan == "Sepeda Motor") {
            biaya = 2000;
        } else if (k.tipeKendaraan == "Mobil") {
            biaya = 5000;
        } else if (k.tipeKendaraan == "Truk") {
            biaya = 10000;
        }
        return biaya * (jamKeluar - jamMasuk);
    }

    String info() {
        String info = "";
        info = "Jam Masuk : " + jamMasuk + "\nJamKeluar : " + jamKeluar + "\nBiaya : " + hitungBiaya() + "\n";
        info += "Kendaraan : \n" + k.info() + "\n-----------------------------------------\nOperator : \n" + o.info();
        return info;
    }
}
