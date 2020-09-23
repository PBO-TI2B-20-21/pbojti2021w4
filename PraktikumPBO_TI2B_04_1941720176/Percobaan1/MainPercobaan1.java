/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WINDOWS 10
 */
public class MainPercobaan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Processor p = new Processor();
        Laptop l = new Laptop("Thinkpad", p);
        l.info();
        
        Processor p1 = new Processor();
        p1.setMerk("Intel i5");
        p1.setCache(4);
        Laptop L1 = new Laptop();
        L1.setmerk("Thinkpad");
        L1.setProc(p1);
        L1.info();
    }
    
}
