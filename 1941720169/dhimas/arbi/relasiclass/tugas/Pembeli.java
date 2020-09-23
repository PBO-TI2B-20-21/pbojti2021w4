package dhimas.arbi.relasiclass.tugas;

/**
 *
 * @author dhimas arbi
 */
public class Pembeli {
    private String id, nama;
    
    Pembeli(String id, String nama){
        this.id = id;
        this.nama = nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
    public void setId(String Id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String info(){
        String info = "";
        info += "ID: "+id+"\n";
        info += "Nama: "+nama+"\n";
        return info;
    }
    
}
