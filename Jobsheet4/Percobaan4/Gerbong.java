/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet4.Percobaan4;

/**
 *
 * @author DEBORA
 */
public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi;
    
    public Gerbong(String kode, int jumlah){
        this.kode=kode;
        this.arrayKursi=new Kursi[jumlah];
        this.initKursi();
    }
        private void initKursi(){
            for (int i=0; i<arrayKursi.length; i++){
                this.arrayKursi[i] = new Kursi(String.valueOf(i+1));
            }
        }
        
        public void setKode(String kode){
            this.kode=kode;
        }
        public String getkode(){
            return kode;
        }
        public void setpenumpang(Penumpang penumpang, int nomor){
            this.arrayKursi[nomor-1].setpenumpang(penumpang);
        }
        public void setarrayKursi(Kursi[] arrayKursi){
            this.arrayKursi=arrayKursi;
        }
        public String info(){
            String info ="";
            info+="Kode: "+kode+"\n";
            for(Kursi kursi:arrayKursi){
                info+=kursi.info();
            }
            return info;
        }
    }

