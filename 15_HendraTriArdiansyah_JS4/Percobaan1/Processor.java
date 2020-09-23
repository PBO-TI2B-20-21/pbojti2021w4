package Percobaan1;
public class Processor {
    private String merk;
    private double cache;
    public Processor(){
    }
    public Processor(String mrk, double ca){
        merk = mrk;
        cache = ca;
    }
    public String getmerk(){
        return merk;
    }
    public double getcache(){
        return cache;
    }
    public void setmerk(String merk){
        this.merk = merk;
    }
    public void setcache(double cache){
        this.cache = cache;
    }
    public void info(){
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Cache Memory = %.2f\n", cache);
    }
    }
