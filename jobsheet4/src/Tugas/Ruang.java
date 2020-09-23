package Tugas;

public class Ruang {
    private String poli;

    Ruang(){

    }
    public Ruang(String poli){
        this.poli=poli;
    }
    public void setPoli(String poli){
        this.poli=poli;
    }
    public String getPoli(){
        return poli;
    }
    public String info() {
        String info = "";
        info += "Poli : " + this.poli + "\n";
        return info;
    }
}