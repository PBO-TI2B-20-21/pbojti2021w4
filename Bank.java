package nasabah.bank;
public class Bank {
    private int kodeBank;
    private String namaBank;
    
    Bank() {
        
    }
    public void setKodeBank(int kodeBank){
        this.kodeBank = kodeBank;
    }
    public int getKodeBank() {
        return kodeBank;
    }
    public void setNamaBank(String nama) {
        this.namaBank = nama;
    }
    public String getNamaBank() {
        return namaBank;
    }
    public void tampilData() {
        System.out.println("Kode Bank: " + kodeBank);
        System.out.println("Nama Bank: " + namaBank);
        System.out.println("=========================");
    }
}
