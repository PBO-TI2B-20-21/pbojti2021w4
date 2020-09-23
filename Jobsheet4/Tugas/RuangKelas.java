/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet4.Tugas;

/**
 *
 * @author DEBORA
 */
public class RuangKelas {
    private String kodekelas;
    
    RuangKelas(String kodekelas){
        this.kodekelas=kodekelas;
    }
    public void setkode(String kodekelas){
        this.kodekelas=kodekelas;
    }
    public String getkode(){
        return kodekelas;
    }
    public String info(){
        String info ="";
        info+="Kode Kelas: "+kodekelas+"\n";
        return info;
    }
}

