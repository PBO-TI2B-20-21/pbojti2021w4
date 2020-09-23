package nasabah.bank;
public class Nasabah {
    private String nama;
    private String noRekening;
    private String ktp;
    private double saldo;
    
    Nasabah() {
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setNoRekening(String noRekening) {
        this.noRekening = noRekening;
    }
    public String getNoRekening() {
        return noRekening;
    }
    public void setKtp(String ktp) {
        this.ktp = ktp;
    }
    public String getKtp() {
        return ktp;
    }
    public void setSaldo(int saldo) {
        this.saldo =  saldo;
    }
     public double getSaldo() {
        return saldo;
    }
    public String getNama() {
        return nama;
    }
    public void tampilData() {
        System.out.println("Nama: " +nama);
        System.out.println("Nomor Rekening: " +noRekening);
        System.out.println("KTP: " +ktp);
        System.out.println("Saldo: " +saldo);
        System.out.println("=================================");
    }
}