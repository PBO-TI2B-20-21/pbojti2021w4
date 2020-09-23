public class Rak {
    private Buku buku;
    private int nomor;
    
    Rak(){
        
    }
    Rak(int nomor, Buku buku){
        this.buku = buku;
        this.nomor = nomor;
    }
    public void setNomor(int nomor){
        this.nomor = nomor;
    }
    public int getNomor(){
        return nomor;
    }
    public void setBuku(Buku buku){
        this.buku = buku;
    }
    public Buku getBuku(){
        return buku;
    }
    public void info(){
        System.out.println("Jenis : "+buku);
        buku.info();
    }
}
