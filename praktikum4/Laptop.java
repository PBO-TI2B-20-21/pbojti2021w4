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
public class Laptop {
    private String Merk;
    private Processor Proc;
    
    Laptop(){
        
    }
    Laptop (String merk, Processor proc){
        Merk=merk;
        Proc=proc;
    }
    public void setMerk(String merk){
        Merk=merk;
    }
    public Processor setProc(Processor proc){
       return Proc=proc;
    }
    public String getMerk(){
        return Merk;
    }
    public Processor getProc(){
        return Proc;
    }
    public void info (){
        System.out.println("Merk Laptop: "+Merk);
        Proc.info();
    }
}
