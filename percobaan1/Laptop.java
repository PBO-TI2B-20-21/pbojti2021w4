/**
 * Laptop
 */
public class Laptop {
    private String merk;
    private Processor pro;

    public Laptop(){
    
    }
    public Laptop(String merk,Processor pro){
        this.merk = merk;
        this.pro = pro;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public void setPro(Processor pro) {
        this.pro = pro;
    }
    public void info(){
        System.out.println("Merk Laptop= "+merk);
        pro.info();
    }
    
}
