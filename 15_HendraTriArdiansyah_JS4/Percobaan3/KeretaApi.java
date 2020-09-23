package Percobaan3;
public class KeretaApi {
    private String nama;
    private String kelas;
    private Pegawai masinis;
    private Pegawai asisten;
    public KeretaApi(String nm, String kls, Pegawai msns){
        this.nama = nm;
        this.kelas = kls;
        this.masinis = msns;
    }
    public KeretaApi(String nam, String kel, Pegawai ms, Pegawai ass){
        this.nama = nam;
        this.kelas = kel;
        this.masinis = ms;
        this.asisten = ass;
    }public String getnama(){
        return nama;
    }public String getkelas(){
        return kelas;
    }public Pegawai getMasinis(){
        return masinis;
    }
    public Pegawai getAsisten(){
        return asisten;
    }public void setNama(String nama){
        this.nama = nama;
    }public void setKelas(String kelas){
        this.kelas = kelas;
    }public void setMasinis(Pegawai masinis){
        this.masinis = masinis;
    }public void setAsisten(Pegawai asisten){
        this.asisten = asisten;
    }public String info(){
        String info = " ";
        info += "Nama: "+this.nama+"\n";
        info += "Kelas: "+this.kelas+"\n";
        info += "Masinis: "+this.masinis.info()+"\n";
        //info += "Asisten: "+this.asisten.info()+"\n";
        return info;
        
    }
}
