package dhimas.arbi.relasiclass.percobaan1;

/**
 *
 * @author Dhimas.arbi
 */
public class Laptop {

    private String merk;
    private Processor proc;

    Laptop() {

    }

    Laptop(String merk, Processor proc) {
        this.merk = merk;
        this.proc = proc;
    }

    public void info() {
        System.out.println("Merk Laptop = " + merk);
        proc.info();
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setProc(Processor p) {
        proc = p;
    }
}
