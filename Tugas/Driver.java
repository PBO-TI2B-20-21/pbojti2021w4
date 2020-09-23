/**
 * Driver
 */
public class Driver {

    private String nama;
    private Customer customer;

    public Driver(){

    }

    public Driver(String nama, Customer customer){
        this.nama = nama;
        this.customer = customer;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public String print(){
        String print = "";
        print += customer.print();
        print += "Nama Driver : " + nama + "\n";
        return print;
    }
}