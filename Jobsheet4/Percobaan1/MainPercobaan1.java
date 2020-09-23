/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet4.Percobaan1;
public class MainPercobaan1 {
    public static void main(String args[]){
        Processor p = new Processor("Intel i5",3);
        Laptop L = new Laptop("Thinkpad",
                new Processor("Intel i5",3));
        L.info();
        
        Processor p1 = new Processor();
        p1.setmerk("Intel i5");
        p1.setcache(4);
        Laptop L1 = new Laptop();
        L1.setmerk("Thinkpad");
        L1.setproc(p1);
        L1.info();
    } 
}
