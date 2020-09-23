package nasabah.bank;
public class Rekening {
    private String noRekening;
    private double saldoAwal;
    private double saldoAkhir;
    
    Rekening() {
    }
    public void setNoRekening(String noRekening) {
        this.noRekening = noRekening;
    }
    public String getNoRekening() {
        return noRekening;
    }
    public void setSaldoAwal(double saldo) {
        this.saldoAwal = saldo;
    }
    public double getSaldoAwal() {
        return saldoAwal;
    }
    public void setSaldoAkhir(double saldoAkhir) {
        this.saldoAkhir = saldoAkhir;
    }
    public double getSaldoAkhir() {
        return saldoAkhir;
    }
    public void tampilData() {
        System.out.println("Nomor Rekening: " +noRekening);
        System.out.println("Saldo Awal: " +saldoAwal);
        System.out.println("Saldo Akhir: " +saldoAkhir);
        System.out.println("===============================");
    }
}