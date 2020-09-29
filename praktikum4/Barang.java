
package tugasjobsheet4;

/**
 *
 * @author Bedman
 */
public class Barang {
    String plat;
    NomorPesanan[] arrayPesanan;
    int x = 0;
    
    Barang(){
        
    }
    Barang(String Plat,int jumlah){
     plat=Plat;
     arrayPesanan=new NomorPesanan[jumlah];
     initNomorPesanan();
    }
    private void initNomorPesanan(){
        for (int i = 0; i < arrayPesanan.length; i++) {
            this.arrayPesanan[i]=new NomorPesanan(String.valueOf(i+1));
        }
    }
    public String info() {
        String info = "";
       
                info += "Plat Nomor Kurir: " + plat+"\n";
                NomorPesanan nomor = arrayPesanan[x];
                    info += nomor.info();
                    x++;
            
         return info;
    }
    public void setPembeli(Pembeli pembeli, int kodePesan){
        for (int i = 0; i < arrayPesanan.length; i++) {
            if (arrayPesanan[i].getPembeli() == null) {
                this.arrayPesanan[i].setPembeli(pembeli);
                break;
            } 
        }
    }
}
