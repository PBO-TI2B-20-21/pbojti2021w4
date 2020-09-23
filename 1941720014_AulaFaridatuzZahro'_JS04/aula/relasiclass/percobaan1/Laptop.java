package aula.relasiclass.percobaan1;

/**
 *
 * @author Aulafz
 */
public class Laptop {

    private String merk;
    private Processor proc;

    public Laptop() {
    }

    public Laptop(String m, Processor p) {
        this.merk = m;
        this.proc = p;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public Processor getProc() {
        return proc;
    }

    public void setProc(Processor proc) {
        this.proc = proc;
    }
   
    public void info() {
        System.out.println("Merk Laptop = " + merk);
        proc.info();
    }

}
