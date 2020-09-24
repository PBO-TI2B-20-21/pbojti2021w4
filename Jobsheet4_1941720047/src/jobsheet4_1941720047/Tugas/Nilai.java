/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet4_1941720047.Tugas;

/**
 *
 * @author ASUS
 */
public class Nilai {
    private String nilai;
    private pelajaran pelajaran;
    private Murid murid;
    private Guru guru;
    public Nilai() {

    }

    public Nilai(String nilai, pelajaran pelajaran, Murid murid, Guru guru) {
        this.nilai = nilai;
        this.murid= murid;
        this.pelajaran = pelajaran;
        this.guru= guru;
    }

    Nilai(Murid mrd, pelajaran plj, Guru gr, String string) {
        
    }
    
    

    public void setNilai(String nilai) {
        this.nilai = nilai;
    }

    public void setPelajaran(pelajaran pelajaran) {
        this.pelajaran = pelajaran;
    }

    public void setMurid(Murid murid) {
        this.murid= murid;
    }
    
    public void setGuru(Guru guru) {
        this.guru= guru;
    }

    public String getNilai() {
        return nilai;
    }

    public pelajaran getPelajaran() {
        return pelajaran;
    }

    public Murid getMurid() {
        return murid;
    }
    
    public Guru getGuru() {
        return guru;
    }
    
    public String info() {
        String info = "";
        info += "Nama: " + this.murid + "\n";
        info += "Pelajaran: " + this.pelajaran+ "\n";
        info += "Nama Guru: " + this.guru +"\n";
        info += "Nilai: "+ this.nilai +"\n";
        return info;
    }
}
