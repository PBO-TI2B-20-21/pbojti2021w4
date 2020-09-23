
package bgl.relasiclass.tgs;
/**
 * Bima Gilang L
 */
public class Tujuan {
    private String nama;
    private int tiket, kuota;
    private Pesawat pesawat;
        Tujuan (String nama, int tiket, int kuota, Pesawat pesawat){
            this.nama = nama;
            this.tiket = tiket;
            this.kuota = kuota;
            this.pesawat = pesawat;
        }
        public void setNama (String nama){
            this.nama = nama;
        }
        public String getNama (){
            return nama;
        }
        public void setTiket(int tiket){
            this.tiket = tiket;
        }
        public int getTiket(){
            return tiket;
        }
        public void setKuota(int kuota){
            this.kuota =  kuota;
        }
        public int getKuota(){
            return kuota;
        }
        public void setPesawat(Pesawat pesawat){
            this.pesawat = pesawat;
        }
        public Pesawat getPesawat(){
            return pesawat;
        }
        public void hitungKuota (int kuota){
            this.kuota -= kuota;
            pesawat.hitungKuota (kuota);
        }
        public void info(){
            pesawat.info();
            System.out.println("XXXXX Tujuan XXXXX");
            System.out.println("Nama jalur\t: "+nama);
            System.out.println("Kuota Tersisa\t: "+kuota);
            System.out.println("Harga Tiket\t: Rp."+tiket);
        }
}
