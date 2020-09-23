package Oscar.relasiclass.percobaan1;
public class Laptop {
    private String merk;
    private Processor proc;
    Laptop() {

    }

    public Laptop(String Merk, Processor Proc) {
        this.merk = Merk;
        this.proc = Proc;
    }
public void setMark(String Merk){
    this.merk=Merk;
}
public void setProc(Processor Proc){
this.proc = Proc;
}
public String getMerk(){
return merk;
}
public Processor getproc(){
return proc;
}
    public void info() {
        System.out.println("Merk Laptop =" + merk);
        proc.info();
    }
}
