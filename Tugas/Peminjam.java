public class Peminjam {
    private String ktp;
    private String nama;
    private int hari;
   
    Peminjam(String ktp, String nama, int hari){
        this.ktp = ktp;
        this.nama = nama;
        this.hari = hari;
    }

    Peminjam() {
       
    }
    public void setKtp(String ktp){
        this.ktp = ktp;
    }
    public String getKtp(){
        return ktp;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public void setHari(int hari){
        this.hari = hari;
    }
    public int getHari(){
        return hari;
    }
    public String info(){
        String info = "";
        info += "Nomor KTP : "+this.ktp + "\n";
        info += "Nama : " +this.nama + "\n";
        info += "Jumlah Hari : "+ this.hari + "\n";
        return info;
    }
}
