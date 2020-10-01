/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.id.polinema.jti.polinema;

/**
 *
 * @author Rafi Rachmawan
 */
public class mainpercobaan1 {
   public static void main(String[] args){
        processor p = new processor("Intel i5", 3);
        laptop L = new laptop("Thinkpad", new processor("Intel i5", 3));
        
        L.info();
        
        processor p1 = new processor();
        p1.setMerk("Intel i5");
        p1.setCache(4);
        laptop L1 = new laptop();
        L1.setMerk("Thinkpad");
        L1.setProc(p1);
        L1.info();
    }
}

  

