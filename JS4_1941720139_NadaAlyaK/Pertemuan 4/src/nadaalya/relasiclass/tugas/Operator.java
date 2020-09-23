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
public class Operator {

    String nama, idPegawai, alamat;
    Kendaraan k;

    Operator(String nama, String id, String alamat) {
        this.nama = nama;
        idPegawai = id;
        this.alamat = alamat;
    }

    Operator() {

    }

    void setNama(String nama) {
        this.nama = nama;
    }

    String getNama() {
        return nama;
    }

    void setId(String id) {
        idPegawai = id;
    }

    String getId() {
        return idPegawai;
    }

    void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    String info() {
        return "Nama Operator : " + nama + "\nID : " + idPegawai + "\nAlamat : " + alamat;
    }
}
