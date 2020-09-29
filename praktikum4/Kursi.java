package ronaldo.relasiclass.percobaan4;

/**
 *
 * @author Bedman
 */
public class Kursi {
   String nomor;
   Penumpang penumpang;
   
   Kursi(){
       
   }
   Kursi(String Nomor){
       nomor=Nomor;
   }
    public void setNomor(String Nomor) {
        nomor = Nomor;
    }
     public void setPenumpang(Penumpang Penumpang) {
        penumpang = Penumpang;
    }
     public String getNomor() {
        return nomor;
    }
     public Penumpang getPenumpang() {
        return penumpang;
    }
     public String info() {
        String info = "";
        info += "Nomor Kursi: " + nomor+"\n";
         if (this.penumpang!=null) {
              info += "Penumpang: " + penumpang.info()+"\n";
         }
       
        return info;
    }
}
