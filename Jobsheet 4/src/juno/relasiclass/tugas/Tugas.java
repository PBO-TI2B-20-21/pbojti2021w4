package juno.relasiclass.tugas;

public class Tugas {
    private int id;
    private String deskripsi;
    private Karyawan[] developer;
    private Karyawan manager;

    Tugas(int id, String deskripsi, int amount){
        this.id = id;
        this.deskripsi = deskripsi;
        init(amount);
    }

    public void init(int amount){
        developer = new Karyawan[amount];
        System.out.println(amount + "Developer berhasil ditambahkan !");
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

    public Karyawan[] getDeveloper() {
        return developer;
    }

    public void setDeveloper(Karyawan[] developer) {
        this.developer = developer;
    }

    public Karyawan getManager() {
        return manager;
    }

    public void setManager(Karyawan manager) {
        this.manager = manager;
    }

    public void addDeveloper(Karyawan karyawan){
        for(int i = 0; i < developer.length; i++){
            if(developer[i] == null){
                developer[i] = karyawan;
                System.out.println("Developer berhasil ditambahkan di slot !");
                break;
            }
        }
    }

    public String info(){
        String info ="";
        info += "ID Tugas : " + id + "\n";
        info += "Deskripsi Tugas: " + deskripsi + "\n";
        info += "Manager : " + manager.info() + "\n";
        info += "Developer : ";
        for (int i = 0; i < developer.length; i++){
            if(developer[i] != null){
                info += developer[i].info();
            }else {
                break;
            }
        }
        return info;
    }
}

