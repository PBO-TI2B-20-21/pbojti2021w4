/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet4_1941720047.Percobaan1;

/**
 *
 * @author ASUS
 */
public class Processor {

    private String merk;
    private double cache;

    Processor(String merk, double cache) {
        this.merk = merk;
        this.cache = cache;
    }

    Processor() {

    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setCache(double chace) {
        this.cache = cache;
    }

    public String getMerk() {
        return merk;
    }

    public double getCache() {
        return cache;
    }

    public void info() {
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Cache Memory = %.2f\n", cache);
    }

}
