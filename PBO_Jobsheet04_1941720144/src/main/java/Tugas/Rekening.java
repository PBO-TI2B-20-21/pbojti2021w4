/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;
public class Rekening {
    private int noRek;
    private Bank bank;
    
    Rekening(int noRek, Bank bank){
        this.noRek=noRek;
        this.bank=bank;
    }

    Rekening(){
    }
    
    public void setnoRek(int noRek){
        this.noRek=noRek;
    }

 
    public int getnoRek(){
        return noRek;
    }

    public Bank getBank(){
        return bank;
    }

    public void info() {
        System.out.println("Nomor Rekening= "+noRek);
        bank.info();
    }
}
