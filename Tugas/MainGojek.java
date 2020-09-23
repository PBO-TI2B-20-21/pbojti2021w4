import java.util.Scanner;

/**
 * MainGojek
 */
public class MainGojek {

    private static Customer customer;
    private static Driver driver;
    private static Kendaraan kendaraan;
    private static Tarif tarif;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (i > 0 && i < 5) {
            menu();
            System.out.print("Pilih Menu : ");
            i = sc.nextInt();
            switch (i) {
                case 1:
                    System.out.println("=================================");
                    System.out.println("Masukkan Nama Customer : ");
                    String nama = sc.next();
                    customer = new Customer(nama);
                    break;
                case 2:
                    System.out.println("=================================");
                    System.out.println("Masukkan Nama Driver : ");
                    String nd = sc.next();
                    driver = new Driver(nd, customer);
                    break;
                case 3:
                    System.out.println("=================================");
                    System.out.println("Masukkan Tipe Kendaraan : ");
                    String tipe = sc.next();
                    System.out.println("Masukkan Jenis Kendaraan : ");
                    String jenis = sc.next();
                    System.out.println("Masukkan No.Plat Kendaraan : ");
                    String no = sc.next();
                    kendaraan = new Kendaraan(tipe, jenis, no, driver);

                    break;
                case 4:
                    System.out.println("=================================");
                    System.out.println("Masukkan Lokasi saat ini : ");
                    String asal = sc.next();
                    System.out.println("Masukkan Lokasi tujuan : ");
                    String tujuan = sc.next();
                    System.out.println("Masukkan Biaya (per km) : ");
                    int biaya = sc.nextInt();
                    System.out.println("Masukkan Jarak (km) : ");
                    int jarak = sc.nextInt();
                    tarif = new Tarif(asal, tujuan, biaya, jarak, kendaraan);
                    break;
                case 5:
                    System.out.println("=================================");
                    System.out.println(tarif.print());
                    System.out.println("========== TERIMA KASIH =========");
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("========== Gojek Mojokerto ==========");
        System.out.println("Pilihan Menu : ");
        System.out.println("1. Input Data Customer");
        System.out.println("2. Input Data Driver");
        System.out.println("3. Input Data Kendaraan");
        System.out.println("4. Input Data Tarif");
        System.out.println("5. Print Out");
        System.out.println("========== Gojek Mojokerto ==========");
    }
}