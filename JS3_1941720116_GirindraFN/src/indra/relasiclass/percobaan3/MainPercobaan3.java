/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indra.relasiclass.percobaan3;

/**
 *
 * @author INDRAFN
 */
public class MainPercobaan3 {
    public static void main(String[] args) {
        Pegawai masinis = new Pegawai("1234", "Sutoyo Kabel");
        Pegawai asisten = new Pegawai("4567", "Luki Kero");
        KeretaApi keretaapi = new KeretaApi("Argo Bromo Anggrek",
        "Eksekutif", masinis, asisten);
        
        System.out.println(keretaapi.info());
    }
}
