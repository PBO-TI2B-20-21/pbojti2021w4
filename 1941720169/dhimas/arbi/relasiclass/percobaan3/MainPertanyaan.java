package dhimas.arbi.relasiclass.percobaan3;

/**
 *
 * @author Dhimas.Arbi
 */
public class MainPertanyaan {
    public static void main(String[] args) {
        Pegawai masinis = new Pegawai("1234", "Spongebob Squarepants");
        KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis);
        
        System.out.println(keretaApi.info());
    }
}
