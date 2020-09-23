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
public class Laptop {
    private String merk;
    private Processor proc;
    
    Laptop() {
    }
    
    Laptop(String merk, Processor proc) {
    this.merk = merk;
    this.proc = proc;
    }
    
    public void setMerk(String merk) {
    this.merk = merk;
    }
    
    public void setProc(Processor g) {
    this.proc = g;
    }
    
    public void info() {
        System.out.println("Merk laptop = " + merk);
        proc.info();
    }
}
