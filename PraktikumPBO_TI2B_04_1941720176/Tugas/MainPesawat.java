/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author WINDOWS 10
 */
public class MainPesawat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic herepublic static void main(String[] args) {
        Penumpang p = new Penumpang("847294", "Queen Kekeyi");
        Pesawat pesawat = new Pesawat("AB76", 9);
        pesawat.setPenumpang(p, 1);
        System.out.println(pesawat.info());
        
        Pegawai pilot = new Pegawai("475623", "Cimoy Cimot");
        Pegawai coPilot = new Pegawai("678732", "Mang Oleh");
        Pesawat p1 = new Pesawat("Puyuh Air", "Bisnis", pilot, coPilot);
        System.out.println(p1.info1());
    }
}
