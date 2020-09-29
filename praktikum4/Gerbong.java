/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ronaldo.relasiclass.percobaan4;

/**
 *
 * @author Bedman
 */
public class Gerbong {
    String kode;
    Kursi[] arrayKursi;
    int x = 0;
    
    Gerbong(){
        
    }
    Gerbong(String Kode,int jumlah){
     kode=Kode;
     arrayKursi=new Kursi[jumlah];
     initKursi();
    }
    private void initKursi(){
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i]=new Kursi(String.valueOf(i+1));
        }
    }
    public String info() {
        String info = "";
       
                info += "Kode Gerbong: " + kode+"\n";
                Kursi kursi = arrayKursi[x];
                    info += kursi.info();
                    x++;
            
         return info;
    }
    public void setPenumpang(Penumpang penumpang, int nomor){
        for (int i = 0; i < arrayKursi.length; i++) {
            if (arrayKursi[i].getPenumpang() == null) {
                this.arrayKursi[i].setPenumpang(penumpang);
                break;
            } 
        }
    }
}

