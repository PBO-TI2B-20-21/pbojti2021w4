/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WINDOWS 10
 */
public class Processor {

    private String merk;
    private double cache;

    Processor(String merk, double chache) {
        this.merk = merk;
        this.cache = chache;
    }

    Processor() {

    }

    public void setMerk(String merk) {
        this.merk = merk;
    }
    public void setCache(double cache) {
        this.cache = cache;
    }
    public String getMerk(){
        return merk;
    }
    public double getCache(){
        return cache;
    }
    public void info(){
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Cache Memory = %.2f\n", cache);
    }
}
