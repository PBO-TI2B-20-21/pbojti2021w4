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
public class laptop {
    private String merk;
    private processor proc;
    
    public laptop(){
        
    }
    public laptop(String merk, processor proc) {
        this.merk = merk;
        this.proc = proc;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public void setProc(processor proc) {
        this.proc = proc;
    }

    public processor getProc() {
        return proc;
    }
    
    public void info(){
        System.out.println("Merk Laptop     : " + merk);
        proc.info();
    }
}
