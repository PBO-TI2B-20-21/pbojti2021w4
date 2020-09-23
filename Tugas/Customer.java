/**
 * Customer
 */
public class Customer {

    private String nama;

    public Customer(){

    }

    public Customer(String nama){
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String print(){
        String print = "";
        print += "Nama Customer : " + nama + "\n";
        return print;
    }
}