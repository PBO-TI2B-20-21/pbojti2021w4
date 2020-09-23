package juno.relasiclass.tugas;

public class Project {
    private int id;
    private String deskripsi;
    private Klien klien;
    private Tugas[] tugas1;

    Project(int id, String deskripsi, Klien klien, int amount){
        this.id = id;
        this.deskripsi = deskripsi;
        this.klien = klien;
        init(amount);
    }

    private void init(int amount){
        tugas1 = new Tugas[amount];
        System.out.println(amount + " Banyak tugas berhasil ditambahkan");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public Klien getKlien() {
        return klien;
    }

    public void setKlien(Klien klien) {
        this.klien = klien;
    }

    public Tugas[] getTugas() {
        return tugas1;
    }

    public void setTugas(Tugas[] tugas) {
        this.tugas1 = tugas;
    }

    public void addTugas(Tugas tugas){
        for(int i = 0; i < tugas1.length; i++){
            if (tugas1[i] == null){
                tugas1[i] = tugas;
                System.out.println("Tugas berhasi ditambahkan");
            }
        }
    }

    public void tampilInfo(){
        System.out.println("ID Project: " + id);
        System.out.println("Deskripsi: " + deskripsi);
        System.out.println("Klien: " + klien.info());
        System.out.println("Tugas : ");
        for (int i = 0; i < tugas1.length; i++){
            if (tugas1[i] != null){
                System.out.println(tugas1[i].info());
            }
        }
    }
}
