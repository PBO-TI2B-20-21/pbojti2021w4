package aula.relasiclass.tugas;

/**
 *
 * @author Aulafz
 */
public class Customer {

    private String idCust;
    private String nama;

    public Customer(String idCust, String nama) {
        this.idCust = idCust;
        this.nama = nama;
    }

    public String getIdCust() {
        return idCust;
    }

    public void setIdCust(String idCust) {
        this.idCust = idCust;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String info() {
        String info = "";
        info += "Id             : " + idCust + "\n";
        info += "Nama           : " + nama;
        return info;
    }
}
