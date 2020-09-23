package dhimas.arbi.relasiclass.tugas;

/**
 *
 * @author dhimas arbi
 */

public class MainTugas {

    public static void main(String[] args) {
        Barang b1 = new Barang("BR1", "Rinso", 10, 30000);
        Barang b2 = new Barang("BR2", "Pantene", 10, 10000);
        Barang b3 = new Barang("BR3", "Soklin", 20, 15000);
        Barang b4 = new Barang("BR4", "Lifebuoy", 5, 30000);
        Barang b5 = new Barang("BR5", "Garnier", 10, 30000);

        Pembeli p1 = new Pembeli("p1", "Udin");
        Pembeli p2 = new Pembeli("p2", "Upin");
        Pembeli p3 = new Pembeli("p3", "Ipin");

        Kasir k1 = new Kasir("k1", "Nasir");
        Kasir k2 = new Kasir("k2", "Naruto");
        
        Transaksi t1 = new Transaksi("Order1",b2,p1,k1);
        System.out.println(t1.info());
        
        
    }

}
