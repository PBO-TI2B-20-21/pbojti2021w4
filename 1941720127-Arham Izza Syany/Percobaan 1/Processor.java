public class Processor {
    private String merk;
    private double cache;

    Processor(String merk,double cache){
        this.cache = cache;
        this.merk = merk;
    }

    Processor () {

    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerk(){
        return merk;
    }

    public void setCache(double cache) {
        this.cache = cache;
    }

    public double getCache(){
        return cache;
    }

    public void info() {
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Cache Memory = %.2f\n", cache);
    }
}
