package Percobaan1;
public class Main {
    public static void main(String[] args) {
        //Processor p = new Processor("Intel i7",3);
        Laptop l = new Laptop ("TUF",new Processor("Intel i7",3) );
        l.info();
        
        Processor p1 = new Processor();
        p1.setmerk("intel i7");
        p1.setcache(4);
        
        Laptop l1 = new Laptop();
        l1.setmerk("TUF");
        l1.setproc(p1);
        l1.info();
    }
}
