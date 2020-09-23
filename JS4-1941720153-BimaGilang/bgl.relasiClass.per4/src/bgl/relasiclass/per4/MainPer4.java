
package bgl.relasiclass.per4;
/**
 * BimaGilangL
 */
public class MainPer4 {
    public static void main (String[] args){
        Penumpang p = new Penumpang ("1234", "Mr.Krab");
        Gerbong gerbong = new Gerbong ("A", 10);
        gerbong.setPenumpang(p, 1);
        System.out.println(gerbong.info());
        
        Penumpang Budi = new Penumpang ("1941720153","Budi");
        gerbong.setPenumpang(Budi, 1);
        System.out.println(gerbong.info());
    }
}
