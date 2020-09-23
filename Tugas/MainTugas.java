package Tugas;
import java.util.Scanner;
public class MainTugas {
    static Scanner sc = new Scanner(System.in);
    static int pil_makanan,pil_pelayanan,jumlah;   
    static String nama,cekkoki;
    static Makanan nasigoreng = new Makanan("Nasi Goreng",100);
    static Makanan soto = new Makanan("Soto",50);
    static Pelayanan nasgor_kecap = new Pelayanan("Nasi Goreng kecap",10000,100,nasigoreng);
    static Pelayanan nasgor_sambal = new Pelayanan("Nasi Goreng sambal",15000,100,nasigoreng);
    static Pelayanan soto_ayam = new Pelayanan("Soto Ayam",20000,50,soto);
    static Pelayanan soto_kambing = new Pelayanan("Soto Kambing",15000,50,soto);
    static Koki koki1= new Koki ("Upin", 40000);
    static Pelayanan pelayanan = null;
    static Koki koki = null; 
    
    public static void main(String[] args) {
        
        menu();
        if (pil_makanan == 1) {
            if (pil_pelayanan == 1) {
                pelayanan = nasgor_kecap;
            }else if (pil_pelayanan == 2){
               pelayanan = nasgor_sambal;
            }
        }else if (pil_makanan == 2) {
            if (pil_pelayanan == 1) {
                pelayanan = soto_ayam;
            }else if (pil_pelayanan == 2) {
                pelayanan = soto_kambing;
            }
        }
        Pelanggan p1 = new Pelanggan(nama,jumlah,pelayanan,koki);
        p1.hitungStok(jumlah);
        p1.info();
    }       

            public static void menu(){
            System.out.println("\n=====Pilih Makanan====");
            System.out.println("1. Nasi Goreng");
            System.out.println("2. Soto");
            System.out.print("Pilih Makanan = ");
            pil_makanan = sc.nextInt();
            
            System.out.println("\n=====Pilih Rasa=====");
            switch (pil_makanan){
                case 1: 
                    System.out.println("1. Nasi Goreng Kecap");
                    System.out.println("2. Nasi Goreng Sambal");
                    break;
                case 2:
                    System.out.println("1. Soto Ayam");
                    System.out.println("2. Soto Kambing");
                    break;
            }
            System.out.print("Masukkan Pelayanan = ");
            pil_pelayanan = sc.nextInt();
            sc.nextLine();
            
            System.out.println("\n=====Pelanggan=====");
            System.out.print("Masukkan nama\t\t : ");
            nama= sc.next();
            System.out.print("Jumlah Pesanan\t\t : ");
            jumlah=sc.nextInt();
  
            
        }
}

