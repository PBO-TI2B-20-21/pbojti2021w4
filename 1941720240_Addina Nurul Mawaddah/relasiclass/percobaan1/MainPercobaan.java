package relasiclass.percobaan1;

public class MainPercobaan {
    public static void main(String[] args) {
    Processor p = new Processor("Intel i7", 3);
    Laptop L = new Laptop("Thinkpad", p);
    L.info();
    Processor pr = new Processor();
    pr.setMerk("Intel i5");
    pr.setCache(4);
    Laptop laptop = new Laptop();
    laptop.setMerk("Thinkpad");
    laptop.setProc(pr);
    laptop.info();
    }
}
