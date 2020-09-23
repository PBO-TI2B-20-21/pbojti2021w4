/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nadaalya.relasiclass.percobaan1;

/**
 *
 * @author Nada Alya
 */
public class Processor {
    private String merk;
    private double cache;
    
    Processor() {
}
    
    Processor(String merk, double cache) {
    this.merk = merk;
    this.cache = cache;
    }
    
    public void setMerk(String merk) {
    this.merk = merk;
    }
    
    public void setCache(double cache) {
    this.cache = cache;
    }
    
    public String getMerk() {
    return merk;
    }
    
    public double getcache() {
    return cache;
    }
    
    public void info() {
        System.out.printf("Merk processor = %s\n", merk);
        System.out.printf("Cache memory = %.2f\n", cache);
    }
}
