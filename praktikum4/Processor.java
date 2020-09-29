/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ronaldo.relasic.percobaan1;

/**
 *
 * @author Bedman
 */
public class Processor {
    private String Merk;
    private double Cache;
    
    Processor(){
        
    }
    Processor(String merk,double cache){
        Merk=merk;
        Cache=cache;
    }
    public void setMerk(String merk){
        Merk=merk;
    }
    public void setCache(double cache){
        Cache=cache;
    }
    public String getMerk(){
        return Merk;
    }
    public double getCache(){
        return Cache;
    }
    public void info (){
        System.out.println("Merk Processor: "+Merk);
        System.out.println("Cache Memory: "+Cache);
    }
   
}
