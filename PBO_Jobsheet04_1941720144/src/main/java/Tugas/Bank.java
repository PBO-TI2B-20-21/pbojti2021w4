/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;
public class Bank {
    private String namaBank;

    Bank(String namaBank){
        this.namaBank=namaBank;
    }

    Bank(){
    }

    public void setNamaBank(String namaBank){
        this.namaBank=namaBank;
    }

    public String getNamaBank(){
        return namaBank;
    }  

    public void info() {
        System.out.printf("Nama Bank = "+namaBank);
    }
}
