/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indra.relasiclass.percobaan1;

/**
 *
 * @author INDRAFN
 */
public class MainPercobaan1 {
    public static void main(String[] args) {
        Processor p = new Processor("Intel i5", 8);
        Laptop L = new Laptop("Macbook Pro", new Processor("Intel i5", 8));
        
        L.info();
        Processor p1 = new Processor();
        p1.setMerk("Intel i5");
        p1.setCache(4);
        Laptop L1 = new Laptop();
        L1.setMerk("Macbook Pro");
        L1.setProc(p1);
        L1.info();
    }
}
