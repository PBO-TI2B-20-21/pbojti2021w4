package juno.relasiclass.tugas;

public class MainTugas {
    public static void main(String[] args) {
        Karyawan a = new Karyawan("456", "Sumanto", "082244244");
        Karyawan b = new Karyawan("123", "Rossi", "0822334334");
        Karyawan c = new Karyawan("789", "Marquez", "085332312");
        Klien k = new Klien("Juno", "0822435355");

        Tugas t = new Tugas(1, "Desain Interfaces", 5);
        Tugas o = new Tugas(2, "Fitur keamanan", 2);

        t.addDeveloper(a);
        t.addDeveloper(b);
        t.addDeveloper(c);
        t.setManager(b);
        t.setManager(c);

        Project pr = new Project(5432, "PT MotoGP Sentosa",k, 3);
        System.out.println();

        pr.addTugas(t);
        pr.addTugas(o);

        pr.tampilInfo();
    }
}
