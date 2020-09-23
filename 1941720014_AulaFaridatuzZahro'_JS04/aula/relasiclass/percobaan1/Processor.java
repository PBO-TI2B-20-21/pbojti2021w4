package aula.relasiclass.percobaan1;

/**
 *
 * @author Aulafz
 */
public class Processor {

    private String merk;
    private double cache;

    Processor() {
    }

    Processor(String m, double c) {
        this.merk = m;
        this.cache = c;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public double getCache() {
        return cache;
    }

    public void setCache(double cache) {
        this.cache = cache;
    }

    public void info() {
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Cache Memory = %.2f\n", cache);
    }
}
