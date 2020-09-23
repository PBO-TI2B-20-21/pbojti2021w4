package Percobaan4;
public class Gerbong {

    private String kode;
    private Kursi[] arrayKursi;

    Gerbong(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }

    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }

    private void setKode(String kode) {
        this.kode = kode;
    }

    private String getKode() {
        return kode;
    }
    
//   public void setPenumpang(Penumpang penumpang, int nomor) {
//        this.arrayKursi[nomor - 1].setPenumpang(penumpang);
//   }
    public void setPenumpang(Penumpang penumpang, int nomor) {
        int index = nomor =1;
        if(arrayKursi[index].getPenumpangan() != null){
            System.out.println("Kursi telah terisi, silahkan pilih kursi lain!");
        }else{
            this.arrayKursi[index].setPenumpang(penumpang);
        }
    }
    private Kursi[] getArrayKursi() {
        return arrayKursi;
    }
    
    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi kursi : arrayKursi) {
            info += kursi.info();
        }
        return info;
    }
}