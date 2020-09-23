
package bgl.relasiclass.tgs;
/**
 * BimaGilangL
 */
public class Penumpang {
    private String nama, ktp;
    private int kuota;
    private Tujuan tujuan;
    private Pemandu pemandu;
        Penumpang (String nama, String ktp, int kuota, Tujuan tujuan, Pemandu pemandu){
            this.nama = nama;
            this.ktp = ktp;
            this.kuota = kuota;
            this.tujuan = tujuan;
            this.pemandu = pemandu;
        }
        public void setNama(String nama){
            this.nama = nama;
        }
        public String getNama(){
            return nama;
        }
        public void setKtp(String ktp){
            this.ktp = ktp;
        }
        public String getKtp(){
            return ktp;
        }
        public void setKuota(int kuota){
            this.kuota = kuota;
        }
        public int getKuota(){
            return kuota;
        }
        public void setTujuan (Tujuan tujuan){
            this.tujuan = tujuan;
        }
        public Tujuan getTujuan(){
            return tujuan;
        }
        public void setPemandu (Pemandu pemandu){
            this.pemandu = pemandu;
        }
        public Pemandu getPemandu(){
            return pemandu;
        }
        public void hitungKuota (int kuota){
            if(kuota > tujuan.getKuota()){
                System.out.println("Maaf kuota telah mencapai maksimum :*");
                System.exit(0);
            } else {
                tujuan.hitungKuota(kuota);
            }
        }
        public int hitungBiaya (int kuota){
            return kuota*tujuan.getKuota();
        }
        public void info (){
            tujuan.info();
            System.out.println("XXXXX Data Penumpang XXXXX");
            System.out.println("Nama Pendaki \t\t: "+ nama);
            System.out.println("KTP\t\t\t: " + ktp);
            System.out.println("Jumlah Penumpang \t: "+kuota);
            int total = hitungBiaya(kuota);
                if (pemandu != null){
                    pemandu.info();
                    total += pemandu.getBiaya();
                }
                System.out.println("Total Biaya\t\t: Rp." + total);
        }
}
