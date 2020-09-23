package Tugas;
public class MainTugas {
    public static void main(String[] args) {
   
         Petani p = new Petani();
         p.setJenis("Bramu");
         p.setBiaya(12000);
         Tengkulak t = new Tengkulak();
         p.setJenis("Bramu + serang");
         t.setBiaya(24000);
         Penjual pe = new Penjual();
         pe.setJenis("Bramu+Serang+Enak");
         pe.setBiaya(36000);
         Pembeli pl = new Pembeli();
         pl.setjumlah_padi(5);
         System.out.println("Biaya total = "+pl.hitungBiayaTotal());
    }
   
    
}
