package Percobaan2;
public class Main {
    public static void main(String[] args) {
        Mobil m = new Mobil();
        m.setmerk("Jeep");
        m.setbiaya(800000);
        Sopir s = new Sopir();
        s.setnama("Hendra");
        s.setbiaya(400000);
        Pelanggan p = new Pelanggan();
        p.setnama("Tony");
        p.setmobil(m);
        p.setsopir(s);
        p.sethari(3);
        System.out.println("Biaya total = "+ p.hitungbiayaTotal());
        System.out.println(p.getmobil().getmerk());
    }
}
