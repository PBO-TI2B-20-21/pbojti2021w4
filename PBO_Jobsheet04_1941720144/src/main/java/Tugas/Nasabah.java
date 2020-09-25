/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;
public class Nasabah {
    private String nama;
    private Tabungan tabungan;
    
    public Nasabah(String nama){
        this.nama=nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public Tabungan getTabungan(){
        return tabungan;
    }
    
    public void setTabungan(Tabungan tabungan){
        this.tabungan=tabungan;
    }
}
