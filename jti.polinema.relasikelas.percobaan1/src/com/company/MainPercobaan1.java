package com.company;

public class MainPercobaan1 {

    public static void main(String[] args) {
        Processor p = new Processor("Intel i7", 3);
        Laptop l = new Laptop("Pavilion", p);
        l.info();

        Processor p1 = new Processor();
        p1.setMerk("Intel i7");
        p1.setCache(4);
        Laptop L1 = new Laptop();
        L1.setMerk("Pavilion");
        L1.setProc(p1);
        L1.info();
    }
}
