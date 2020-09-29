/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ronaldo.relasic.percobaan1;

/**
 *
 * @author Bedman
 */
public class MainPercobaan1 {
    public static void main(String[] args) {
        Processor p = new Processor("Intel i5", 3);
        Laptop L=new Laptop("Thinkpad", p);
        L.info();
        System.out.println("");
        Processor pl = new Processor ();
        pl.setMerk("Intel i5");
        pl.setCache(4);
        System.out.println("");
        Laptop L1=new Laptop();
        L1.setMerk("Thinkpad");
        L1.setProc(pl);
        L1.info();
    }
}
