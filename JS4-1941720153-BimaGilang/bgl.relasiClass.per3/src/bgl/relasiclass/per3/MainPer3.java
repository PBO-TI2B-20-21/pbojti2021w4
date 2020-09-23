
package bgl.relasiclass.per3;
/**
 * BimaGilangL
 */
public class MainPer3 {
    public static void main (String[] args){
        Pegawai masinis = new Pegawai ("1234","Spongebob Squerepents");
        Pegawai asisten = new Pegawai ("4567","Patrick Star");
        KeretaApi keretaApi = new KeretaApi ("Gaya Baru","Bisnis", masinis, asisten);
        
        System.out.println(keretaApi.info());
    }
}
