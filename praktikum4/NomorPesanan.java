package tugasjobsheet4;

/**
 *
 * @author Bedman
 */
public class NomorPesanan {
    String kodePesan;
   Pembeli pembeli;
   
   NomorPesanan(){
       
   }
   NomorPesanan(String Kopes){
       kodePesan=Kopes;
   }
    public void setKopes(String Kopes) {
        kodePesan = Kopes;
    }
     public void setPembeli(Pembeli Pembeli) {
        pembeli = Pembeli;
    }
     public String getKopes() {
        return kodePesan;
    }
     public Pembeli getPembeli() {
        return pembeli;
    }
     public String info() {
        String info = "";
        info += "Kode Paket: " + kodePesan+"\n";
         if (this.pembeli!=null) {
              info += "====NOTA PEMBELI===="+"\n" 
                      + pembeli.info()+"\n";
         }
       
        return info;
    }
}
