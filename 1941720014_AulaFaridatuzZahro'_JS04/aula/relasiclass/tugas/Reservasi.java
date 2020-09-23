package aula.relasiclass.tugas;

/**
 *
 * @author Aulafz
 */
public class Reservasi {

    private String kode;
    private Customer customer;
    private Tanggal tanggal;
    private Film film;
    private Theater theater;

    public Reservasi(String kode, Customer customer, Tanggal tanggal, Film film, Theater theater) {
        this.kode = kode;
        this.customer = customer;
        this.tanggal = tanggal;
        this.film = film;
        this.theater = theater;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Tanggal getTanggal() {
        return tanggal;
    }

    public void setTanggal(Tanggal tanggal) {
        this.tanggal = tanggal;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Theater getTheater() {
        return theater;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }

    public String info() {
        String info = "";
        info += "Kode Reservasi : " + this.kode + "\n";
        info += this.customer.info() + "\n";
        info += "Tanggal        : " + this.tanggal.getTanggal() + "\n";
        info += this.film.info() + "\n";
        info += "Theater        : " + this.theater.getTeater() + "\n";

        return info;
    }
}
