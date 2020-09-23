
package bgl.relasiclass.per3;
/**
 * BimaGilangL
 */
public class MainPertanyaan {
    public static void main (String[] args){
        Pegawai masinis = new Pegawai ("1234", "Spongebob");
        KeretaApi keretaApi =  new KeretaApi ("Gaya Baru", "Bisnis", masinis);
        System.out.println(keretaApi.info());
    }
}
