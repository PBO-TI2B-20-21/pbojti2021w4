/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.id.polinema.jti.polinema;

/**
 *
 * @author Rafi Rachmawan
 */
public class processor {
    private String merk;
    private double cache;

    public processor(){
        
    }
    public processor(String merk, double cache) {
        this.merk = merk;
        this.cache = cache;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public void setCache(double cache) {
        this.cache = cache;
    }

    public double getCache() {
        return cache;
    }
    
    public void info(){
        System.out.printf("Merk Processor  : %s\n", merk);
        System.out.printf("Cache Memory    : %s\n", cache);
    }
}
