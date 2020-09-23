package Tugas;
public class Koki {
    private String nama;
    private int gaji;
    
    Koki(String nama,int gaji){
        this.nama = nama;
        this.gaji = gaji;
    }
    
    public void setNama(String nama){
        this.nama = nama ;
    }
    public void setGaji(int gaji){
        this.gaji = gaji;
    }
    public String getNama(){
        return nama;
    }
    public int getGaji(){
        return gaji;
    }
    public void info(){
        System.out.println("Nama Koki\t\t: "+ nama);
        System.out.println("Gaji\t\t\t: "+ gaji);
    }
}

