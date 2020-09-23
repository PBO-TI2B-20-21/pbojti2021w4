package Percobaan4;
public class Main {
    public static void main(String[] args) {
        Penumpang p = new Penumpang("2134","TohaMukena");
        Penumpang p1 = new Penumpang("2212","Budi");
        Gerbong gerbong = new Gerbong("A",10);
        gerbong.setPenumpang(p, 1);
        gerbong.setPenumpang(p1, 1);
        System.out.println(gerbong.info());
    }
}
