/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan4;

/**
 *
 * @author Zidan
 */
public class Gerbong {
    private String kode;
    private Kursi[] arrKursi;

    public Gerbong(String kode,int jumlah){
        this.kode=kode;
        this.arrKursi=new Kursi[jumlah];
        this.initKrusi();
    }

    private void initKrusi(){
        for (int i=0;i<arrKursi.length; i++){
            this.arrKursi[i]=new Kursi(String.valueOf(i + 1));
        }
    }

    public void setKode(String kode){
        this.kode=kode;
    }

    public String getKode(){
        return kode;
    }

    public void setPenumpang(Penumpang penumpang, int nomor){
        int index=nomor=1;
        if (arrKursi[index].getPenumpang()!=null){
            System.out.println("Kursi Sudah Terisi, Carilah Kursi Lain!");
        }else{
            this.arrKursi[index].setPenumpang(penumpang);
        }
    }

    public void setArrayKursi(Kursi[]arrayKursi){
        this.arrKursi=arrayKursi;
    }

    public String info(){
        String info="";
        info+="Kode: "+kode+"\n";
        for(Kursi kursi :arrKursi){
            info+=kursi.info();
        }
        return info;
    }
}
