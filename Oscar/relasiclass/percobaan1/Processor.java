/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oscar.relasiclass.percobaan1;

/**
 *
 * @author USER
 */
public class Processor {
    private String merk;
    private double cache;
    
public Processor(){
}

Processor(String Merk,double Cache){
   this. merk=Merk;
   this. cache=Cache;
}
public void setMerk(String Merk){
this.merk = Merk;
}
public void setCache(double Cache){
this.cache=Cache;
}
public String getMerk(){
    return merk;
}
public double getCache(){
return cache;
}
public void info(){
    System.out.printf("Merk Processor = %s\n",merk);
    System.out.printf("Cache Memory = %s\n",cache);
}
}
