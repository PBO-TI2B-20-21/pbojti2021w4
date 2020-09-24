/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet4_1941720047.Tugas;

/**
 *
 * @author ASUS
 */
public class Main {
    
    public static void main(String[] args) {
        Murid mrd = new Murid("1941720047", "Ella amelia");
        pelajaran plj = null;
        plj = new pelajaran("Bahasa indonesia", plj);
        Guru gr = new Guru("Dinike", plj);
        Nilai n = new Nilai(mrd,plj,gr, "85");
        System.out.println(n.info());
    }
}
