public class Laptop {

    private String merk;
    private Processor proc;

    Laptop(String merk,Processor proc){
        this.proc = proc;
        this.merk = merk;
    }
    Laptop (){

    }
    
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerk(){
        return merk;
    }

    public void setProc(Processor proc) {
        this.proc = proc;
    }

    public Processor getProc(){
        return proc;
    }

    public void info() {
        System.out.println("Merk Laptop = " + merk);
        proc.info();
    }
}