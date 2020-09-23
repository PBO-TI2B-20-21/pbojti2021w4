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
public class MataKuliah {
    private String kodeMatkul;
    private String namaMatkul;
    private Mahasiswa mahasiswa;
    private Dosen dosen;
    private RuangKelas ruangkelas;
    
    public MataKuliah(String kodeMatkul, String namaMatkul){
        this.kodeMatkul=kodeMatkul;
        this.namaMatkul=namaMatkul;
    }
    
    MataKuliah(String kodeMatkul, String nama, Mahasiswa mahasiswa, Dosen dosen, RuangKelas ruangkelas){
        this.kodeMatkul=kodeMatkul;
        this.namaMatkul=namaMatkul;
        this.mahasiswa=mahasiswa;
        this.dosen=dosen;
        this.ruangkelas=ruangkelas;
    }

    MataKuliah() {
    }
    
    public void setkodeMatkul(String kodeMatkul){
        this.kodeMatkul=kodeMatkul;
    }
    public String getkodeMatkul(){
        return kodeMatkul;
    }
    public void setnamaMatkul(String namaMatkul){
        this.namaMatkul=namaMatkul;
    }
    public String getnamaMatkul(){
        return namaMatkul;
    }
    public void setmahasiswa(Mahasiswa mahasiswa){
        this.mahasiswa=mahasiswa;
    }
    public Mahasiswa getmahasiswa(){
        return mahasiswa;
    }
    public void setdosen(Dosen dosen){
        this.dosen=dosen;
    }
    public Dosen getdosen(){
        return dosen;
    }
    public void setruang(RuangKelas ruangkelas){
        this.ruangkelas=ruangkelas;
    }
    public RuangKelas getruang(){
        return ruangkelas;
    }
    public void info(){
        System.out.println("Kode Mata Kuliah: "+kodeMatkul);
        System.out.println("Nama Mata Kuliah: "+namaMatkul+"\n");
        System.out.println("Dosen \n"+this.dosen.info()+"\n");
        System.out.println("Mahasiswa \n"+this.mahasiswa.info()+"\n");
        System.out.println(this.ruangkelas.info());
    }
}
