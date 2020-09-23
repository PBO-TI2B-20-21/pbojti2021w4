package tugas;

public class Tipe {
    private int jenis;

    public Tipe(int jenis) {
        this.jenis = jenis;
    }

    public Tipe() {
    }

    public int getJenis() {
        return jenis;
    }

    public void setJenis(int jenis) {
        this.jenis = jenis;
    }
   
   public void jenisKamar(){
       switch (jenis){
           case 1:
                System.out.println("Jenis : ");
                System.out.println("Fasilitas : ");
                System.out.println("1.Kasur");
                System.out.println("2. Lemari");
                System.out.println("3.Kamar Mandi dalam");
                System.out.println("Rp 10.000.000");
             break;
            case 2:
                System.out.println("Jenis : ");
                System.out.println("Fasilitas :");
                System.out.println("1.Kasur");
                System.out.println("2. Lemari");
                System.out.println("4. Kamar Mandi luar");
                System.out.println("Rp 7.000.000");
                break;
             default:
                System.out.println("anda harus memasukkan pilihan");
                break;   
               
       }
    
}
}
