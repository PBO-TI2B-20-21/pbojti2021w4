/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oscar.relasiclass.percobaan1;

public class MainPercobaan1 {
    public static void main(String[] args) {
        Processor p = new Processor("AMD Ryzen 5",3);
        Laptop L = new  Laptop("Asus ROG", new Processor("AMD Ryzen 5",3));
    
        L.info();
        
        Processor p1 = new Processor();
        p1.setMerk("AMD Ryzen 5");
        p1.setCache(4);
        Laptop L1 = new Laptop();
        L1.setMark("ASUS ROG GG");
        L1.setProc(p1);
        L1.info();
    }
    
}
