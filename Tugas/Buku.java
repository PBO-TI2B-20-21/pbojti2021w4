public class Buku {
    private String judul;
    private String pengarang;
    private String nomor;
    
    Buku(){
        
    }
    Buku(String judul, String pengarang, String nomor){
        this.judul = judul;
        this.nomor = nomor;
        this.pengarang = pengarang;
    }
    public void setJudul(String judul){
        this.judul= judul;
    }
    public String getJudul(){
        return judul;
    }
    public void setPengarang(String pengarang){
        this.pengarang = pengarang;
    }
    public String getPengarang(){
        return pengarang;
    }
    public void setNomor(String nomor){
        this.nomor = nomor;
    }
    public String info(){
        String info = "";
        info += "Judul : "+this.judul + "\n";
        info += "Nomor Buku : " +this.nomor + "\n";
        info += "Pengarang : "+ this.pengarang + "\n";
        return info;
    }
}
