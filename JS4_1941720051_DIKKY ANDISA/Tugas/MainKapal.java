/**
 * MainKapal
 */
public class MainKapal {

    public static void main(String[] args) {
        Penumpang p = new Penumpang("52341", "Bara");
        Kapal kapal = new Kapal("A10", 20);
        kapal.setPenumpang(p, 1);
        System.out.println(kapal.info());
        
        
        Pegawai nahkoda = new Pegawai("456721", "kuro");
        Pegawai asisten = new Pegawai("456731", "roro jongrang");
        Kapal p1 = new Kapal("KELUD 8888", "Tanjung Luar - Lombok Timur", nahkoda, asisten);
        System.out.println(p1.info1());
    }
}