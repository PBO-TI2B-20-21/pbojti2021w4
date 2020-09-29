/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasjobsheet4;

/**
 *
 * @author Bedman
 */
public class Kurir {
    String namaKurir;
    Barang barang;
    Kurir(){
        
    }
    Kurir(String NamaKurir){
        namaKurir=NamaKurir;
    }
    public void setNamaKurir(String NamaKurir) {
        namaKurir = NamaKurir;
    }
    public String getNamaKurir() {
        return namaKurir;
    }
    public String info() {
        String info = "";
        info += "Nama Ekspedisi Pengiriman: " + namaKurir+"\n";
        return info;
    }
}
