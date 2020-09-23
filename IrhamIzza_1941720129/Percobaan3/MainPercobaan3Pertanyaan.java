package Percobaan3;
public class MainPercobaan3Pertanyaan {
    public static void main(String[] args) {
        Pegawai masinis = new Pegawai("1234", "Spongebob Squarepants"); 
        System.out.println(masinis.info());
        KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", 
        masinis); 

        System.out.println(keretaApi.info()); 

    }
}
