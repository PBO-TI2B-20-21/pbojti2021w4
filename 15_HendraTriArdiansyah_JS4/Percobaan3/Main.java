package Percobaan3;
public class Main {
    public static void main(String[] args) {
        Pegawai masinis = new Pegawai("1234","DayatKaget");
        //Pegawai asisten = new Pegawai("5678","BojesAfi");
        KeretaApi keretaApi = new KeretaApi("Bangunkarta","Eksekutif",masinis);
        
        System.out.println(keretaApi.info());
    }
}
