package Day3.Bt1;

public class Sdt {
    private String numberSdt;

    public Sdt(){

    }
    public Sdt(String numberSdt) {
        this.numberSdt = numberSdt;
    }

    public String getNumberSdt() {
        return numberSdt;
    }

    public void setNumberSdt(String numberSdt) {
        this.numberSdt = numberSdt;
    }

    @Override
    public String toString() {
        return "Sdt:" + numberSdt ;
    }
}
