/**
 * Kendaraan
 */
public class Kendaraan {

    private String jenis, tipe, noplat;
    private Driver driver;

    public Kendaraan() {

    }

    public Kendaraan(String tipe, String jenis, String noplat, Driver driver) {
        this.jenis = jenis;
        this.noplat = noplat;
        this.tipe = tipe;
        this.driver = driver;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getNoplat() {
        return noplat;
    }

    public void setNoplat(String noplat) {
        this.noplat = noplat;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public String print() {
        String print = "";
        print += driver.print();
        print += "Tipe : " + tipe + "\n";
        print += "Jenis : " + jenis + "\n";
        print += "No. Plat : " + noplat + "\n";
        return print;
    }
}