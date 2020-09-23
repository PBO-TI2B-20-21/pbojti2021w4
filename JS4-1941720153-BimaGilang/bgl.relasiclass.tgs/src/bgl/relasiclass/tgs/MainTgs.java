
package bgl.relasiclass.tgs;
import java.util.Scanner;
/**
 * Bima Gilang L
 */
public class MainTgs {
    static Scanner sc = new Scanner(System.in);
    static int pilihan_Pesawat, pilihan_Tujuan, jumlah;
    static String nama, ktp, cekPemandu;
    static Pesawat Lion = new Pesawat("Lion",100);
    static Pesawat Garuda = new Pesawat("Garuda", 350);
    static Tujuan KDR_BL = new Tujuan("Kediri-Bali", 35000, 200, Lion);
    static Tujuan KDR_LBK = new Tujuan("Kediri-Lombok", 45000, 250, Garuda);
    static Tujuan KDR_JGJ = new Tujuan("Kediri-Jogja", 20000, 150, Lion);
    static Tujuan KDR_BND = new Tujuan("Kediri-Bandung", 25000, 300, Garuda);
    static Pemandu pemandu1 = new Pemandu ("SlametKarbit",650000);
    static Tujuan tujuan = null;
    static Pemandu pemandu = null;
    public static void menu(){
        System.out.println("Selamat Datang di Aplikasi Registrasi Penerbangan");
        System.out.println("\nXXXXX Daftar Pesawat XXXXX");
        System.out.println("1. Lion ");
        System.out.println("2. Garuda ");
        System.out.print("Pilih Nomor berapa : ");
        pilihan_Pesawat = sc.nextInt();
        
        System.out.println("\nXXXXX Daftar Tujuan XXXXX");
        switch (pilihan_Pesawat){
            case 1 :
                System.out.println("1. Kediri-Bali");
                System.out.println("2. Kediri-Jogja");
                break;
            case 2 :
                System.out.println("1. Kediri-Lombok");
                System.out.println("2. Kediri-Bandung");
                break;
            default :
                System.out.println("Pilihan kamu salah!!");
        }
        System.out.print("Masukan Tujuan : ");
        pilihan_Tujuan = sc.nextInt();
        sc.nextLine();
        
        System.out.println("\nXXXXX Registrasi XXXXX");
        System.out.print("Masukan Nama               : ");
        nama=sc.nextLine();
        System.out.print("Masukan Nomor KTP          : ");
        ktp=sc.nextLine();
        System.out.print("Masukan Jumlah Rombongan   : ");
        jumlah=sc.nextInt();
        System.out.print("Ingin Gunakan Pemandu (y/n): ");
        sc.nextLine();
        cekPemandu = sc.nextLine();
    }
        public static void main(String[] args){
            menu();
            if(pilihan_Pesawat == 1 ){
                if(pilihan_Tujuan == 1){
                    tujuan = KDR_BL;
                } else if (pilihan_Tujuan == 2){
                    tujuan = KDR_JGJ;
                }
            } else if (pilihan_Pesawat == 2){
                if(pilihan_Tujuan == 1){
                    tujuan = KDR_LBK;
                } else if(pilihan_Tujuan == 2){
                    tujuan = KDR_BND;
                }
            }
            if(cekPemandu.equalsIgnoreCase("y")){
                
            }
            if(cekPemandu.equalsIgnoreCase("y")){
                pemandu = pemandu1;
            }
           Penumpang p1 = new Penumpang (nama, ktp, jumlah, tujuan, pemandu);
           p1.hitungKuota(jumlah);
           p1.info();
        }
}
