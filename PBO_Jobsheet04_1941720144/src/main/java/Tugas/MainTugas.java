/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;
public class MainTugas {
    public static void main(String[] args) {
        Bank bank=new Bank("BRI");
        System.out.println("Nama Bank : "+bank.getNamaBank());
        Rekening noRek=new Rekening("12345");
        System.out.println("Nomor Rekening "+noRek.getnoRek());
        int tmp;
        Nasabah nasabah=new Nasabah("Ferguso");
        System.out.println("Nasabah bernama "+nasabah.getNama());
        nasabah.setTabungan(new Tabungan(100000));
        tmp=nasabah.getTabungan().getSaldo();
        System.out.println("Saldo Awal : "+tmp);
        nasabah.getTabungan().simpanUang(100000);
        System.out.println("Jumlah Uang Yang Disimpan 100000");
        tmp=nasabah.getTabungan().getSaldo();
        System.out.println("Saldo Sekarang= "+tmp);
    }
}
