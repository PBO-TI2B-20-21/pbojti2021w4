public class Main {
    public static void main(String[] args) {
        Buku b = new Buku("Belajar Java", "Akira", "162400");
        Rak r = new Rak(12, b);

        Pegawai p = new Pegawai("102938", "Febri");
        Peminjam p2 = new Peminjam("Rian", "8769504162", 3);
        System.out.println("=====Data Buku=====");
        r.info();
        System.out.println(b.info());
        System.out.println("=====Data Pegawai=====");
        System.out.println(p.info());
        System.out.println("=====Data Peminjam=====: ");
        System.out.println(p2.info());

    }
}
