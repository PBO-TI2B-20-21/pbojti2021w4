package nasabah.bank;
public class BankMain {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.setKodeBank(1002);
        b.setNamaBank("Bank BPRS");
        b.tampilData();
        
        Pegawai p = new Pegawai();
        p.setNama("Junaidi"); 
        p.setNama("Suparman");
        p.setNip("123456");
        p.setJabatan("Teller");
        p.tampilData();
        
        Nasabah m = new Nasabah();
        m.setNama("Kotijah");
        m.setNoRekening("1841720064"); 
        m.setKtp("132145167899"); 
        m.setSaldo(3500000);
        m.tampilData();
        
        Rekening s = new Rekening();
        s.setNoRekening("1122334455");
        s.setSaldoAwal(5000000);
        s.setSaldoAkhir(3000000);
        s.tampilData();
        
    }
}