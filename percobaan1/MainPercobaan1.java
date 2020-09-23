/**
 * MainPercobaan1
 */
public class MainPercobaan1 {

    public static void main(String[] args) {
        Processor p1 = new Processor("Intel i10th gen",3);
        Laptop L1= new Laptop("ROG ZEPHYRUS",p1);
        L1.info();
        p1= new Processor();
        p1.setMerk("AMD Rayzen 4700H");
        p1.setCache(4);
        
        System.out.println();
        Laptop L2 = new Laptop();
        L2.setMerk("MSI");
        L2.setPro(p1);
        L2.info();
    }
}